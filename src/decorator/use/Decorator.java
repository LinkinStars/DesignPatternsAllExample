package decorator.use;

/**
 * 抽象装饰类
 * Created by LinkinStar
 */
public abstract class Decorator extends Component {
    /**
     * 每个具体的装饰都需要进行描述
     */
    public abstract String getDescription();
}
