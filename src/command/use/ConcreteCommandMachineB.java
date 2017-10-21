package command.use;

/**
 * 具体命令类-用于操作机器A
 * Created by LinkinStar
 */
public class ConcreteCommandMachineB implements Command{

    private ReceiverB machineB;

    public ConcreteCommandMachineB(){
        machineB = new ReceiverB();
    }

    @Override
    public void execute() {
        machineB.start();
    }
}
