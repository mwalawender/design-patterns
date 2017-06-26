package patterns.behavioral.strategy.fellowship.strategy;

import patterns.behavioral.strategy.fellowship.action.Defense;
import patterns.behavioral.strategy.fellowship.hero.Hero;
import patterns.behavioral.strategy.fellowship.weapon.Sword;

import java.util.Collection;

public class FellowshipDefense implements FellowshipBehaviour {

    @Override
    public void doAction(Collection<Hero> heroes) {
        System.out.println("\n----------------- Fellowship - DEFENSE! -----------------");
        heroes.forEach(hero -> hero.setAction(new Defense()));
        heroes.forEach(hero -> hero.setWeapon(new Sword()));
        heroes.forEach(Hero::prepareAction);
    }
}
