package oopObject.four;

public class Bus extends Transport{
    private String nameDriver;
    private String nameSaleman;

    public Bus(int id, int yearOfIssue, String color, String nameDriver, String nameSaleman) {
        super(id, yearOfIssue, color);
        this.nameDriver = nameDriver;
        this.nameSaleman = nameSaleman;
    }

    public Bus(int id, int yearOfIssue, String color) {
        super(id, yearOfIssue, color);
    }

    public String  getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
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
