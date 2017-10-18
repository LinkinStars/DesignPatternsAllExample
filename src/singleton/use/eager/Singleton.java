package singleton.use.eager;

/**
 * 直接静态初始化变量，适用于访问量平凡（饥饿）
 * Created by LinkinStar
 */
public class Singleton {
    //私有化变量，在类被初始化的时候创建对象
    private static Singleton singleton = new Singleton();

    //私有化构造方法，外部无法直接构造这个类
    private Singleton(){}

    //提供获取类的方法
    public static Singleton getInstance(){
        return singleton;
    }

}
