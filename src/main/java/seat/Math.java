package seat;

import org.apache.commons.math3.util.CombinatoricsUtils;

import java.util.ArrayList;
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

}
