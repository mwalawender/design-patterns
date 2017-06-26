package patterns.behavioral.strategy.fellowship.strategy;

import patterns.behavioral.strategy.fellowship.action.DrinkLotOfBeer;
import patterns.behavioral.strategy.fellowship.hero.Hero;
import patterns.behavioral.strategy.fellowship.weapon.NoWeapon;

import java.util.Collection;

public class FellowshipCheersAndDrink implements FellowshipBehaviour {

    @Override
    public void doAction(Collection<Hero> heroes) {
        System.out.println("\n----------------- Fellowship - CHEERS AND DRINK! -----------------");
        heroes.forEach(hero -> hero.setAction(new DrinkLotOfBeer()));
        heroes.forEach(hero -> hero.setWeapon(new NoWeapon()));
        heroes.forEach(Hero::prepareAction);
    }
}
