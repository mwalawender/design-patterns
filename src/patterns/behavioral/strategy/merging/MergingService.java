package patterns.behavioral.strategy.merging;

import java.util.Collection;

public class MergingService {

    private final String serviceName;
    private MergingStrategy mergingStrategy;

    public MergingService(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setMergingStrategy(MergingStrategy mergingStrategy) {
        this.mergingStrategy = mergingStrategy;
    }

    public void merge(Collection<Item> items) {
        System.out.println("\nLet's make some merging!");
        mergingStrategy.merge(items);
    }

    public String getServiceName() {
        return serviceName;
    }
}
