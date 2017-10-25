package facade.use;

/**
 * 外观角色
 * Created by LinkinStar
 */
public class Facade {
    public void execute(){
        SubSystemA subSystemA = new SubSystemA();
        SubSystemB subSystemB = new SubSystemB();
        SubSystemC subSystemC = new SubSystemC();

        subSystemA.stepOne();
        subSystemB.stepOne();
        subSystemC.stepOne();
        subSystemA.stepTwo();
        subSystemB.stepTwo();
        subSystemC.stepTwo();
    }
}
