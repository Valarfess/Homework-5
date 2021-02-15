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
    //вариант метода №1
    public String getFullName() {
        String res1 = firstName + " " + lastName;
        return res1;
    }
//    //вариант метода №2
//    public String getFullName(){
//        System.out.println(firstName + " " + lastName);
//        return "";
//   }




}
