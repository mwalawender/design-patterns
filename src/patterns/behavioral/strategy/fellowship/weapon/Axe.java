package patterns.behavioral.strategy.fellowship.weapon;

public class Axe implements Weapon {
    @Override
    public void doAttack() {
        System.out.println("Attack with axe!");
    }
}
