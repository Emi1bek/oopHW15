package oopObject.HW18;

public class Hostel extends Flat implements FlatInterface{
    public Hostel() {
    }

    public Hostel(String tip, int room, double area, String addres) {
        super(tip, room, area, addres);
    }

    @Override
    public void method() {
        System.out.println("tip: "+getTip() + " room: "+getRoom()+" area: "+getArea()+"addres: "+ getAddres());
    }
}
