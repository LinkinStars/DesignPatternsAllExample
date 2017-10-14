package factoryMethod.nunuse;

/**
 * 当使用简单工厂模式模式时（而不是工厂方法模式时）
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //建造一个工厂
        Factory factory = new Factory();
        //利用工厂生产一个产品
        Product product = factory.getProduct("packBanana");
        //调用产品通用的方法描述
        product.dis();
        /**
         * 问题：当我们需要让每一个生产的产品都是包装过的，比如包装过的苹果，包装过的香蕉，而且要保证原有的产品也可以被生产
         * 首先我们需要很多包装过的产品，那么随着扩展，产品就会原来越多，那么简单工厂模式下
         * 一个工厂所承载的职责就过于庞大了，if-else的代码就会变得很多。
         */
    }
}
