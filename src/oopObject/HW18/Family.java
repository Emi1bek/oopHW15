package oopObject.HW18;

public class Family {
    private String name;
    private int how;
    private String citizenship;
    private Flat flat;

    public Family(String name, int how, String citizenship, Flat flat) {
        this.name = name;
        this.how = how;
        this.citizenship = citizenship;
        this.flat = flat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getHow() {
        return how;
    }

    public void getHow(int how) {
        this.how = how;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", How=" + how  +
                ", citizenship='" + citizenship + '\'' +
                ", flat=" + flat.getTip() +
                '}';
    }
}
