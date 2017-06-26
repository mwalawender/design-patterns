package patterns.behavioral.strategy.fellowship.action;

public class Attack implements Action {
    @Override
    public void doAction() {
        System.out.println("Let's attack!");
    }
}
