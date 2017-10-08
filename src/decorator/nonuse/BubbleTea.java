package decorator.nonuse;

/**
 * 珍珠奶茶
 * Created by LinkinStar
 */
public class BubbleTea extends MilkTea{

    /**
     * 获取对于这个奶茶的描述
     */
    public String getDescription(){
        return super.getDescription() + " + 珍珠";
    }

    /**
     * 获取这个奶茶的价格
     */
    public double getCost(){
        return super.getCost() + 2;
    }
}
