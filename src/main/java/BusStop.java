import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.queue = new ArrayList<Person>();
        this.name = name;
    }

    public int personCount() {
       return this.queue.size();
    }

    public void addPerson(Person person) {
        this.queue.add(person);
    }

    public Person removePerson() {
       return this.queue.remove(0);
    }
}
