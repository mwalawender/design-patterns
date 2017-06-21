package patterns.behavioral.observer.exceptions;

public class SubscriberAlreadyRegisteredException extends RuntimeException {

    public SubscriberAlreadyRegisteredException(String message) {
        super(message);
    }
}
