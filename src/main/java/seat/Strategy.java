package seat;

import Baidu.Result;

import java.util.LinkedList;
import java.util.List;

/**
 * @author sawyer 2016/10/25上午11:54
 */
public class Strategy {

    public List<Result> isSameSex(List<Result> results){

        for(Result r  : results){



        }

        return null;

    }

    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        for(String s : list){

            if(s.equals("b")){

                list.remove(s);

            }

        }

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }

}
