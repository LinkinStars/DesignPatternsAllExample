package observer.nonuse;

/**
 * A平台所给出的接口实现
 * Created by LinkinStar
 */
public class PlatformAImpl implements IPlatformA {
    public void update(String message) {
        System.out.println("来自A平台：" + message);
    }
}
