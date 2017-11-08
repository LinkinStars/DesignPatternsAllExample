package flyweight.nunuse;

/**
 * 不使用享元模式的情况
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        Tree treeA = new Tree(1, 1, 1);
        Tree treeB = new Tree(2, 2, 2);
        Tree treeC = new Tree(3, 3, 3);

        treeA.dis();
        treeB.dis();
        treeC.dis();

        /**
         * 遇到的问题：
         * 当有很多数量的树需要构建的时候我们很难进行维护和管理
         */
    }
}
