package patterns.behavioral.observer.offer;

import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 * Created by Michal on 2017-06-20.
 */

@Immutable
public class Offer {

    private final Long id;
    private final String topic;
    private final String promotion;

    public Offer(Long id, String topic, String promotion) {
        this.id = id;
        this.topic = topic;
        this.promotion = promotion;
    }

    public Long getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public String getPromotion() {
        return promotion;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", promotion='" + promotion + '\'' +
                '}';
    }
}
