
public class Person {

    private String person;
    private String address;

    public Person(String person, String address) {
        this.person = person;
        this.address = address;
    }

    @Override
    public String toString() {
        return person
                + "\n  " + address;
    }
}
