package patterns.behavioral.strategy.merging;

import com.sun.istack.internal.NotNull;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.time.LocalDateTime;

@Immutable
public class Item {

    @NotNull
    private final String email;

    @NotNull
    private final LocalDateTime dateTime;

    @NotNull
    private final String phoneNumber;

    @NotNull
    private final String user;

    public Item(String email, LocalDateTime dateTime, String phoneNumber, String user) {
        this.email = email;
        this.dateTime = dateTime;
        this.phoneNumber = phoneNumber;
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Item{" +
                "email='" + email + '\'' +
                ", dateTime=" + dateTime +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
