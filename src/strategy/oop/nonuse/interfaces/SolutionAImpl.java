package strategy.oop.nonuse.interfaces;

/**
 * 策略A实现方案实现
 * Created by LinkinStar
 */
public class SolutionAImpl implements ISolutionA {
    @Override
    public int caculate(int data) {
        return data * 2;
    }
}
