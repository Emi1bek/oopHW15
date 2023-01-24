package oopObject.four;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Uson","adc",25,4);
        TaxiDriver taxiDriver = new TaxiDriver("NameTaxiDriver","adc",26,7);
        Salesman salesman = new Salesman("nameSalesman","adc",30,10);


        // Bus bus = new Bus(1,2023,"Balck",salesman.getName());
        Car car = new Car(1,2022,"Blue",driver.getName());
        Taxi taxi = new Taxi(1,1990,"Black",taxiDriver.getName());

        System.out.println(car);
       // System.out.println(bus);
        System.out.println(taxi);



    }
}
