package oopObject.thtree;

public class Sheep extends Animal{
    public static int counter;
    public Sheep(int weigth, int age, String gender, String nickName) {
        super(weigth, age, gender, nickName);
        counter++;

    }

    public Sheep() {
    }
}
