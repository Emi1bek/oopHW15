package oopObject.thtree;

public class Cow extends Animal{
    public static int  counter;
    public Cow(int weigth, int age, String gender, String nickName) {
        super(weigth, age, gender, nickName);
        counter++;

    }

    public Cow() {
    }
}
