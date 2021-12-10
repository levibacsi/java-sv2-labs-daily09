package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{
    private double discount;

    public FrontOfStageTicket(String name, LocalDateTime date, int price, double discount) {
        super(name, date, price);
        this.discount = discount;
    }

    @Override
    public LocalTime entryTime(){
        return LocalTime.of(getDate().getHour()-2, getDate().getMinute());

    }

    public double getDiscount() {
        return discount;
    }
}
