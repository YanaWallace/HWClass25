package HWClass25;

import java.util.ArrayList;

abstract class Insurance {
    protected String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract String getQuote();

    public abstract void cancelInsurance();
}
class Car extends Insurance {
    private String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    public String getQuote() {
        return "Car Insurance Quote";
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Canceling Car Insurance");
    }
}

class Pet extends Insurance {
    private String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }
    @Override
    public String getQuote() {
        return "Pet Insurance Quote";
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Canceling Pet Insurance");
    }
}

class Health extends Insurance {

    public Health(String insuranceName) {
        super(insuranceName);
    }
    @Override
    public String getQuote() {
        return "Health Insurance Quote";
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Canceling Health Insurance");
    }
}

