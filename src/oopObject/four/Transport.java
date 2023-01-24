package oopObject.four;

public abstract class Transport {
    private int id;
    private int yearOfIssue;
    private String color;

    public Transport(int id, int yearOfIssue, String color) {
        this.id = id;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", yearOfIssue=" + yearOfIssue +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void run();

    public abstract void stop();
}
