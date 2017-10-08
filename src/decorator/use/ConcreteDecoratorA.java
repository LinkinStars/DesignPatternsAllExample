package decorator.use;

/**
 * 具体装饰类A
 * Created by LinkinStar
 */
public class ConcreteDecoratorA extends Decorator {
    Component component;

    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    public String getDescription() {
        return component.getDescription() + " + 珍珠";
    }

    public double getCost() {
        return 2 + component.getCost();
    }
}
