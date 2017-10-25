package facade.nunuse;

/**
 * 不使用外观模式的情况
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        SubSystemA subSystemA = new SubSystemA();
        SubSystemB subSystemB = new SubSystemB();
        SubSystemC subSystemC = new SubSystemC();

        subSystemA.stepOne();
        subSystemB.stepOne();
        subSystemC.stepOne();
        subSystemA.stepTwo();
        subSystemB.stepTwo();
        subSystemC.stepTwo();

        /**
         * 遇到的问题：
         * 客户端的逻辑步骤过多，看起来逻辑过于复杂
         */
    }
}
