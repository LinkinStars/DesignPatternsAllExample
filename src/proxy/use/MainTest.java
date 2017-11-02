package proxy.use;

import java.lang.reflect.Proxy;

/**
 * 使用代理模式
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //创建需要使用的对象
        RealSubject realSubject = new RealSubject();
        //创建该对象的代理调用处理器
        SubjectInvocationHandler subjectInvocationHandler = new SubjectInvocationHandler(realSubject);
        //创建代理对象
        Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(), subjectInvocationHandler);
        //调用使用对象的方法
        subject.dis(100);
    }
}
