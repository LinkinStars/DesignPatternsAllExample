package factoryMethod.use;

/**
 * 当使用工厂方法模式模式时
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //如果需要旧的产品就建造一个旧的工厂
        Factory factory = new ConcreteFactory();
        //利用工厂生产一个产品
        Product product = factory.getProduct("banana");
        //调用产品通用的方法描述
        product.dis();

        //如果需要新的产品就使用新的工厂，生产打包好的产品
        Factory packFactory = new ConcreteFactoryPack();
        //利用工厂生产一个产品
        Product packProduct = packFactory.getProduct("banana");
        //调用产品通用的方法描述
        packProduct.dis();
    }
}
