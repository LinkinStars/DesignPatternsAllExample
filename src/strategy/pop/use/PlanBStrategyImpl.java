package strategy.pop.use;

/**
 * 策略B实现方案
 * Created by LinkinStar
 */
public class PlanBStrategyImpl implements IStrategy {

	public int calculate(int data) {
		return data * 5;
	}

}
