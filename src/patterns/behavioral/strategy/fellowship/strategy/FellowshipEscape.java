package patterns.behavioral.strategy.fellowship.strategy;

import patterns.behavioral.strategy.fellowship.action.Escape;
import patterns.behavioral.strategy.fellowship.hero.Hero;
import patterns.behavioral.strategy.fellowship.weapon.Axe;

import java.util.Collection;

public class FellowshipEscape implements FellowshipBehaviour {

    @Override
    public void doAction(Collection<Hero> heroes) {
        System.out.println("\n----------------- Fellowship - ESCAPE! -----------------");
        heroes.forEach(hero -> hero.setAction(new Escape()));
        heroes.forEach(hero -> hero.setWeapon(new Axe()));
        heroes.forEach(Hero::prepareAction);
    }
}
