package patterns.behavioral.strategy.fellowship;

import patterns.behavioral.strategy.fellowship.action.DrinkLotOfBeer;
import patterns.behavioral.strategy.fellowship.events.StoryEvent;
import patterns.behavioral.strategy.fellowship.events.generator.EventCallable;
import patterns.behavioral.strategy.fellowship.hero.Hero;
import patterns.behavioral.strategy.fellowship.team.Fellowship;
import patterns.behavioral.strategy.fellowship.weapon.NoWeapon;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Story {

    private static final int EVENTS_AMOUNT = 5;

    public static void main(String[] args) {
        // lets create our fellowship, they are sitting in pub and drink some beer :D
        Hero guardian = new Hero("Mr Guardian");
        guardian.setWeapon(new NoWeapon());
        guardian.setAction(new DrinkLotOfBeer());

        Hero dwarf = new Hero("Mr dwarf");
        dwarf.setWeapon(new NoWeapon());
        dwarf.setAction(new DrinkLotOfBeer());

        Hero elf = new Hero("Mr Elf");
        elf.setWeapon(new NoWeapon());
        elf.setAction(new DrinkLotOfBeer());

        Fellowship fellowship = new Fellowship("Best fellowship ever...");
        fellowship.setHeroes(Arrays.asList(guardian, dwarf, elf));

        // some fun with util.concurrent
        ExecutorService eventGenerator = Executors.newSingleThreadExecutor();
        for (int i = 0; i < EVENTS_AMOUNT; i++) {
            try {
                Thread.sleep(1000);
                Future<StoryEvent> event = eventGenerator.submit(new EventCallable());
                fellowship.reactToTheEvent(event.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        eventGenerator.shutdown();
    }
}
