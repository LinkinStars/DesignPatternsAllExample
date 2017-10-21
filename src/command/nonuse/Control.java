package command.nonuse;

/**
 * 控制器
 * Created by LinkinStar
 */
public class Control {
    /**
     * 模拟按下第一个按钮，去控制机器
     */
    public void pressFirstButton(){
        MachineA machineA = new MachineA();
        machineA.start();
    }

    /**
     * 模拟按下第二个按钮，去控制机器
     */
    public void pressSecondButton(){
        MachineB machineB = new MachineB();
        machineB.start();
    }

}
