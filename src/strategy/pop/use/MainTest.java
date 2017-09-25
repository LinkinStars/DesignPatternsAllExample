package strategy.pop.use;

/**
 * 主要测试类
 * Created by LinkinStar
 */
public class MainTest {

	public static void main(String[] args) {
		//设定环境类
		Context context = new Context();
		
		//设定策略A
		context.setStrategy(new PlanAStrategyImpl());
		//设定原始数据
		context.setResult(100);
		//计算结果
		System.out.println(context.getResult());
		
		//设定策略B
		context.setStrategy(new PlanBStrategyImpl());
		//设定原始数据
		context.setResult(100);
		//计算结果
		System.out.println(context.getResult());
	}
	
}
