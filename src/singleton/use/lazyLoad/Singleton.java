package singleton.use.lazyLoad;

/**
 * 懒加载（lazyLoad）：获取对象时才初始化对象，并且用同步约束获取对象的方法，适用于访问量很少但是需要使用单例的情况
 * Created by LinkinStar
 */
public class Singleton {
    //私有化变量
    private static Singleton singleton;

    //私有化构造方法，外部无法直接构造这个类
    private Singleton(){}

    //提供获取类的方法(使用synchronized修饰，让获取对象的方法同步，当前只有一个线程可以进入这个方法)
    public static synchronized Singleton getInstance(){
        //如果还未创建对象，则创建对象
        if (singleton == null) {
            //因为构造方法是私有的，所以在这个类的内部是可以被调用的
            singleton = new Singleton();
        }
        return singleton;
    }

    //多数情况下我们获取对象是不需要同步的，只有第一次的时候才需要，所以这个方法对性能影响较大
}
