package command.use;

/**
 * 具体命令类-用于操作机器A
 * Created by LinkinStar
 */
public class ConcreteCommandMachineA implements Command{

    private ReceiverA machineA;

    public ConcreteCommandMachineA(){
        machineA = new ReceiverA();
    }

    @Override
    public void execute() {
        machineA.start();
    }
}
