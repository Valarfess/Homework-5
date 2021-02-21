package academy.belhard.entity;

public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFullName() {
        String res1 = firstName + " " + lastName;
        return res1;
    }
}
