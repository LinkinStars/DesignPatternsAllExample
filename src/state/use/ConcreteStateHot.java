package state.use;

/**
 * 具体状态类（热水）
 * Created by LinkinStar
 */
public class ConcreteStateHot implements State {

    @Override
    public void heat(Context context) {
        System.out.println("当前已经是热水");
    }

    @Override
    public void ice(Context context) {
        System.out.println("当前冷却后成为常温的水");
        context.setState(context.concreteStateNormal);
    }
}
