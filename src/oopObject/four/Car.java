package oopObject.four;

public class Car extends Transport{
    private String nameDriver;

    public Car(int id, int yearOfIssue, String color, String  nameDriver) {
        super(id, yearOfIssue, color);
        this.nameDriver = nameDriver;
    }

    public Car(int id, int yearOfIssue, String color) {
        super(id, yearOfIssue, color);
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String  nameDriver) {
        this.nameDriver = nameDriver;
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + getId() +
                ", yearOfIssue=" + getYearOfIssue() +
                ", color='" + getColor() + '\'' + "nameDriver= "+ nameDriver+
                '}';
    }
}
