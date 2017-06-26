package patterns.behavioral.strategy.fellowship.weapon;

public class NoWeapon implements Weapon {
    @Override
    public void doAttack() {
        System.out.println("No attack ! - weapon is not required!");
    }
}
