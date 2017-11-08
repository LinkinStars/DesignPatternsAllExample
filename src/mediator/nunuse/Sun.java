package mediator.nunuse;

/**
 * 太阳
 * Created by LinkinStar
 */
public class Sun {

    public static void rise() {
        Moon.down();
        System.out.println("太阳升起");
    }

    public static void down() {
        System.out.println("太阳下降");
        Moon.rise();
    }
}
