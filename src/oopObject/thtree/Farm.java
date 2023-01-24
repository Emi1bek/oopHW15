package oopObject.thtree;

import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;
    private String  ownerName;

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }

    public Farm() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +"\n"+
                ", cows=" + Arrays.toString(cows) +"\n"+
                ", horses=" + Arrays.toString(horses) + "\n"+
                ", sheep=" + Arrays.toString(sheep) +"\n"+
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
