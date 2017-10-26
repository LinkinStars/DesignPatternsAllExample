package templateMethod.use;

/**
 * 咖啡
 * Created by LinkinStar
 */
public class Coffee extends AbstractClass{

    @Override
    void addIngredient() {
        System.out.print("加入速溶咖啡粉；");
    }

    @Override
    protected void addSugar(){
        System.out.print("加入糖；");
    }

}
