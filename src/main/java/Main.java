import Baidu.Result;
import org.apache.commons.math3.util.CombinatoricsUtils;
import Baidu.Request;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sawyer 2016/10/21上午11:52
 */
public class Main {

    public List<Result> getCombo(List<Colleagues> colleagues){

        Iterator<int[]> iterator = CombinatoricsUtils.combinationsIterator(colleagues.size(),2);

        List<Result> results = new ArrayList<Result>();

        while (iterator.hasNext()){

            Result result = new Result();

            int[] indexs = iterator.next();
            result.setFirstZodiac(Zodiac.getName(colleagues.get(indexs[0]).getZodiac()));

            result.setSecondZodiac(Zodiac.getName(colleagues.get(indexs[1]).getZodiac()));

            result.setNames(colleagues.get(indexs[0]).getName() +","
                    +colleagues.get(indexs[1]).getName());

            result.setDesc(Zodiac.getName(colleagues.get(indexs[0]).getZodiac()) +","
                    +Zodiac.getName(colleagues.get(indexs[1]).getZodiac()));

            results.add(result);

        }

        return results;

    }



    public static void main(String[] args) {

        Main main = new Main();

        List<Result> results = main.getCombo(main.init());


        Request request = new Request();
        List<Result> finalResult = request.fixZodiac(results);

        Sort sort = new Sort();
        Result sortResult = sort.sort(finalResult);

        System.out.println("--->"+sortResult.getNames());


    }

}
