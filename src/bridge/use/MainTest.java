package bridge.use;

/**
 * 使用桥接模式
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        ImplementorColor implementorColorRed = new ConcreteImplementorRed();
        ImplementorColor implementorColorBlue = new ConcreteImplementorBlue();

        RefinedAbstratctionBig refinedAbstratctionBig = new RefinedAbstratctionBig();
        RefinedAbstratctionSmall refinedAbstratctionSmall = new RefinedAbstratctionSmall();

        refinedAbstratctionBig.setColor(implementorColorBlue);
        refinedAbstratctionSmall.setColor(implementorColorRed);

        refinedAbstratctionBig.dis();
        refinedAbstratctionSmall.dis();
    }
}
