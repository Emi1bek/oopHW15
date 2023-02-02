package oopObject.HW18;

import javax.sound.midi.Soundbank;

public class Apartment extends Flat implements FlatInterface{
    public Apartment() {
    }

    public Apartment(String tip, int room, double area, String addres) {
        super(tip, room, area, addres);
    }

    @Override
    public void method() {
        System.out.println("tip: "+getTip() + " room: "+getRoom()+" area: "+getArea()+"addres: "+ getAddres());
    }

}
