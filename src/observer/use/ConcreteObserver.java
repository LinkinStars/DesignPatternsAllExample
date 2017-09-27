package observer.use;

/**
 *  具体观察者
 * Created by LinkinStar
 */
public class ConcreteObserver implements Obeserver {

    private String platform;//平台名称

    /**
     * 当主题发送消息时调用
     */
    public void update(String message) {
        System.out.println("来自" + platform + "：" + message);
    }

    /**
     * 平台名称
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 平台名称
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

}
