package decorator.use;

/**
 * 具体装饰类B
 * Created by LinkinStar
 */
public class ConcreteDecoratorB extends Decorator {
    Component component;

    public ConcreteDecoratorB(Component component) {
        this.component = component;
    }

    public String getDescription() {
        return component.getDescription() + " + 椰果";
    }

    public double getCost() {
        return 1 + component.getCost();
    }
}
