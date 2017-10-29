package composite.nunuse;

/**
 * A类型，使用数组用于存放数据
 * Created by LinkinStar
 */
public class TypeA {

    /**
     * 使用数组存放数据
     */
    private String[] items = new String[3];

    /**
     * 初始化数据，在实际中之后还可以对其进行添加或者修改，这里只是举例
     */
    public TypeA(){
        for (int i = 0; i < 3; i++) {
            items[i] = "A的数据：" + i;
        }
    }

    /**
     * 获取迭代器
     */
    public ConcreteIteratorA createIterator(){
        return new ConcreteIteratorA(items);
    }
}
