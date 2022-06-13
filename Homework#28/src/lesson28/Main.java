package lesson28;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean checkCar() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("ferrari");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Volvo");


        boolean containsCar = cars.contains("BMW");

        if (containsCar == true){
            return true;
        }else {
            return false;
        }
   }


    public static void main(String[] args) {

        System.out.println(checkCar());
    }
}
