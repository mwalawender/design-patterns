package patterns.behavioral.strategy.fellowship.weapon;

public class Sword implements Weapon {
    @Override
    public void doAttack() {
        System.out.println("Attack with sword!");
    }
}
