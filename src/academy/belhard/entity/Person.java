package academy.belhard.entity;

public class Person {
    protected String firstName;
    public String getFirstName(){ return firstName; }
    protected String lastName;
    public String getLastName(){ return lastName; }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        String res1 = firstName + " " + lastName;
        return res1;
    }
}
