package visitor.use;

/**
 * 具体访问者
 * Created by LinkinStar
 */
public class ConcreteVisitor extends Visitor {
    @Override
    public void visit(ConcreteElementA employee) {
        System.out.println(employee.Name);
    }

    @Override
    public void visit(ConcreteElementB employee) {
        System.out.println("VIP ::  " + employee.Name);
    }
}
