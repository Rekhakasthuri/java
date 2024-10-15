import java.util.Scanner;
class Vehicle {
    String make;
    String model;

    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void printVehicleInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}
class Car extends Vehicle {
    int numberOfDoors;

    Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    void printCarInfo() {
        System.out.println("Car Info:");
        printVehicleInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
class Bike extends Vehicle {
    String type;

    Bike(String make, String model, String type) {
        super(make, model);
        this.type = type;
    }

    void printBikeInfo() {
        System.out.println("Bike Info:");
        printVehicleInfo();
        System.out.println("Type: " + type);
    }
}
public class hierarchical{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car details:");
        System.out.print("Make: ");
        String carMake = scanner.nextLine();
        System.out.print("Model: ");
        String carModel = scanner.nextLine();
        System.out.print("Number of Doors: ");
        int carNumberOfDoors = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        Car car = new Car(carMake, carModel, carNumberOfDoors);
        car.printCarInfo();

        System.out.println();

        System.out.println("Enter bike details:");
        System.out.print("Make: ");
        String bikeMake = scanner.nextLine();
        System.out.print("Model: ");
        String bikeModel = scanner.nextLine();
        System.out.print("Type: ");
        String bikeType = scanner.nextLine();

        Bike bike = new Bike(bikeMake, bikeModel, bikeType);
        bike.printBikeInfo();

        scanner.close();
    }
}

