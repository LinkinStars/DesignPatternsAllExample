package command.use;


/**
 * 使用命令模式的情况
 * Created by LinkinStar
 */
public class MainTest {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        invoker.setButton(1, new ConcreteCommandMachineB());
        invoker.setButton(2, new ConcreteCommandMachineA());

        invoker.pressButton(1);
        invoker.pressButton(2);
    }
}
