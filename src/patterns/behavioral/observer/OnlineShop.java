package patterns.behavioral.observer;

import patterns.behavioral.observer.base.Observable;
import patterns.behavioral.observer.base.Observer;
import patterns.behavioral.observer.exceptions.SubscriberAlreadyRegisteredException;
import patterns.behavioral.observer.exceptions.SubscriberNotRegisteredException;
import patterns.behavioral.observer.offer.Offer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Michal on 2017-06-20.
 */
public class OnlineShop implements Observable {

    private final String name;
    private final Collection<Observer> subscribers = new ArrayList<>();
    private Offer offer;

    public OnlineShop(String name) {
        this.name = name;
    }

    public void register(Observer observer) {
        if (subscribers.contains(observer)) {
            throw new SubscriberAlreadyRegisteredException("User already exist on subscribers list!");
        }
        subscribers.add(observer);
        System.out.println("Register device with id: " + observer.getId());
    }

    public void unregister(Observer observer) {
        if (!subscribers.contains(observer)) {
            throw new SubscriberNotRegisteredException("User is not exist on subscribers list!");
        } else {
            subscribers.remove(observer);
        }
        System.out.println("Unregister device with id: " + observer.getId());
    }

    public void notifyObservers() {
        subscribers.forEach(observer -> observer.update(offer));
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
        notifyObservers();
    }
}
