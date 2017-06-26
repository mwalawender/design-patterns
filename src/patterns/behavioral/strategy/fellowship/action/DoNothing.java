package patterns.behavioral.strategy.fellowship.action;

public class DoNothing implements Action {
    @Override
    public void doAction() {
        System.out.println("Let's do nothing!");
    }
}
