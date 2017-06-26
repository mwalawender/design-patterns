package patterns.behavioral.strategy.fellowship.strategy;

import patterns.behavioral.strategy.fellowship.hero.Hero;

import java.util.Collection;

public interface FellowshipBehaviour {
    void doAction(Collection<Hero> heroes);
}
