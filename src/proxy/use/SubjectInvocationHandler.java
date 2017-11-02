package proxy.use;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类的调用处理器
 * Created by LinkinStar
 */
public class SubjectInvocationHandler implements InvocationHandler {

    private Object target;

    public SubjectInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理方法被调用了");
        System.out.println("调用真实类的方法名为：" + method.getName());

        System.out.println("入参为：" + args[0]);
        return method.invoke(target, args);
    }
}
