import java.util.LinkedList;
import java.util.List;

/**
 * @author sawyer 2016/10/21下午3:56
 */
public class Person {

    public List<Colleagues> init(){

        List<Colleagues> colleagues = new LinkedList<Colleagues>();

        Colleagues celin = new Colleagues();
        celin.setIdentity(Identity.PRODUCT);
        celin.setName("celin");
        celin.setSex(Sex.GIRL);
        celin.setZodiac(Zodiac.Aries);
        colleagues.add(celin);

        Colleagues zc = new Colleagues();
        zc.setIdentity(Identity.DEVELOP);
        zc.setName("zc");
        zc.setSex(Sex.BOY);
        zc.setZodiac(Zodiac.Cancer);
        colleagues.add(zc);

        Colleagues zjx = new Colleagues();
        zjx.setIdentity(Identity.DEVELOP);
        zjx.setName("zjx");
        zjx.setSex(Sex.BOY);
        zjx.setZodiac(Zodiac.Cancer);
        colleagues.add(zjx);

        return colleagues;

    }

}
