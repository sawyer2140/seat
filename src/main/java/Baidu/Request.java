package Baidu;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * @author sawyer 2016/10/21下午12:43
 */
public class Request {

    public static String request(String httpUrl, String httpArg) {

        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        httpUrl = httpUrl + "?" + httpArg;

        System.out.println(httpUrl);

        try {

            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("apikey",BaiduConf.KEY.value);
            connection.connect();

            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = null;

            while ((strRead = reader.readLine()) != null) {

                sbf.append(strRead);

                sbf.append("\r\n");

            }

            reader.close();
            result = sbf.toString();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return result;
    }

    public HttpResult httpPostBaidu(String firstZodiac,String secondZodiac){

        String httpUrl = BaiduConf.APIURL.value;
        String httpArg = "me="+firstZodiac+"&he="+secondZodiac+"&all=1";
        String jsonResult = request(httpUrl, httpArg);

        System.out.println(jsonResult);
        return JSON.parseObject(jsonResult,HttpResult.class);

    }

    public int getTotal(HttpResult httpResult){

        String grade = httpResult.getNewslist().get(0).getGrade();
        int starAscii = 9733;

        int total = 0;

        for(Character c : grade.toCharArray()){

            if(Integer.valueOf(c)==starAscii){

                total ++;

            }

        }

        return total;

    }


    public List<Result> fixZodiac(List<Result> results){

        for(Result r : results){

            r.setTotal(getTotal(httpPostBaidu(r.getFirstZodiac(),r.getSecondZodiac())));

        }

        return results;

    }

}
