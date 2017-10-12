package simpleFactory.nunuse;

/**
 * 当不使用简单工厂模式模式时
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        String fruit = "apple";
        if (fruit.equals("apple")) {
            Apple apple = new Apple();
            apple.dis();
        } else if (fruit.equals("banana")) {
            Banana banana = new Banana();
            banana.dis();
        }

        /**
         * 遇到的问题：
         * 1、种类越多，if-else的代码越多，而且new的对象不同导致后面代码可能会在if-else代码中不断的添加
         * 2、如果别的地方也需要水果对象，也需要进行判断生产，那么这个代码没办法复用，常见的就是复制粘贴
         * 3、这里创建对象是简单的，但是实际中创建对象时常常需要进行一些初始化的赋值，对象的创建会变得复杂
         */
    }
}
