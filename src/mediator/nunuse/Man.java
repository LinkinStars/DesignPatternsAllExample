package mediator.nunuse;

/**
 * 人
 * Created by LinkinStar
 */
public class Man {

    public static void morning(){
        Sun.rise();
        Man.getUp();
    }

    public static void evening(){
        Sun.down();
        Man.goBed();
    }

    public static void getUp() {
        System.out.println("人们起床了");
    }

    public static void goBed() {
        System.out.println("人们睡觉了");
    }
}
