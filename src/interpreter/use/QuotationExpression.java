package interpreter.use;

/**
 * quotation表达式
 * Created by LinkinStar
 */
public class QuotationExpression implements AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.print(" '" + context.next() + "' ");
    }
}
