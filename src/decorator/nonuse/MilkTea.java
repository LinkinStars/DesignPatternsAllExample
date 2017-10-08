package decorator.nonuse;

/**
 * 奶茶父类，最基本的奶茶
 * Created by LinkinStar
 */
public class MilkTea {

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
