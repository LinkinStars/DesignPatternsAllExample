package state.use;

/**
 * 使用状态模式的情况下
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateCold(), new ConcreteStateHot(), new ConcreteStateNormal());
        //初始化当前为常温的水
        context.setState(new ConcreteStateNormal());
        //加热
        context.heat();
        //加热
        context.heat();
        //冷却
        context.ice();
        //冷却
        context.ice();
        //冷却
        context.ice();
    }
}
