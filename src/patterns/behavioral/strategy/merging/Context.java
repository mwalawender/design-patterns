package patterns.behavioral.strategy.merging;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Context {

    public static void main(String[] args) {

        // just dummy collection, single element properties without any special sense
        List<Item> items = Arrays.asList(new Item("email1@.gmail.com", LocalDateTime.now(), "123456789", "user1"),
                new Item("email1@.gmail.com", LocalDateTime.now(), "22222222", "user2"),
                new Item("email2@.gmail.com", LocalDateTime.now(), "22222222", "user1"));

        MergingService mergingService = new MergingService("My fancy merging service!");

        // first attempt,  merge elements by date
        mergingService.setMergingStrategy(new MergeByDate());
        mergingService.merge(items);

        // second attempt, merge elements by email
        mergingService.setMergingStrategy(new MergeByEmail());
        mergingService.merge(items);

        // third attempt, merge elements by user
        mergingService.setMergingStrategy(new MergeByUser());
        mergingService.merge(items);

        // last attempt, merge elements by phone number
        mergingService.setMergingStrategy(new MergeByPhoneNumber());
        mergingService.merge(items);
    }

}
