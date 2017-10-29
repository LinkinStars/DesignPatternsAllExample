package composite.use;

import java.util.List;

/**
 * 抽象迭代器-B类型
 * Created by LinkinStar
 */
public class ConcreteIteratorB implements Iterator {

    /**
     * 使用数组存放数据
     */
    private List<String> items;

    /**
     * 记录访问下标
     */
    private int index = 0;

    /**
     * 初始化
     */
    public ConcreteIteratorB(List<String> typeB){
        this.items = typeB;
    }

    @Override
    public boolean hasNext() {
        if (index >= items.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return items.get(index++);
    }

}
