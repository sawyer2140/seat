import Baidu.Request;
import seat.*;
import seat.Math;

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

        Strategy strategy = new Strategy();

        List<Result> finalResult = strategy.isSame(request.fixZodiac(results));

        Collections.sort(finalResult);


        for(int i=0;i<finalResult.size();i++ ){

            System.out.println(finalResult.get(i).getNames());
            System.out.println("Zodiac是:"+Zodiac.getName(finalResult.get(i).getFirstColleagues().getZodiac())+
                    "与"+Zodiac.getName((finalResult.get(i).getSecondColleagues().getZodiac())));
            System.out.println("得分是:"+finalResult.get(i).getTotal());
            System.out.println("========="+i+"=========");
        }


    }

}
