package decorator.use;

/**
 * 具体构件B
 * Created by LinkinStar
 */
public class ConcreteComponentB extends Component {
    /**
     * 获取这个奶茶的描述
     */
    public String getDescription(){
        return "无糖奶茶";
    }

    /**
     * 获取这个奶茶的价格
     */
    public double getCost(){
        return 4;
    }
}
