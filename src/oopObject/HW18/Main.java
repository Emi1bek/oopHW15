package oopObject.HW18;

import oopObject.thtree.Cow;
import oopObject.thtree.Horse;
import oopObject.thtree.Sheep;

public class Main {

    public static <familys, apartment> void main(String[] args) {
        Apartment apartment = new Apartment("apartment", 4,54.5,"Ул.Где то, дом 5");
        Hostel hostel = new Hostel("hostel", 2,43.4,"Ул.Где то, дом 5");
        Hotel hotel = new Hotel("hotel",2,33.2,"bhjjhsdfhgjhjh sdhfj");
        apartment.method();
        hostel.method();
        hotel.method();
        Family[] familys = {
                new Family("asd", 3, "asd", apartment),
                new Family("asd", 3, "asd", apartment),
                new Family("asd", 3, "asd", hotel),
                new Family("asd", 3, "asd", hostel),
                new Family("asd", 3, "asd", hostel),
        };
        int sum1 = 0;

        int sum2 = 0;

        int sum3 = 0;
        for (Family fam: familys) {
            if (fam.getFlat().getTip().equals("apartment")){
                System.out.println(fam);
                sum1+=fam.getHow();
            } else if (fam.getFlat().getTip().equals("hostel")) {
                System.out.println(fam);
                sum2+=fam.getHow();
            } else {
                System.out.println(fam);
                sum3+=fam.getHow();
            }

        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        Family familyAndrey = new Family("Шерматов", 4,"Русский" , apartment);
        Family familyRoman = new Family("Серега", 3,"Германия" , hotel);
        Family familyAsan = new Family("Усонов", 5,"Кыргызстан" , hostel);
        System.out.println(familyAndrey);
        System.out.println(familyRoman);
        System.out.println(familyAsan);


    }
}
