package decorator.use;

/**
 * 抽象构件
 * Created by LinkinStar
 */
public abstract class Component {
    /**
     * 获取对于这个奶茶的描述
     */
    public String getDescription(){
        return "奶茶";
    }

    /**
     * 获取这个奶茶的价格
     */
    public double getCost(){
        return 5;
    }
}
