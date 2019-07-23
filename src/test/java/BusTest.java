import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Person person;
    private Bus bus;

    @Before
    public void setUp(){
        bus = new Bus("Millwall", 4);
        person = new Person();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cannotAddPassengerIfAboveCapacity() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(4, bus.passengerCount());
        bus.addPassenger(person);
        assertEquals(4, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }


}
