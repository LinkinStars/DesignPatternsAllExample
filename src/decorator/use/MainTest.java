package decorator.use;

/**
 * 当使用装饰模式时
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //一个顾客A来了，要一杯原味奶茶
        Component milkTea = new ConcreteComponentA();
        System.out.println(milkTea.getDescription() + " : " + milkTea.getCost() + "元");

        //一个顾客B来了，要一杯珍珠奶茶
        Component bubbleTea = new ConcreteComponentA();
        bubbleTea = new ConcreteDecoratorA(bubbleTea);
        System.out.println(bubbleTea.getDescription() + " : " + bubbleTea.getCost() + "元");

        //一个顾客C来了，要一杯椰果奶茶
        Component coconutMilkTea = new ConcreteComponentA();
        coconutMilkTea = new ConcreteDecoratorB(coconutMilkTea);
        System.out.println(coconutMilkTea.getDescription() + " : " + coconutMilkTea.getCost() + "元");

        //一个顾客D来了，要一杯椰果奶茶，加双份椰果
        Component doubleCoconutMilkTea = new ConcreteComponentA();
        doubleCoconutMilkTea = new ConcreteDecoratorB(doubleCoconutMilkTea);
        doubleCoconutMilkTea = new ConcreteDecoratorB(doubleCoconutMilkTea);
        System.out.println(doubleCoconutMilkTea.getDescription() + " : " + doubleCoconutMilkTea.getCost() + "元");

        //一个顾客E来了，要一杯无糖、珍珠椰果、奶茶
        Component mixMilkTea = new ConcreteComponentB();
        mixMilkTea = new ConcreteDecoratorA(mixMilkTea);
        mixMilkTea = new ConcreteDecoratorB(mixMilkTea);
        System.out.println(mixMilkTea.getDescription() + " : " + mixMilkTea.getCost() + "元");
    }
}
