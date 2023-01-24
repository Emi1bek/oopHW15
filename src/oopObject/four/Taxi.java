package oopObject.four;

public class Taxi extends Transport{
    private String taxiDriverName;

    public Taxi(int id, int yearOfIssue, String color, String taxiDriverName) {
        super(id, yearOfIssue, color);
        this.taxiDriverName = taxiDriverName;
    }


    public String getTaxiDriverName() {
        return taxiDriverName;
    }

    public void setTaxiDriverName(String taxiDriverName) {
        this.taxiDriverName = taxiDriverName;
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
                ", color='" + getColor() + '\'' + "name= "+ taxiDriverName+
                '}';
    }

}
