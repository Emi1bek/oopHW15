package oopObject.thtree;

import java.util.Arrays;

public class Farm {
    private String address;
    private Animal[] cows;
    private Animal[] horses;
    private Animal[] sheep;
    private String  ownerName;

    public Farm(String address, Animal[] cows, Animal[] horses, Animal[] sheep, String ownerName) {
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
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheep=" + Arrays.toString(sheep) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
