package prototype.use;

/**
 * 使用原型模式
 * Created by LinkinStar
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype prototypeA = new ConcretePrototype();
        prototypeA.attributeA = 1;
        prototypeA.attributeB = 2;
        prototypeA.attributeC = 3;
        ConcretePrototype prototypeB = prototypeA.clone();
        ConcretePrototype prototypeC = prototypeA.clone();
        prototypeC.attributeA = 3;
        prototypeA.dis();
        prototypeB.dis();
        prototypeC.dis();
    }
}
