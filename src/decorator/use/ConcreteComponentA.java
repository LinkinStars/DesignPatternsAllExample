package decorator.use;

/**
 * 具体构件A
 * Created by LinkinStar
 */
public class ConcreteComponentA extends Component {
    /**
     * 获取这个奶茶的描述
     */
    public String getDescription(){
        return "原味奶茶";
    }

    /**
     * 获取这个奶茶的价格
     */
    public double getCost(){
        return 5;
    }
}
