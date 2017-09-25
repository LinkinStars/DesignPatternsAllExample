package strategy.pop.use;

/**
 * 环境类，负责使用算法策略，其中维持了一个抽象策略类的引用实例
 * Created by LinkinStar
 */
public class Context {

	private int result;//算法计算的结果
	private IStrategy strategy;//采用不同策略的算法
	
	/**
	 * 获取算法计算的结果
	 */
	public int getResult() {
		result = strategy.calculate(result);
		return result;
	}
	
	/**
	 * 获取算法
	 */
	public void setResult(int result) {
		this.result = result;
	}
	
	/**
	 * 采用不同策略的算法
	 */
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

}
