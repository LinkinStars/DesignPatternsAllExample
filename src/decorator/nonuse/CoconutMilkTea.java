package decorator.nonuse;

/**
 * 椰果奶茶
 * Created by LinkinStar
 */
public class CoconutMilkTea extends MilkTea{

    /**
     * 获取这个奶茶的描述
     */
    public String getDescription(){
        return super.getDescription() + " + 椰果";
    }

    /**
     * 获取这个奶茶的价格
     */
    public double getCost(){
        return super.getCost() + 1;
    }
}
