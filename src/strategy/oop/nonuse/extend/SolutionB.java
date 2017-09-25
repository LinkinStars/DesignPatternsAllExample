package strategy.oop.nonuse.extend;

/**
 * 策略B实现方案
 * Created by LinkinStar
 */
public class SolutionB extends Solution {
    /**
     * 每个子类都不得不重写
     * 而且父类一动，所有子类都要动
     */
    @Override
    protected int caculate(int data) {
        return data * 5;
    }
}
