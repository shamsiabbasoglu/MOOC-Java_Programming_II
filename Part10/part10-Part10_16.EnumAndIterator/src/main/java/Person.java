
public class Person {

    private final String name;
    private final Education edu;

    public Person(String name, Education edu) {
        this.name = name;
        this.edu = edu;
    }

    public Education getEducation() {
        return edu;
    }

    @Override
    public String toString() {
        return name + ", " + edu;
    }
}
