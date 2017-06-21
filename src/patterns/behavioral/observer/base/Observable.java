package patterns.behavioral.observer.base;


public interface Observable {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

}
