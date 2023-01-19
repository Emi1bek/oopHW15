import HW15.Circle;

public class Main {
    public static void main(String[] args) {
        EnglishCourse eng = new EnglishCourse(1,"eng NameTeacher","eng NameStudent");
        ITcourse it = new ITcourse(1,"it NameTeacher","it NameStudent");

        System.out.println(eng);
        System.out.println(it);


        Circle c = new Circle();
        c.area(2,c.p());
        c.circumference(2,c.p());
    }
}