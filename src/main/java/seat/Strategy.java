package seat;

import java.util.*;

/**
 * @author sawyer 2016/10/25上午11:54
 */
public class Strategy {

    public List<Result> isSame(List<Result> results) {

        Iterator<Result> resultIterator = results.iterator();
        while (resultIterator.hasNext()) {

            Result r = resultIterator.next();

            if (r.getFirstColleagues().getSex().equals(Sex.GIRL) &&
                    r.getSecondColleagues().getSex().equals(Sex.GIRL)) {

                resultIterator.remove();

            } else if (r.getFirstColleagues().getIdentity().equals(Identity.PRODUCT) &&
                    r.getSecondColleagues().getIdentity().equals(Identity.PRODUCT)) {

                resultIterator.remove();

            }

        }

        return results;

    }
}
