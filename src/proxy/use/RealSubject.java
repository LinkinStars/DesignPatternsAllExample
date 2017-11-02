package proxy.use;

/**
 * 需要被代理的对象
 * Created by LinkinStar
 */
public class RealSubject implements Subject{
    @Override
    public void dis(int val) {
        System.out.println("当前真实对象进行操作");
    }
}
