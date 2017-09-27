package observer.nonuse;

/**
 * 当不使用观察者模式时
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //当前有A和B两个平台
        IPlatformA iPlatformA = new PlatformAImpl();
        IPlatformB iPlatformB = new PlatformBImpl();

        //当用户发送消息
        String message = "消息";

        //用户的消息变动会在AB两个平台都有显示
        iPlatformA.update(message);
        iPlatformB.update(message);

        //当用户发送消息
        String message2 = "消息2";

        //用户的消息变动会在AB两个平台都有显示
        iPlatformA.update(message2);
        iPlatformB.update(message2);

        /**
         * 遇到的问题：
         * 1、如果出现第三个平台，第四个，那么扩展性很差，代码改动很多
         * 2、如果一个平台移出，那么需要删除代码实现
         * 3、如果后面加入别的类似发送消息的功能，那么每个平台都需要新开一个接口为其服务
         */
    }
}
