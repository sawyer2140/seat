package seat;

import Baidu.Request;
import org.apache.commons.math3.util.CombinatoricsUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author sawyer 2016/10/25下午12:10
 */
public class Math {

    public List<Result> getCombo(List<Colleagues> colleagues){

        Iterator<int[]> iterator = CombinatoricsUtils.combinationsIterator(colleagues.size(),2);

        List<Result> results = new ArrayList<Result>();

        while (iterator.hasNext()){

            Result result = new Result();

            int[] indexs = iterator.next();

            result.setFirstZodiac(Zodiac.getName(colleagues.get(indexs[0]).getZodiac()));
            result.setFirstColleagues(colleagues.get(indexs[0]));

            result.setSecondZodiac(Zodiac.getName(colleagues.get(indexs[1]).getZodiac()));
            result.setSecondColleagues(colleagues.get(indexs[1]));

            result.setNames(colleagues.get(indexs[0]).getName() +","
                    +colleagues.get(indexs[1]).getName());

            result.setDesc(Zodiac.getName(colleagues.get(indexs[0]).getZodiac()) +","
                    +Zodiac.getName(colleagues.get(indexs[1]).getZodiac()));

            results.add(result);

        }

        return results;

    }

    public void start() {

        Person person = new Person();
        List<Colleagues> colleagues =  person.init();

        while (true) {

            if(colleagues.size() <= 1){

                break;
            }

            Result lastResult = this.mathLastResult(colleagues);

            System.out.println(lastResult.getNames());
            System.out.println("Zodiac是:" + Zodiac.getName(lastResult.getFirstColleagues().getZodiac()) +
                    "与" + Zodiac.getName(lastResult.getSecondColleagues().getZodiac()));
            System.out.println("得分是:" + lastResult.getTotal());
            System.out.println("==================");

            colleagues = this.deleteColleague(colleagues,lastResult);

        }

    }

    public Result mathLastResult(List<Colleagues> colleagues) {

        Math seatMath = new Math();

        List<Result> results = seatMath.getCombo(colleagues);

        Request request = new Request();

        Strategy strategy = new Strategy();

        List<Result> finalResult = strategy.isSame(request.fixZodiac(results));

        Collections.sort(finalResult);

        Result lastResult = new Result();
        lastResult.setNames(finalResult.get(finalResult.size() - 1).getNames());

        Colleagues firstColleagues = new Colleagues();
        Colleagues secondColleagues = new Colleagues();

        firstColleagues.setIdentity(finalResult.get(finalResult.size() - 1).getFirstColleagues().getIdentity());
        firstColleagues.setName(finalResult.get(finalResult.size() - 1).getFirstColleagues().getName());
        firstColleagues.setSex(finalResult.get(finalResult.size() - 1).getFirstColleagues().getSex());
        firstColleagues.setZodiac(finalResult.get(finalResult.size() - 1).getFirstColleagues().getZodiac());

        secondColleagues.setIdentity(finalResult.get(finalResult.size() - 1).getSecondColleagues().getIdentity());
        secondColleagues.setName(finalResult.get(finalResult.size() - 1).getSecondColleagues().getName());
        secondColleagues.setSex(finalResult.get(finalResult.size() - 1).getSecondColleagues().getSex());
        secondColleagues.setZodiac(finalResult.get(finalResult.size() - 1).getSecondColleagues().getZodiac());

        lastResult.setFirstColleagues(firstColleagues);
        lastResult.setSecondColleagues(secondColleagues);
        lastResult.setTotal(finalResult.get(finalResult.size() - 1).getTotal());
        lastResult.setDesc(finalResult.get(finalResult.size() - 1).getDesc());
        lastResult.setFirstZodiac(finalResult.get(finalResult.size() - 1).getFirstZodiac());
        lastResult.setSecondZodiac(finalResult.get(finalResult.size() - 1).getSecondZodiac());




        return lastResult;

    }

    public List<Colleagues> deleteColleague(List<Colleagues> colleagues, Result lastResult) {

        Iterator<Colleagues> colleaguesIterator = colleagues.iterator();

        while (colleaguesIterator.hasNext()) {

            Colleagues coll = colleaguesIterator.next();

            if (lastResult.getFirstColleagues().getName().equals(coll.getName()) ||
                    lastResult.getSecondColleagues().getName().equals(coll.getName())) {

                colleaguesIterator.remove();

            }

        }

        return colleagues;
    }

}
