package abstractFactory.use;

/**
 * 具体工厂角色-能生产蓝色包装与香蕉的产品族
 * Created by LinkinStar
 */
public class ConcreteFactoryB implements AbstractFactory {

    public AbstractProductFruit getFruit(){
        return new ConcreteProductBanana();
    }

    public AbstractProductPack getPack() {
        return new ConcreteProductPackBlue();
    }
}
