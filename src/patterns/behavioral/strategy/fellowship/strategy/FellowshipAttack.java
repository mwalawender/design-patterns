package patterns.behavioral.strategy.fellowship.strategy;

import patterns.behavioral.strategy.fellowship.action.Attack;
import patterns.behavioral.strategy.fellowship.hero.Hero;
import patterns.behavioral.strategy.fellowship.weapon.Bow;

import java.util.Collection;

public class FellowshipAttack implements FellowshipBehaviour {

    @Override
    public void doAction(Collection<Hero> heroes) {
        System.out.println("\n----------------- Fellowship - ATTACK! -----------------");
        heroes.forEach(hero -> hero.setAction(new Attack()));
        heroes.forEach(hero -> hero.setWeapon(new Bow()));
        heroes.forEach(Hero::prepareAction);
    }
}
