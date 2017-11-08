package interpreter.use;

/**
 * double表达式
 * Created by LinkinStar
 */
public class DoubleExpression implements AbstractExpression{
    @Override
    public void interpret(Context context) {
        String temp = context.next();
        System.out.print(" " + temp + " ");
        System.out.print(" " + temp + " ");
    }
}
