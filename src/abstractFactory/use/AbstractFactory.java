package abstractFactory.use;

/**
 * 抽象工厂角色
 * Created by LinkinStar
 */
public interface AbstractFactory {
    AbstractProductFruit getFruit();
    AbstractProductPack getPack();
}
