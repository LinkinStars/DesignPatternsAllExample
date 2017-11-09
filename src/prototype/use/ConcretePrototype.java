package prototype.use;

/**
 * 具体原型类
 * Created by LinkinStar
 */
public class ConcretePrototype implements Cloneable{

    int attributeA;
    int attributeB;
    int attributeC;

    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void dis(){
        System.out.print("属性A：" + attributeA);
        System.out.print("  属性B：" + attributeB);
        System.out.println("  属性C：" + attributeC);
    }

}
