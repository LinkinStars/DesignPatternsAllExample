package memento.use;

/**
 * 原发器
 * Created by LinkinStar
 */
public class Originator {

    public int x;
    public int y;

    public Originator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Memento save(){
        return new Memento(this.x, this.y);
    }

    public void restore(Memento memento){
        this.x = memento.x;
        this.y = memento.y;
    }
}
