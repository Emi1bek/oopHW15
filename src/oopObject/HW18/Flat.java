package oopObject.HW18;

public abstract class Flat {
    private String tip;
    private int room;
    private double area;
    private String addres;

    protected Flat() {
    }

    public Flat(String tip, int room, double area, String addres) {
        this.tip = tip;
        this.room = room;
        this.area = area;
        this.addres = addres;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "tip='" + tip + '\'' +
                ", room=" + room +
                ", area=" + area +
                ", addres='" + addres + '\'' +
                '}';
    }
}
