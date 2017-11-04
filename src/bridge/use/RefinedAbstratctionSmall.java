package bridge.use;

/**
 * 扩充抽象类-小号笔
 * Created by LinkinStar
 */
public class RefinedAbstratctionSmall extends AbstractionPen{

    @Override
    public void dis() {
        System.out.print("用小号的笔画出");
        this.color.color();
    }

    @Override
    public void setColor(ImplementorColor color) {
        this.color = color;
    }
}
