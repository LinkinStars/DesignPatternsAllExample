package state.use;

/**
 * 环境类
 * Created by LinkinStar
 */
public class Context {

    /**
     * 当前状态
     */
    private State state;
    public State concreteStateCold;
    public State concreteStateHot;
    public State concreteStateNormal;

    public Context(ConcreteStateCold concreteStateCold, ConcreteStateHot concreteStateHot, ConcreteStateNormal concreteStateNormal) {
        this.concreteStateCold = concreteStateCold;
        this.concreteStateHot = concreteStateHot;
        this.concreteStateNormal = concreteStateNormal;
    }

    /**
     * 加热
     */
    public void heat() {
        state.heat(this);
    }

    /**
     * 冷却
     */
    public void ice() {
        state.ice(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
