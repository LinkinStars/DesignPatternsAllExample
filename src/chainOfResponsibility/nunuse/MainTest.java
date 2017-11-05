package chainOfResponsibility.nunuse;

/**
 * 不使用责任链模式的情况下
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solve(50);
        solution.solve(500);
        solution.solve(5000);

        /**
         *  首先说明一下例子的问题
         *  1、这例子是模拟了现实中复杂的相同请求的不同处理过程
         *  我们经常遇到的情况就是使用if判断，然后根据传入的参数不同执行不同的业务逻辑
         *  而其实处理的请求是相同的，可能是因为处理的权限不同，可能是处理的方式不同等等
         *  2、例子中遇到的问题就是一个类需要处理的请求责任过大耦合度高
         */
    }
}
