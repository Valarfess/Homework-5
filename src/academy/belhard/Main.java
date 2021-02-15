package academy.belhard;

import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {

        User Slave = new User("Alex", "Pupkin", "Alexpupkin@mail.ru","password");
        System.out.println(Slave.getFullInfo());
        System.out.println(Slave.isPasswordCorrect("password"));
        // write your code here
    }
}
