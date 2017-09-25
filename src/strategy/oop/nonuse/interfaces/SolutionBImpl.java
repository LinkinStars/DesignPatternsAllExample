package strategy.oop.nonuse.interfaces;

/**
 * 策略B实现方案实现
 * Created by LinkinStar
 */
public class SolutionBImpl implements ISolutionB {
    @Override
    public int caculate(int data) {
        return data * 5;
    }
}
