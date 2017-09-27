package observer.use;

/**
 * 抽象目标（主题）
 * Created by LinkinStar
 */
public interface Subject {
    /**
     * 观察者注册（订阅）这个主题
     */
    void register(Obeserver obeserver);

    /**
     *  观察者取消订阅这个主题
     */
    void remove(Obeserver obeserver);

    /**
     * 通知所有订阅这个主题的观察者
     */
    void notifyObserver(String message);
}
