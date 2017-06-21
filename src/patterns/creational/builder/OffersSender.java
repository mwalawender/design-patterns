package patterns.creational.builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Context class to show Builder pattern usage
 */
public class OffersSender {

    public static void main(String[] args) {

        Collection<OfferDTO> offers = new ArrayList<>();

        OfferDTO offerDTO = new OfferDTO.Builder()
                .withId(1L).withTitle("Pizza promotion")
                .withDescription("50% discount for second pizza!")
                .withValidFrom(LocalDateTime.of(2017, 6, 1, 12, 0)).
                        withValidTill(LocalDateTime.of(2017, 6, 7, 12, 0)).withDiscount(50).build();

        offers.add(offerDTO);

        OfferDTO anotherOfferDTO = new OfferDTO.Builder()
                .withId(2L).withTitle("Pizza promotion")
                .withDescription("Third pizza gratis!")
                .withValidFrom(LocalDateTime.of(2017, 5, 1, 12, 0)).
                        withValidTill(LocalDateTime.of(2017, 5, 7, 12, 0)).withDiscount(40).build();

        offers.add(anotherOfferDTO);
        offers.forEach(offer -> System.out.println(offer.toString()));
    }
}
