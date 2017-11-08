package mediator.use;

/**
 * 具体中介者
 * Created by LinkinStar
 */
public class ConcreteMediator implements Mediator{

    @Override
    public void morning() {
        ConcreteColleagueSun.rise();
        ConcreteColleagueMoon.down();
        ConcreteColleagueMan.getUp();
    }

    @Override
    public void evening() {
        ConcreteColleagueSun.down();
        ConcreteColleagueMoon.rise();
        ConcreteColleagueMan.goBed();
    }
}
