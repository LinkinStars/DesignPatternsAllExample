package bridge.use;

/**
 * 扩充抽象类-大号笔
 * Created by LinkinStar
 */
public class RefinedAbstratctionBig extends AbstractionPen{

    @Override
    public void dis() {
        System.out.print("用大号的笔画出");
        this.color.color();
    }

    @Override
    public void setColor(ImplementorColor color) {
        this.color = color;
    }
}
