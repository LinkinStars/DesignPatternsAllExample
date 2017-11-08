package mediator.use;

/**
 * 使用中介者模式的情况
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        //当白天到了
        mediator.morning();

        System.out.println("-----------------------------");

        //夜晚到了
        mediator.evening();
    }
}
