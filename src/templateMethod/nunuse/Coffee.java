package templateMethod.nunuse;

/**
 * 咖啡
 * Created by LinkinStar
 */
public class Coffee {

    public void makeCoffee(){
        boilWater();
        addInstantCoffee();
        addSugar();
        pourInCup();
        stir();
    }

    private void boilWater(){
        System.out.print("煮开水；");
    }

    private void addInstantCoffee(){
        System.out.print("加入速溶咖啡粉；");
    }

    private void addSugar(){
        System.out.print("加入糖；");
    }

    private void pourInCup(){
        System.out.print("把水倒进去；");
    }

    private void stir(){
        System.out.println("搅拌");
    }
}
