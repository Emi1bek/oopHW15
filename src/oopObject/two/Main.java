package oopObject.two;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Shark(),
                new Turtle(),
                new Eagle()
        };
        Shark shar = new Shark();
        System.out.println(shar.getClass().getName().equals("Turtle"));// == false болуп атат тушунбой атам эмнеге

        for (Animal i: animals) {
            if(i instanceof Shark){
                ((Shark)i).attack();
            } else if (i.getClass().getName().equals("Turtle")) {
                ((Turtle)i).swim();
                /*Че то интел айж нин жаны версиясында
                башкача ищтейт окшойт сабакка караганда true
                болуш керек эле но false болуп атат*/
            } else if (i.getClass().getName().equals("Eagle")) {
                ((Eagle)i).fly();
            }else{
                System.out.println("Нет такого класса!");
            }

        }

    }
}
