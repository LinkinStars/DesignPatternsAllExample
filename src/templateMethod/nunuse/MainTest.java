package templateMethod.nunuse;

/**
 * 当不使用模板方法模式时
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //制作咖啡
        Coffee coffee = new Coffee();
        coffee.makeCoffee();

        System.out.println("---------------------------");

        //制作奶茶
        MilkyTea milkyTea = new MilkyTea();
        milkyTea.makeMilkyTea();

        /**
         * 遇到的问题：
         * 1、明显在两个制作过程中有相同的过程代码重复
         * 2、如果当其中相同的方法需要修改时，需要同时修改两边的代码
         */
    }
}
