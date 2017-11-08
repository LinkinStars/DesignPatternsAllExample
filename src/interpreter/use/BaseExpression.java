package interpreter.use;

/**
 * 基础表达式
 * Created by LinkinStar
 */
public class BaseExpression implements AbstractExpression{
    @Override
    public void interpret(Context context) {
        //构建需要使用的解释语法规则
        DoubleExpression doubleExpression = new DoubleExpression();
        QuotationExpression quotationExpression = new QuotationExpression();
        //判断当前环境是否已经读取完成
        while (!context.isEnd()) {
            String temp = context.next();
            //根据不同的情况使用不同的语法规则解释
            if (temp.equals("double")) {
                doubleExpression.interpret(context);
            }
            if (temp.equals("quot")) {
                quotationExpression.interpret(context);
            }
        }
    }
}
