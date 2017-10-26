package templateMethod.nunuse;

/**
 * 奶茶
 * Created by LinkinStar
 */
public class MilkyTea {

    public void makeMilkyTea(){
        boilWater();
        addMilkyTea();
        pourInCup();
        stir();
    }

    private void boilWater(){
        System.out.print("煮开水；");
    }

    private void addMilkyTea(){
        System.out.print("加入奶茶粉；");
    }

    private void pourInCup(){
        System.out.print("把水倒进去；");
    }

    private void stir(){
        System.out.println("搅拌");
    }
}
