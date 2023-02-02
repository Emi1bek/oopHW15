package oopObject.HW18;

public class Hotel extends Flat implements FlatInterface{
    public Hotel() {
    }

    public Hotel(String tip, int room, double area, String addres) {
        super(tip, room, area, addres);
    }

    @Override
    public void method() {
        System.out.println("tip: "+getTip() + " room: "+getRoom()+" area: "+getArea()+"addres: "+ getAddres()+" Вы плотите за аренду!");
    }
}
