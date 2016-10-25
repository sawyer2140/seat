package seat;

/**
 * @author sawyer 2016/10/21上午11:42
 */
public enum Zodiac {

    Aries("白羊"),
    Taurus("金牛"),
    Gemini("双子"),
    Cancer("巨蟹"),
    Leo("狮子"),
    Virgo("处女"),
    Libra("天秤"),
    Scorpio("天蝎"),
    Sagittarius("射手"),
    Capricorn("摩羯"),
    Aquarius("水瓶"),
    Pisces("双鱼");

    private String value;

    private Zodiac(String value){

        this.value = value;

    }

    public static String getName(Zodiac zodiac){

        return zodiac.value;

    }

}
