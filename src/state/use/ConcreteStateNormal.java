package state.use;

/**
 * 具体状态类（常温的水）
 * Created by LinkinStar
 */
public class ConcreteStateNormal implements State {

    @Override
    public void heat(Context context) {
        System.out.println("当前加热后成为热水");
        context.setState(context.concreteStateHot);
    }

    @Override
    public void ice(Context context) {
        System.out.println("当前冷却后成为冰水");
        context.setState(context.concreteStateCold);
    }
}
