package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConcertMain {
    public static void main(String[] args) {
        Person personOrdinary = new Person(new Ticket("GnR", LocalDateTime.now(), 10000));
        Person personVip = new Person(new FrontOfStageTicket("GnR", LocalDateTime.now(), 15000, 5.5));

        Concert concert = new Concert();

        concert.addPerson(personOrdinary, LocalTime.now());

        try {
            concert.addPerson(personVip, LocalTime.of(8, 1));
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        System.out.println(concert.getPersonList().size());
        System.out.println(concert.getPersonList().get(0).getTicket().getName());
    }
}
