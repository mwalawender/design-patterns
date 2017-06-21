package patterns.behavioral.observer.base;

import patterns.behavioral.observer.offer.Offer;

public abstract class Observer {

    private final Long id;

    protected Observer(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public abstract void update(Offer offer);
}
