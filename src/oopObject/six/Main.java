package oopObject.six;

public class Main {

    public static void main(String[] args) {
        Wolf wolf = new Wolf("Seriy",12);
        Rabbit rabbit = new Rabbit("Pfz",13,wolf);
        rabbit.eating();
    }
}
