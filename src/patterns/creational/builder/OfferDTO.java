package patterns.creational.builder;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.time.LocalDateTime;


/**
 * Simple example which shows how Builder pattern can be used in real life, like here to create immutable DTO's
 * This approach is recommended in Effective Java book :)
 */
@Immutable
public class OfferDTO {

    private final Long id;
    private final String title;
    private final String description;
    private final LocalDateTime validFrom;
    private final LocalDateTime validTill;
    private final int percentageDiscount;

    private OfferDTO(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.validFrom = builder.validFrom;
        this.validTill = builder.validTill;
        this.percentageDiscount = builder.discount;
    }

    // Getters

    @Override
    public String toString() {
        return "OfferDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", validFrom=" + validFrom +
                ", validTill=" + validTill +
                ", percentageDiscount=" + percentageDiscount +
                '}';
    }

    public static final class Builder {
        private Long id;
        private String title;
        private String description;
        private LocalDateTime validFrom;
        private LocalDateTime validTill;
        private int discount;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withValidFrom(LocalDateTime validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        public Builder withValidTill(LocalDateTime validTill) {
            this.validTill = validTill;
            return this;
        }

        public Builder withDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public OfferDTO build() {
            return new OfferDTO(this);
        }
    }
}
