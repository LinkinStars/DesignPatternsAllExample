package flyweight.use;

/**
 * 使用享元模式的情况
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.add(1, 1, 1);
        flyweightFactory.add(2, 2, 2);
        flyweightFactory.add(3, 3, 3);
        flyweightFactory.dis();
        System.out.println("-----------------------------------");
        flyweightFactory.delete(2, 2);
        flyweightFactory.dis();
    }
}
