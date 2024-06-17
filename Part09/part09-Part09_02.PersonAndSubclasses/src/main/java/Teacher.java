
public class Teacher extends Person {

    private int salary;

    public Teacher(String person, String address, int salary) {
        super(person, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n  " + "salary " + salary + " euro/month";
    }
}
