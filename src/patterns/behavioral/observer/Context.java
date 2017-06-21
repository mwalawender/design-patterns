package patterns.behavioral.observer;

import patterns.behavioral.observer.device.Smartphone;
import patterns.behavioral.observer.device.Smartwatch;
import patterns.behavioral.observer.offer.Offer;

public class Context {

    public static void main(String[] args) {
        OnlineShop fancyClothesShop = new OnlineShop("FancyForFree.com");

        Smartphone iphone = new Smartphone(123L);
        Smartphone galaxy = new Smartphone(456L);
        Smartphone lumia = new Smartphone(789L);

        Smartwatch iwatch = new Smartwatch(111L);
        Smartwatch gear = new Smartwatch(222L);

        fancyClothesShop.register(iphone);
        fancyClothesShop.register(galaxy);
        fancyClothesShop.register(lumia);
        fancyClothesShop.register(iwatch);
        fancyClothesShop.register(gear);


        for (int i = 0; i < 10; i++) {
            fancyClothesShop.setOffer(new Offer((long) i, "Dress of the day", (100 - 5 * i) + " % discount for only for today!"));
        }

        System.out.println("\n===============================================NEW ARRIVAL===============================================\n");

        fancyClothesShop.unregister(galaxy);
        fancyClothesShop.unregister(lumia);
        fancyClothesShop.unregister(iwatch);

        for (int i = 0; i < 10; i++) {
            fancyClothesShop.setOffer(new Offer((long) i, "Dress of the day", (100 - 5 * i) + " % discount for only for today!"));
        }
    }
}
