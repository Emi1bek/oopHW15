package oopObject.four;

public abstract class Person {
    private String name;
    private String driving;
    private int age;
    private int experience;

    public Person(String name, String driving, int age, int experience) {
        this.name = name;
        this.driving = driving;
        this.age = age;
        this.experience = experience;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriving() {
        return driving;
    }

    public void setDriving(String driving) {
        this.driving = driving;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", driving='" + driving + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
