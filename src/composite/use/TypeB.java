package composite.use;

import java.util.ArrayList;
import java.util.List;

/**
 * B类型，使用List用于存放数据
 * Created by LinkinStar
 */
public class TypeB {

    /**
     * 使用List存放数据
     */
    private List<String> items = new ArrayList<>();

    /**
     * 初始化数据，在实际中之后还可以对其进行添加或者修改，这里只是举例
     */
    public TypeB(){
        for (int i = 0; i < 3; i++) {
            items.add("B的数据：" + i);
        }
    }

    /**
     * 获取当前数据
     */
    public ConcreteIteratorB createIterator(){
        return new ConcreteIteratorB(items);
    }
}
