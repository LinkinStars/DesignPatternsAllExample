package templateMethod.use;

/**
 * 当使用模板方法模式时
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //制作咖啡
        Coffee coffee = new Coffee();
        coffee.make();

        System.out.println("---------------------------");

        //制作奶茶
        MilkyTea milkyTea = new MilkyTea();
        milkyTea.make();
    }

}
