package chainOfResponsibility.use;

/**
 * 具体处理者A
 * Created by LinkinStar
 */
public class ConcreteHandlerA extends Handler{
    @Override
    public void solve(int value) {
        if (value < 100) {
            System.out.println("当前处理金额小于100，为：" + value);
        } else {
            //当前类处理不了金额大于100的请求，或者说是不处理这样类型的请求，转交给下一个责任链上的处理者
            this.successor.solve(value);
        }
    }
}
