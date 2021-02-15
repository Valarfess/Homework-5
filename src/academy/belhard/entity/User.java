package academy.belhard.entity;

import academy.belhard.entity.Person;

import java.util.Objects;

public class User extends Person {

    private String email;
    public String getEmail(){ return email; }
    private String password;
    public String getPassword(){ return password; }

    public User(String firstName, String lastName,String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }
    //вариант метода №1
    public String getFullInfo() {
        String res2 = "Имя: " + firstName + " " + lastName + "\n" + "E-mail: " + email;
        return res2;
    }


//    // вариант метода №2
//    public String getFullInfo(){
//        System.out.println("Имя: " + firstName + " " + lastName + "\n" + "E-mail: " + email);
//        return "";
//    }



    public boolean isPasswordCorrect(String password) {
        return this.password.equals(password);
    }



    public int hashCode() {
        return Objects.hash(password);
    }
}