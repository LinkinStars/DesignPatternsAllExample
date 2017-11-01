package state.use;

/**
 * 具体状态类（冰水）
 * Created by LinkinStar
 */
public class ConcreteStateCold implements State {

    @Override
    public void heat(Context context) {
        System.out.println("当前加热后成为常温的水");
        context.setState(context.concreteStateNormal);
    }

    @Override
    public void ice(Context context) {
        System.out.println("当前已经为冰水");
    }
}
