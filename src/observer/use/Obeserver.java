package observer.use;

/**
 * 抽象观察者
 * Created by LinkinStar
 */
public interface Obeserver {
    /**
     * 当主题发送消息时调用
     */
    void update(String message);
}
