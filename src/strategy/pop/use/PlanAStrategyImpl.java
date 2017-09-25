package strategy.pop.use;

/**
 * 策略A实现方案
 * Created by LinkinStar
 */
public class PlanAStrategyImpl implements IStrategy {

	public int calculate(int data) {
		return data * 2;
	}

}
