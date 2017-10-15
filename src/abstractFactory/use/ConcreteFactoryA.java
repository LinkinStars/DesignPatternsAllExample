package abstractFactory.use;

/**
 * 具体工厂角色-能生产红色包装与苹果的产品族
 * Created by LinkinStar
 */
public class ConcreteFactoryA implements AbstractFactory {

    public AbstractProductFruit getFruit(){
        return new ConcreteProductApple();
    }

    public AbstractProductPack getPack() {
        return new ConcreteProductPackRed();
    }
}
