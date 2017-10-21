package command.nonuse;

/**
 * 不使用命令模式的情况
 * Created by LinkinStar
 */
public class MainTest {
    public static void main(String[] args) {
        Control control = new Control();
        control.pressFirstButton();
        control.pressSecondButton();
        /**
         * 遇到的问题：
         * 1、如果按钮对应的机器发生改变，比如第一个按钮需要控制机器B，那么需要修改代码
         * 2、如果机器的开始方法发生改变，那么需要重新编写进行控制
         * 3、如果新加入机器或者新加入按钮，修改的比较麻烦
         * 总结的来说，控制端和被控制端的耦合度高
         */
    }
}
