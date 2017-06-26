package patterns.behavioral.strategy.fellowship.events;

import java.util.Random;

public enum StoryEvent {
    DRAGON_ATTACK, FRIEND_COMING, ORC_ARMY_ATTACK, REST, FEW_GHOULS;

    public static StoryEvent getRandomEvent() {
        return values()[new Random().nextInt(values().length)];
    }
}
