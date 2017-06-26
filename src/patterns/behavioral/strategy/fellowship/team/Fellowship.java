package patterns.behavioral.strategy.fellowship.team;

import patterns.behavioral.strategy.fellowship.events.StoryEvent;
import patterns.behavioral.strategy.fellowship.hero.Hero;
import patterns.behavioral.strategy.fellowship.strategy.*;

import java.util.Collection;

public class Fellowship {

    private final String name;
    private FellowshipBehaviour fellowshipBehaviour;
    private Collection<Hero> heroes;

    public Fellowship(String name) {
        this.name = name;
    }

    // just for simple show purposes
    public void reactToTheEvent(StoryEvent event) {
        switch (event) {
            case DRAGON_ATTACK:
                setFellowshipBehaviour(new FellowshipAttack());
                doAction();
                break;
            case FRIEND_COMING:
                setFellowshipBehaviour(new FellowshipCheersAndDrink());
                doAction();
                break;
            case REST:
                setFellowshipBehaviour(new FellowshipRest());
                doAction();
                break;
            case ORC_ARMY_ATTACK:
                setFellowshipBehaviour(new FellowshipEscape());
                doAction();
                break;
            case FEW_GHOULS:
                setFellowshipBehaviour(new FellowshipDefense());
                doAction();
                break;
        }
    }

    public void setFellowshipBehaviour(FellowshipBehaviour fellowshipBehaviour) {
        this.fellowshipBehaviour = fellowshipBehaviour;
    }

    public void doAction() {
        System.out.println("\n[" + name + "]" + " ACTION! :");
        fellowshipBehaviour.doAction(heroes);
    }

    public void setHeroes(Collection<Hero> heroes) {
        this.heroes = heroes;
    }
}
