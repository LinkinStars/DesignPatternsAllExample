package observer.use;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体目标
 * Created by LinkinStar
 */
public class ConcreteSubject implements Subject {
    List<Obeserver> obeserverList = new ArrayList<Obeserver>();

    public void register(Obeserver obeserver) {
        obeserverList.add(obeserver);
    }

    public void remove(Obeserver obeserver) {
        obeserverList.remove(obeserver);
    }

    public void notifyObserver(String message) {
        for (Obeserver tempObeserver : obeserverList) {
            tempObeserver.update(message);
        }
    }
}
