package patterns.behavioral.observer.device;

import patterns.behavioral.observer.base.Observer;
import patterns.behavioral.observer.offer.Offer;

public class Smartphone extends Observer implements Device {

    public Smartphone(Long id) {
        super(id);
    }

    public void displayNotification(Offer offer) {
        System.out.println("\n=============== New offer from shop: ===============" + "\nTopic: " + offer.getTopic() + "\nPromotion: " + offer.getPromotion() + "\n====================================================");
    }

    public void update(Offer offer) {
        System.out.println("\nReceived update from shop, lets display offer on Smartphone with id:  " + getId());
        displayNotification(offer);
    }
}
