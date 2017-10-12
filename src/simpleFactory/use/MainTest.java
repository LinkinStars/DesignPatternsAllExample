package simpleFactory.use;

/**
 * 当使用简单工厂模式模式时
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //建造一个工厂
        Factory factory = new Factory();
        //利用工厂生产一个产品
        Product product = factory.getProduct("banana");
        //调用产品通用的方法描述
        product.dis();
    }
}
