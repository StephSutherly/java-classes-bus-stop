import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void setUp(){
        busStop = new BusStop("Stockbridge");
        person = new Person();
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.personCount());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.personCount());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.personCount());
        busStop.removePerson();
        assertEquals(0, busStop.personCount());
    }
}
