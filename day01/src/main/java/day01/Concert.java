package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person, LocalTime time) {

        if (time.isAfter(person.getTicket().entryTime())) {
            personList.add(person);
        } else {
            throw new IllegalArgumentException("Too early to enter");
        }
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
