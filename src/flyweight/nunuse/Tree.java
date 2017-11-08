package flyweight.nunuse;

/**
 * 树
 * Created by LinkinStar
 */
public class Tree {

    //我们维护一棵树的坐标
    int x;
    int y;
    //树的年龄
    int age;

    public Tree(int x, int y, int age) {
        this.x = x;
        this.y = y;
        this.age = age;
    }

    public void dis() {
        System.out.println("这棵树的位置在：" + x + ", " + y + "  树龄为：" + age);
    }
}
