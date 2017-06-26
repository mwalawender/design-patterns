package patterns.behavioral.strategy.fellowship.action;

public class Escape implements Action {
    @Override
    public void doAction() {
        System.out.println("Escape!");
    }
}
