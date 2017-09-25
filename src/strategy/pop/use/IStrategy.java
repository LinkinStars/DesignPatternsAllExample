package strategy.pop.use;

/**
 * 抽象策略类
 * Created by LinkinStar
 */
public interface IStrategy {

	/**
	 * 根据不同的策略计算得出结果
	 */
	int calculate(int data);
	
}
