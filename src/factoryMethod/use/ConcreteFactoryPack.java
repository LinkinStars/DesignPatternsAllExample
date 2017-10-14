package factoryMethod.use;

/**
 * 具体工厂（新工厂生产新的产品）
 * Created by LinkinStar
 */
public class ConcreteFactoryPack implements Factory {
    /**
     * 工厂生产产品的方法，根据名字生产对应的产品，如果名字不存在使用默认的产品
     * @param fruit 产品名称
     * @return 产品
     */
    public Product getProduct(String fruit){
        Product product;
        if (fruit.equals("apple")) {
            product = new ConcreteProductPackApple();
        } else if (fruit.equals("banana")) {
            product = new ConcreteProductPackBanana();
        } else {
            product = new ConcreteProductPackApple();
        }
        return product;
    }
}
