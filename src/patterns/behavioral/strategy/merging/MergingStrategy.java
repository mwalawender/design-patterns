package patterns.behavioral.strategy.merging;

import java.util.Collection;

/**
 * Simple example to show, how strategy pattern can be used in
 * situations where various merge algorithms can be used
 */
public interface MergingStrategy {
    void merge(Collection<Item> items);
}
