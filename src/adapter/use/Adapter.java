package adapter.use;

/**
 * 适配器类-将手电筒转换为灯光
 * Created by LinkinStar
 */
public class Adapter implements Target{

    private Torch torch;

    public Adapter(Torch torch) {
        this.torch = torch;
    }

    @Override
    public void Light() {
        System.out.println(torch.light());
    }
}
