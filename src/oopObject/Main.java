package oopObject;

public class Main {
    public static void main(String[] args) {
        Person[] person = {
                new Dancer(),
                new Programmer(),
                new Singer()
        };

        for (Person i: person
             ) {
            i.walk();

        }

    }
}
