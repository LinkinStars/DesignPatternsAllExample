package iterator.nunuse;

import java.util.List;

/**
 * 不使用迭代器模式的情况下
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        TypeA typeA = new TypeA();
        TypeB typeB = new TypeB();

        //我们现在需要类型A和类型B的数据
        String[] itemsA = typeA.getItems();
        for (int i = 0; i < itemsA.length; i++) {
            System.out.println(itemsA[i]);
        }

        List<String> itemsB = typeB.getItems();
        for (int i = 0; i < itemsB.size(); i++) {
            System.out.println(itemsB.get(i));
        }

        /**
         * 遇到的问题：
         * 1、两个集合内部的类型一样都是String，但是集合类型不同，所以遍历不得不采用两个不同的类型和方式遍历
         * 2、当我们遍历的时候已经知道了这个类的内部一些类型等，那么也就是说遍历之前类型A和类型B已经被暴露给了用户
         */
    }

}
