package patterns.behavioral.strategy.merging;

import java.util.Collection;

public class MergeByUser implements MergingStrategy {
    @Override
    public void merge(Collection<Item> items) {
        System.out.println("Picked merging by user strategy!");
    }
}
