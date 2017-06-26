package patterns.behavioral.strategy.fellowship.weapon;

public class Bow implements Weapon {
    @Override
    public void doAttack() {
        System.out.println("Attack by bow!");
    }
}
