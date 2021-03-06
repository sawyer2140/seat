package seat;


/**
 * @author sawyer 2016/10/21下午12:19
 */
public class Result implements Comparable<Result> {

    private String names;
    private String desc;
    private int total;
    private String firstZodiac;
    private String secondZodiac;
    private Colleagues firstColleagues;
    private Colleagues secondColleagues;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFirstZodiac() {
        return firstZodiac;
    }

    public void setFirstZodiac(String firstZodiac) {
        this.firstZodiac = firstZodiac;
    }

    public String getSecondZodiac() {
        return secondZodiac;
    }

    public void setSecondZodiac(String secondZodiac) {
        this.secondZodiac = secondZodiac;
    }

    public Colleagues getFirstColleagues() {
        return firstColleagues;
    }

    public void setFirstColleagues(Colleagues firstColleagues) {
        this.firstColleagues = firstColleagues;
    }

    public Colleagues getSecondColleagues() {
        return secondColleagues;
    }

    public void setSecondColleagues(Colleagues secondColleagues) {
        this.secondColleagues = secondColleagues;
    }

    public int compareTo(Result o) {

        if (this.getTotal() > o.getTotal()) {

            return 1;

        } else if (this.getTotal() == o.getTotal()) {

            return 0;

        } else {

            return -1;

        }

    }
}
