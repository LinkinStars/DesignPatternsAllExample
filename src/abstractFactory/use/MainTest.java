package abstractFactory.use;

/**
 * 当使用抽象工厂模式模式时
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //如果需要红色包装的苹果，那么就使用工厂A
        AbstractFactory factory = new ConcreteFactoryA();
        //利用工厂生产产品
        AbstractProductFruit fruit = factory.getFruit();
        AbstractProductPack pack = factory.getPack();
        //产品组合为最终需要的，调用产品通用的方法描述
        pack.dis();
        System.out.print("的");
        fruit.dis();

        //如果需要蓝色包装的香蕉，那么就使用工厂B
        AbstractFactory factoryB = new ConcreteFactoryB();
        //利用工厂生产产品
        AbstractProductFruit fruitB = factoryB.getFruit();
        AbstractProductPack packB = factoryB.getPack();
        //产品组合为最终需要的，调用产品通用的方法描述
        packB.dis();
        System.out.print("的");
        fruitB.dis();
    }
}
