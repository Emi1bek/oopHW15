package HW15;

public class Circle {
    private  double p;


    public static double p(){
        final double p = 3.14;
        return p;
    }

    public static void area(double r,double p){
        double sum= p*(r*r);
        System.out.println(sum);

    }
    public static void  circumference(double r,double p){
        double sum= 2*p*r;
        System.out.println(sum);
    }
}
