package oopObject.thtree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cow(6,2,"Уй","Кашка1"),
                new Cow(5,2,"Уй","Кашка2"),
                new Cow(4,2,"Уй","Кашка3"),
                new Cow(3,2,"Уй","Кашка4"),
                new Cow(2,2,"Уй","Кашка5"),
                new Cow(1,2,"Уй","Кашка6"),
                new Horse(3,3,"Жылкы1","Жылкы1"),
                new Horse(3,3,"Жылкы2","Жылкы2"),
                new Horse(3,3,"Жылкы3","Жылкы3"),
                new Sheep(1,2,"Кой1","Кой1"),
                new Sheep(1,2,"Кой2","Кой2"),
                new Sheep(1,2,"Кой3","Кой3"),
                new Sheep(1,2,"Кой4","Кой4"),};

        Cow[] cows = new Cow[Cow.counter];
        Horse[] horses = new Horse[Horse.counter];
        Sheep[] sheeps = new  Sheep[Sheep.counter];
        int cowInt = 0;
        int horseInt =0;
        int sheepInt=0;
        for (Animal animal: animals
             ) {
            if (animal instanceof Cow){
                cows[cowInt] = (Cow) animal;
                cowInt++;
            } else if (animal instanceof Horse) {
                horses[horseInt] =(Horse) animal;
                horseInt++;
            } else {
                sheeps[sheepInt] =(Sheep) animal;
                sheepInt++;
            }

        }

        System.out.println(cows[1]);
      //  Farm farm =new Farm("sda",new Animal[] = new Cow {cows[1],cows[2],cows[3]}, new Horse[2], new Sheep[2], "asd" );

       // System.out.println(farm);
    }

}
