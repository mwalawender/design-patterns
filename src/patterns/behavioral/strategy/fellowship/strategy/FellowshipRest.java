package patterns.behavioral.strategy.fellowship.strategy;

import patterns.behavioral.strategy.fellowship.action.DoNothing;
import patterns.behavioral.strategy.fellowship.hero.Hero;
import patterns.behavioral.strategy.fellowship.weapon.NoWeapon;

import java.util.Collection;

public class FellowshipRest implements FellowshipBehaviour {

    @Override
    public void doAction(Collection<Hero> heroes) {
        System.out.println("\n----------------- Fellowship - REST! -----------------");
        heroes.forEach(hero -> hero.setAction(new DoNothing()));
        heroes.forEach(hero -> hero.setWeapon(new NoWeapon()));
        heroes.forEach(Hero::prepareAction);
    }
}
