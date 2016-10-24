import Baidu.Result;

import java.util.List;

/**
 * @author sawyer 2016/10/21下午1:43
 */
public class Sort {

    public Result sort(List<Result> result) {

        Result tempResult = new Result();

        for (Result r : result) {

            if (r.getTotal() > tempResult.getTotal()) {

                tempResult.setSecondZodiac(r.getSecondZodiac());
                tempResult.setFirstZodiac(r.getFirstZodiac());
                tempResult.setTotal(r.getTotal());
                tempResult.setDesc(r.getDesc());
                tempResult.setNames(r.getNames());

            }

        }

        return tempResult;
    }

}
