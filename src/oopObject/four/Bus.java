package oopObject.four;

public class Bus extends Transport{
    private Driver nameDriver;
    private String nameSaleman;

    public Bus(int id, int yearOfIssue, String color, Driver nameDriver, String nameSaleman) {
        super(id, yearOfIssue, color);
        this.nameDriver = nameDriver;
        this.nameSaleman = nameSaleman;
    }

    public Bus(int id, int yearOfIssue, String color) {
        super(id, yearOfIssue, color);
    }

    public Driver  getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(Driver nameDriver) {
        this.nameDriver = nameDriver;
    }

    public String getNameSaleman() {
        return nameSaleman;
    }

    public void setNameSaleman(String nameSaleman) {
        this.nameSaleman = nameSaleman;
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
