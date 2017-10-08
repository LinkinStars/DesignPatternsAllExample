package decorator.use;

/**
 * 具体装饰类B
 * Created by LinkinStar
 */
public class ConcreteDecoratorB extends Decorator {
    Component component;

    /**
     * 利用构造方法设置组件
     */
    public ConcreteDecoratorB(Component component) {
        this.component = component;
    }

    /**
     * 加上描述
     */
    public String getDescription() {
        return component.getDescription() + " + 椰果";
    }

    /**
     * 加上价格
     */
    public double getCost() {
        return 1 + component.getCost();
    }
}
