package day01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String name;
    private static LocalDateTime date;
    private int price;

    public Ticket(String name, LocalDateTime date, int price) {
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public LocalTime entryTime(){
        return LocalTime.of(date.getHour()-1, date.getMinute());
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }
}
