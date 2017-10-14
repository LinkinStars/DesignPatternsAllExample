package factoryMethod.use;

/**
 * 具体工厂（旧工厂生产旧的产品）
 * Created by LinkinStar
 */
public class ConcreteFactory implements Factory {
    /**
     * 工厂生产产品的方法，根据名字生产对应的产品，如果名字不存在使用默认的产品
     * @param fruit 产品名称
     * @return 产品
     */
    public Product getProduct(String fruit){
        Product product;
        if (fruit.equals("apple")) {
            product = new ConcreteProductApple();
        } else if (fruit.equals("banana")) {
            product = new ConcreteProductBanana();
        } else {
            product = new ConcreteProductApple();
        }
        return product;
    }
}
