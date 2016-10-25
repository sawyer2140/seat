package seat;

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
        celin.setName("伊文利");
        celin.setSex(Sex.GIRL);
        celin.setZodiac(Zodiac.Capricorn);
        colleagues.add(celin);

        Colleagues zjx = new Colleagues();
        zjx.setIdentity(Identity.DEVELOP);
        zjx.setName("翟金旭");
        zjx.setSex(Sex.BOY);
        zjx.setZodiac(Zodiac.Cancer);
        colleagues.add(zjx);

        Colleagues zcl = new Colleagues();
        zcl.setIdentity(Identity.DEVELOP);
        zcl.setName("周成林");
        zcl.setSex(Sex.BOY);
        zcl.setZodiac(Zodiac.Sagittarius);
        colleagues.add(zcl);

        Colleagues suhoo = new Colleagues();
        suhoo.setIdentity(Identity.DEVELOP);
        suhoo.setName("孙浩");
        suhoo.setSex(Sex.BOY);
        suhoo.setZodiac(Zodiac.Aquarius);
        colleagues.add(suhoo);

        Colleagues lss = new Colleagues();
        lss.setIdentity(Identity.DEVELOP);
        lss.setName("李双双");
        lss.setSex(Sex.GIRL);
        lss.setZodiac(Zodiac.Virgo);
        colleagues.add(lss);

        Colleagues zzq = new Colleagues();
        zzq.setIdentity(Identity.DEVELOP);
        zzq.setName("李双双");
        zzq.setSex(Sex.BOY);
        zzq.setZodiac(Zodiac.Scorpio);
        colleagues.add(zzq);

        Colleagues zy = new Colleagues();
        zy.setIdentity(Identity.DEVELOP);
        zy.setName("张宇");
        zy.setSex(Sex.BOY);
        zy.setZodiac(Zodiac.Cancer);
        colleagues.add(zy);

        Colleagues zxd = new Colleagues();
        zxd.setIdentity(Identity.DEVELOP);
        zxd.setName("赵旭东");
        zxd.setSex(Sex.BOY);
        zxd.setZodiac(Zodiac.Taurus);
        colleagues.add(zxd);

        Colleagues ln = new Colleagues();
        ln.setIdentity(Identity.DEVELOP);
        ln.setName("李宁");
        ln.setSex(Sex.GIRL);
        ln.setZodiac(Zodiac.Pisces);
        colleagues.add(ln);

        Colleagues gzq = new Colleagues();
        gzq.setIdentity(Identity.PRODUCT);
        gzq.setName("郭之泉");
        gzq.setSex(Sex.GIRL);
        gzq.setZodiac(Zodiac.Scorpio);
        colleagues.add(gzq);

        return colleagues;

    }

}
