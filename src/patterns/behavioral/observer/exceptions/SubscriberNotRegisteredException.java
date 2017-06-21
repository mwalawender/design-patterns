package patterns.behavioral.observer.exceptions;

public class SubscriberNotRegisteredException extends RuntimeException {

    public SubscriberNotRegisteredException(String message) {
        super(message);
    }
}
