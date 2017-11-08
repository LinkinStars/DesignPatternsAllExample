package interpreter.use;

/**
 * 使用解释器模式
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //需要解释的字符串
        String value = "double aaa quot bbb";
        //利用环境类进行描述
        Context context = new Context(value);
        //构建基础的表达式去解释
        BaseExpression baseExpression = new BaseExpression();
        //调用解释方法
        baseExpression.interpret(context);
    }
}
