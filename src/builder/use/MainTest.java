package builder.use;

/**
 * 使用建造者模式
 * Created by LinkinStar
 */
public class MainTest {
    public static void main(String[] args) {
        ConcreteBuilderMan concreteBuilderMan = new ConcreteBuilderMan();
        ConcreteBuilderChild concreteBuilderChild = new ConcreteBuilderChild();

        Director director = new Director();
        Product man = director.bulid(concreteBuilderMan);
        Product child = director.bulid(concreteBuilderChild);

        System.out.print(man.getAge() + "   ");
        System.out.print(man.getStature() + "  ");
        System.out.println(man.getWeight());

        System.out.print(child.getAge() + "   ");
        System.out.print(child.getStature() + "  ");
        System.out.println(child.getWeight());
    }
}
