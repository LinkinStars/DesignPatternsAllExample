package composite.use;

import java.util.ArrayList;

/**
 * 容器构件
 * Created by LinkinStar
 */
public class Composite extends Component {

    /**
     * 当前容器构件的数据
     */
    public Iterator iterator = null;

    /**
     * 当前容器所有子节点的数据
     */
    public ArrayList<Component> list = new ArrayList<>();

    /**
     * 构造时初始化本容器的构件数据
     */
    public Composite(Iterator iterator){
        this.iterator = iterator;
    }

    /**
     * 打印数据，先打印当前构件的数据，然后递归所有子节点数据
     */
    @Override
    public void print(){
        while (iterator != null && iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Component component : list) {
            component.print();
        }
    }

}
