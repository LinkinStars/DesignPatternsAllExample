package singleton.nunuse;

/**
 * 不使用单例模式（错误的单例模式）
 * Created by LinkinStar
 */
public class Single {
    //私有化变量
    private static Single single;

    //私有化构造方法，外部无法直接构造这个类
    private Single(){}
    
    //提供获取类的方法
    public static Single getInstance(){
        //如果还未创建对象，则创建对象
        if (single == null) {
            //因为构造方法是私有的，所以在这个类的内部是可以被调用的
            single = new Single();
        }
        return single;
    }

    /**
     * 遇到的问题：
     * 看似正常的代码，其实在多线程的情况下会导致不唯一创建的问题
     * 线程A执行到代码single = new Single();但是并没有执行时
     * 线程B执行if判断，可以完全通过if判断，因为没有被new
     * 这时就会创建多个对象
     */
}
