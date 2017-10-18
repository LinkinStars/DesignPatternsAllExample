package singleton.use.doubleCheck;

/**
 * 双重检查加锁（double-checked locking）：只有第一次才进行同步检查，大大减少了getInstance的时间
 * Created by LinkinStar
 */
public class Singleton {
    //私有化变量，使用volatile修饰保证修改直接作用于内存，对其他线程立即可见
    private volatile static Singleton singleton;

    //私有化构造方法，外部无法直接构造这个类
    private Singleton(){}

    //提供获取类的方法(使用synchronized修饰，让获取对象的方法同步，当前只有一个线程可以进入这个方法)
    public static Singleton getInstance(){
        if (singleton == null) {
            //只有第一次访问才进行检查，在创建对象之前使用synchronized同步，使得当前只有一个线程能进行访问
            synchronized (Singleton.class) {
                //双重检查
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
