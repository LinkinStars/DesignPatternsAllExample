package flyweight.use;

import java.util.ArrayList;
import java.util.List;

/**
 * 享元工厂类
 * Created by LinkinStar
 */
public class FlyweightFactory {

    List<ConcreteFlyweight> treeList = new ArrayList<>();

    /**
     * 描述所有的树的位置
     */
    public void dis() {
        for (ConcreteFlyweight tempTree : treeList) {
            tempTree.dis();
        }
    }

    /**
     * 删除一个位置的树
     */
    public void delete(int x, int y) {
        for (ConcreteFlyweight tempTree : treeList) {
            if (tempTree.x == x && tempTree.y == y) {
                treeList.remove(tempTree);
            }
        }
    }

    /**
     * 建立一棵树
     */
    public void add(int x, int y, int age) {
        ConcreteFlyweight concreteFlyweight = new ConcreteFlyweight(x, y, age);
        treeList.add(concreteFlyweight);
    }
}
