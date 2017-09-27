package observer.use;

/**
 * 使用观察者模式
 * Created by LinkinStar
 */
public class MainTest {
    public static void main(String[] args) {
        //创建目标
        Subject subject = new ConcreteSubject();
        //创建观察者A平台
        ConcreteObserver concreteObserverA = new ConcreteObserver();
        concreteObserverA.setPlatform("A平台");
        Obeserver obeserverA = concreteObserverA;
        //创建观察者B平台
        ConcreteObserver concreteObserverB = new ConcreteObserver();
        concreteObserverB.setPlatform("B平台");
        Obeserver obeserverB = concreteObserverB;
        //注册（订阅）目标
        subject.register(obeserverA);
        subject.register(obeserverB);
        subject.notifyObserver("消息");
        //取消订阅
        subject.remove(obeserverB);
        subject.notifyObserver("消息2");
    }
}
