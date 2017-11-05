package chainOfResponsibility.use;

/**
 * 具体处理者-默认
 * Created by LinkinStar
 */
public class ConcreteHandlerDefault extends Handler{
    @Override
    public void solve(int value) {
        //默认处理者是一般是责任链的最后一个处理者，无论是什么样的请求，如果最后到这里都会被处理
        System.out.println("当前处理金额大于1000，为：" + value);
    }
}
