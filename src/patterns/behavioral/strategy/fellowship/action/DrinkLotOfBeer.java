package patterns.behavioral.strategy.fellowship.action;

public class DrinkLotOfBeer implements Action {
    @Override
    public void doAction() {
        System.out.println("Let's have fun and drink some beer!");
    }
}
