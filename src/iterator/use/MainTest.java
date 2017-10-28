package iterator.use;

/**
 * 使用迭代器模式的情况下
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //我们现在需要类型A和类型B的数据
        TypeA typeA = new TypeA();
        TypeB typeB = new TypeB();


        Iterator iterator = typeA.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator = typeB.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
