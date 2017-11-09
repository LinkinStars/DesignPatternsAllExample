package memento.use;

/**
 * 负责任
 * Created by LinkinStar
 */
public class Caretaker {

    //该对象就是当前用于保存的备忘录，实际中可以使用不同的数据结构进行存放多个，这里例子中只能存放一个备忘录
    public Memento memento;
}
