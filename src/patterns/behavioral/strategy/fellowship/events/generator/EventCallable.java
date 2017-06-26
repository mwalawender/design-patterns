package patterns.behavioral.strategy.fellowship.events.generator;

import patterns.behavioral.strategy.fellowship.events.StoryEvent;

import java.util.concurrent.Callable;

public class EventCallable implements Callable<StoryEvent> {
    @Override
    public StoryEvent call() throws Exception {
        return StoryEvent.getRandomEvent();
    }
}
