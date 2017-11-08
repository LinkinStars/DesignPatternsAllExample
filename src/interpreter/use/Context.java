package interpreter.use;

/**
 * 环境类
 * Created by LinkinStar
 */
public class Context {

    private int index = 0;
    private String[] context;

    public Context(String expression) {
        context = expression.split(" ");
    }

    /**
     * 获取表达式中的下一个值
     */
    public String next() {
        return context[index++];
    }

    /**
     * 判断当前是否已经结束
     */
    public boolean isEnd() {
        return context.length == index;
    }
}
