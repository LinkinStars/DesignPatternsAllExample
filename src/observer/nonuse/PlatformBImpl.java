package observer.nonuse;

/**
 * B平台所给出的接口实现
 * Created by LinkinStar
 */
public class PlatformBImpl implements IPlatformB {
    public void update(String message) {
        System.out.println("来自B平台：" + message);
    }
}
