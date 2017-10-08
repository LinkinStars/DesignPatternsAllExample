package decorator.use;

/**
 * 具体装饰类A
 * Created by LinkinStar
 */
public class ConcreteDecoratorA extends Decorator {
    Component component;

    /**
     * 利用构造方法设置组件
     */
    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    /**
     * 加上描述
     */
    public String getDescription() {
        return component.getDescription() + " + 珍珠";
    }

    /**
     * 加上价格
     */
    public double getCost() {
        return 2 + component.getCost();
    }
}
