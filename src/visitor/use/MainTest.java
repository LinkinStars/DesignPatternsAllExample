package visitor.use;

/**
 * 使用访问者模式
 * Created by LinkinStar
 */
public class MainTest {
    public static void main(String[] args) {
        ConcreteElementA concreteElementA1 = new ConcreteElementA();
        concreteElementA1.Name = "张三";
        ConcreteElementA concreteElementA2 = new ConcreteElementA();
        concreteElementA2.Name = "李四";
        ConcreteElementB concreteElementB = new ConcreteElementB();
        concreteElementB.Name = "王五";

        Visitor visitor = new ConcreteVisitor();
        visitor.visit(concreteElementA1);
        visitor.visit(concreteElementA2);
        visitor.visit(concreteElementB);
    }
}
