import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.passengers = new ArrayList<Person>();
        this.capacity = capacity;
        this.destination = destination;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassengerFromBusStop(BusStop busStop) {
        Person person = busStop.removePerson();
        if(passengerCount() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
