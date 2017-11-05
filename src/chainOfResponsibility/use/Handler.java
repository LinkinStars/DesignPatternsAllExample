package chainOfResponsibility.use;

/**
 * 抽象处理者
 * Created by LinkinStar
 */
public abstract class Handler {

    protected Handler successor;//后继对象

    public abstract void solve(int value);

}
