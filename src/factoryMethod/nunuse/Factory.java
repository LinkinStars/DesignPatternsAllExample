package factoryMethod.nunuse;

/**
 * 简单工厂角色
 * Created by LinkinStar
 */
public class Factory {
    /**
     * 工厂生产产品的方法，根据名字生产对应的产品，如果名字不存在使用默认的产品
     * @param fruit 产品名称
     * @return 产品
     */
    public static Product getProduct(String fruit){
        Product product;
        //当这里出现很多的产品时就会变得非常复杂
        if (fruit.equals("apple")) {
            product = new ConcreteProductApple();
        } else if (fruit.equals("banana")) {
            product = new ConcreteProductBanana();
        }
        else if (fruit.equals("packApple")) {
            product = new ConcreteProductPackApple();
        } else if (fruit.equals("packBanana")) {
            product = new ConcreteProductPackBanana();
        }
        else {
            product = new ConcreteProductApple();
        }
        return product;
    }
}
