package composite.nunuse;

/**
 * 使用迭代器模式（没有使用组合模式）的情况下
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

        /**
         * 遇到的问题：
         * 1、我们遍历的时候还是必须使用两次，如果我们想要一次完成呢？
         * 2、当前如果在类型A里面包含有类型B，如果要进行遍历那么怎么加入呢？
         */
    }

}
