import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Person person;
    private Bus bus;
    private BusStop busStop;

    @Before
    public void setUp(){
        bus = new Bus("Millwall", 4);
        person = new Person();
        busStop = new BusStop("Stockbridge");
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.passengerCount());

    }

    @Test
    public void cannotAddPassengerIfAboveCapacity() {
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        assertEquals(4, bus.passengerCount());
        bus.addPassengerFromBusStop(busStop);
        assertEquals(4, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.passengerCount());
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }


}
