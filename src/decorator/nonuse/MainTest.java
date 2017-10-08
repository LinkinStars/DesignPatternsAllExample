package decorator.nonuse;

/**
 * 当不使用装饰模式时
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //一个顾客A来了，要一杯原味奶茶
        MilkTea milkTea = new MilkTea();
        System.out.println(milkTea.getDescription() + " : " + milkTea.getCost() + "元");

        //一个顾客B来了，要一杯珍珠奶茶
        MilkTea bubbleTea = new BubbleTea();
        System.out.println(bubbleTea.getDescription() + " : " + bubbleTea.getCost() + "元");

        //一个顾客C来了，要一杯椰果奶茶
        MilkTea coconutMilkTea = new CoconutMilkTea();
        System.out.println(coconutMilkTea.getDescription() + " : " + coconutMilkTea.getCost() + "元");

        /**
         * 遇到的问题：
         * 1、如果出一个新的奶茶品种，就需要新加入一个类，那么如果有100种奶茶就有100个类
         * 2、如果需要加双份的椰果奶茶，怎么办？
         * 3、如果价格要临时变动怎么办？
         */

    }
}
