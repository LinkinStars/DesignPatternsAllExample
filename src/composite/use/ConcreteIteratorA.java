package composite.use;

/**
 * 抽象迭代器-A类型
 * Created by LinkinStar
 */
public class ConcreteIteratorA implements Iterator {

    /**
     * 使用数组存放数据
     */
    private String[] items;

    /**
     * 记录访问下标
     */
    private int index = 0;

    /**
     * 初始化
     */
    public ConcreteIteratorA(String[] typeA){
        this.items = typeA;
    }

    @Override
    public boolean hasNext() {
        if (index >= items.length) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return items[index++];
    }

}
