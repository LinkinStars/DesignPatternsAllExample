package visitor.use;

/**
 * 抽象访问者
 * Created by LinkinStar
 */
public abstract class Visitor {
    public abstract void visit(ConcreteElementA employee);
    public abstract void visit(ConcreteElementB employee);
}
