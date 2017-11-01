package state.use;

/**
 * 抽象状态类
 * Created by LinkinStar
 */
public interface State {

    /**
     * 加热的行为
     */
    void heat(Context context);

    /**
     * 冷却的行为
     */
    void ice(Context context);

}
