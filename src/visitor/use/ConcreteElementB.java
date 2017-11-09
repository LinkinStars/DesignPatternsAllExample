package visitor.use;

/**
 * 具体元素A
 * Created by LinkinStar
 */
public class ConcreteElementB implements Element{

    public String Name;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
