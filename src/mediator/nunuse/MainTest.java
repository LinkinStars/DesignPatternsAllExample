package mediator.nunuse;

/**
 * 不使用中介者模式的情况
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //当白天到了
        Man.morning();

        System.out.println("-----------------------------");

        //夜晚到了
        Man.evening();
    }
}
