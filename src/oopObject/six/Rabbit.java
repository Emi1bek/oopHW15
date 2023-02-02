package oopObject.six;

public class Rabbit extends Animal implements Eatable{

    private Wolf wolf;


    public Rabbit(String name, int age, Wolf wolf) {
        super(name, age);
        this.wolf = wolf;
    }


    @Override
    public void eating() {
        System.out.println(" "+ wolf.getName() +" аттуу карышкыр,  "+getName()+" аттуу коенду жейт");
    }
}
