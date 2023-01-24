package oopObject.thtree;

public class Horse extends Animal{
    public static int counter;
    public Horse(int weigth, int age, String gender, String nickName) {
        super(weigth, age, gender, nickName);
        counter++;
    }

    public Horse() {
    }
}
