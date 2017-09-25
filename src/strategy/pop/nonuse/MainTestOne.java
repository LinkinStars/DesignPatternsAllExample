package strategy.pop.nonuse;

/**
 * 从面向过程的角度来说
 * Created by LinkinStar
 */
public class MainTestOne {

    /**
     * 如果不使用策略模式的时候是这样的
     */
    public static void main(String[] args) {
        int condition = 0;
        int result = 100;
        if (condition == 1) {//如果满足条件1，则使用第一种策略
            result *= 2;
        } else if (condition == 2) {//如果满足条件2，则使用第二种策略
            result *= 5;
        }
        System.out.println(result);
    }

}
