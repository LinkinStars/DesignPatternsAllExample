package command.use;

/**
 * 调用者（控制器）
 * Created by LinkinStar
 */
public class Invoker {

    /**
     * 按钮列表，可以随意添加
     */
    Command[] buttonList = new Command[10];

    /**
     * 设置默认为空命令，调用时可以减少判空操作
     */
    public Invoker(){
        for (Command command : buttonList) {
            command = new NoCommand();
        }
    }

    /**
     * 设置对应位置按钮所执行的命令
     * @param place 按钮位置
     * @param command 按钮对应需要执行的命令
     */
    public void setButton(int place, Command command){
        buttonList[place] = command;
    }

    /**
     * 模拟按下对应位置按钮，去控制机器
     * @param place 按钮位置
     */
    public void pressButton(int place){
        buttonList[place].execute();
    }

}
