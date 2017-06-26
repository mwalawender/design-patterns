package patterns.behavioral.strategy.fellowship.hero;

import patterns.behavioral.strategy.fellowship.action.Action;
import patterns.behavioral.strategy.fellowship.weapon.Weapon;

public class Hero {

    private final String name;
    private Weapon weapon;
    private Action action;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void prepareAction() {
        System.out.println("\n[" + name + "]" + ":");
        weapon.doAttack();
        action.doAction();
    }
}
