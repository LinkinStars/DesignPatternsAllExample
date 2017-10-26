package templateMethod.use;

/**
 * 制作咖啡和奶茶的抽象
 * Created by LinkinStar
 */
public abstract class AbstractClass {

    /**
     * 制作的模板方法
     * 申明为final子类不能重写模板
     */
    public final void make(){
        boilWater();
        addIngredient();
        addSugar();
        pourInCup();
        stir();
    }

    //下面三个方法都是共有的，不需要子类重写
    protected final void boilWater(){
        System.out.print("煮开水；");
    }

    protected final void pourInCup(){
        System.out.print("把水倒进去；");
    }

    protected final void stir(){
        System.out.println("搅拌");
    }

    /**
     * 加入原料的方法子类必须重写，因为不同的饮料需要加入不同的原料
     */
   abstract void addIngredient();

    /**
     * 加入糖的方法子类可以选择重写或者不重写
     * 子类可以控制加不加糖，默认是不加的
     */
    protected void addSugar(){
        System.out.print("不加糖；");
    }

}
