package chainOfResponsibility.use;

/**
 * 具体处理者B
 * Created by LinkinStar
 */
public class ConcreteHandlerB extends Handler{
    @Override
    public void solve(int value) {
        if (value < 1000) {
            System.out.println("当前处理金额小于1000，为：" + value);
        } else {
            //当前类处理不了金额大于1000的请求，或者说是不处理这样类型的请求，转交给下一个责任链上的处理者
            this.successor.solve(value);
        }
    }
}
