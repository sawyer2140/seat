import Baidu.Request;
import seat.Math;
import seat.Person;
import seat.Result;
import seat.Zodiac;

import java.util.Collections;
import java.util.List;

/**
 * @author sawyer 2016/10/21上午11:52
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        Math seatMath = new Math();

        List<Result> results = seatMath.getCombo(person.init());

        Request request = new Request();


        List<Result> finalResult = request.fixZodiac(results);

        Collections.sort(finalResult);


        for(int i=0;i<finalResult.size();i++ ){

            System.out.println(finalResult.get(i).getFirstColleagues().getName()+
                    "和"+finalResult.get(i).getSecondColleagues().getName());
            System.out.println("Zodiac是:"+Zodiac.getName(finalResult.get(i).getFirstColleagues().getZodiac())+
                    "与"+Zodiac.getName((finalResult.get(i).getSecondColleagues().getZodiac())));
            System.out.println("得分是:"+finalResult.get(i).getTotal());
            System.out.println("========="+i+"=========");
        }


    }

}
