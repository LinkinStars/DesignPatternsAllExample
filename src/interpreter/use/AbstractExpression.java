package interpreter.use;

/**
 * 抽象表达式
 * Created by LinkinStar
 */
public interface AbstractExpression {
    /**
     * 解释当前语句
     */
    void interpret(Context context);
}
