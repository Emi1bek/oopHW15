package oopObject.two;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Shark(),
                new Turtle(),
                new Eagle()
        };

        for (Animal i: animals) {
            if(i instanceof Shark){
                ((Shark)i).attack();
            } else if ( i instanceof Turtle/*i.getClass().getName().equals("Turtle")*/) {
                ((Turtle)i).swim();
            } else if (i instanceof Eagle) {
                ((Eagle)i).fly();
            }else{
                System.out.println("Нет такого класса!");
            }

        }

    }
}
