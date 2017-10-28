package iterator.use;

/**
 * 抽象迭代器
 * Created by LinkinStar
 */
public interface Iterator {

    /**
     * 用于判断是否还有下一个元素
     */
    boolean hasNext();

    /**
     * 返回遍历的下一个元素
     */
    Object next();
}
