package HWClass25;

import java.util.ArrayList;

public class IsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Car Insurance", "G-Wagon"));
        insurances.add(new Pet("Pet Insurance", "Dog"));
        insurances.add(new Health("Health Insurance"));

        for (Insurance insurance : insurances) {
            System.out.println(insurance.getQuote());
            insurance.cancelInsurance();
        }
    }
}
