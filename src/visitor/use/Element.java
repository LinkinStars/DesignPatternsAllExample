package visitor.use;

/**
 * 抽象元素
 * Created by LinkinStar
 */
public interface Element {
    void accept(Visitor visitor);
}
