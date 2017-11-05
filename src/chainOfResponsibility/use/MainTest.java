package chainOfResponsibility.use;

/**
 * 使用责任链模式的情况下
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //构建责任链
        ConcreteHandlerA concreteHandlerA = new ConcreteHandlerA();
        ConcreteHandlerB concreteHandlerB = new ConcreteHandlerB();
        ConcreteHandlerDefault concreteHandlerDefault = new ConcreteHandlerDefault();
        concreteHandlerA.successor = concreteHandlerB;
        concreteHandlerB.successor = concreteHandlerDefault;

        //使用责任链处理请求
        concreteHandlerA.solve(50);
        concreteHandlerA.solve(500);
        concreteHandlerA.solve(5000);
    }
}
