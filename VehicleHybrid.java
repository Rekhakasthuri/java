import java.util Scanner;
abstract class Vehicles {
    private String make;
    private String model;

    public Vehicles(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

}
abstract class FourWheeler extends Vehicles {
    private int NoOFDoor;

    public FourWheeler(String make, String model, int NoOFDoor){
        super(make,model);
        this.NoOFDoor = NoOFDoor;
    }

    public int getNoOFDoor(){
        return NoOFDoor;
    }
}

abstract class TwoWheeler extends Vehicles {
    private Boolean hasCarrier;

    public TwoWheeler(String make, String model, Boolean hasCarrier){
        super(make,model);
        this.hasCarrier = hasCarrier;
    }

    public  Boolean getHasCarrier(){
        return hasCarrier;
    }
}
class Carss extends FourWheeler{
    public Carss(String make, String model, int NoOFDoor){
        super(make,model,NoOFDoor);
    }

    public void display(){
        System.out.println("Make:" + getMake());
        System.out.println("Model:" + getModel());
        System.out.println("Number OF Doors" + getNoOFDoor());
    }
}

class Bikes extends TwoWheeler{
    public Bikes(String make, String model, Boolean hasCarrier){
        super(make, model, hasCarrier);
    }

    public void display(){
        System.out.println();
        System.out.println("Make:" + getMake());
        System.out.println("Model:" + getModel());
        System.out.println("Has Carrier:" + getHasCarrier());
    }
}
public class VehicleHybrid {
    public static void main(String[] args) {
        Carss car = new Carss("Toyota", "Ford", 5);
        Bikes bike = new Bikes("honda", "Z900", false);

        car.display();
        bike.display();
    }
}