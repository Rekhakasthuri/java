import java.util.*;

class Animal {
    String name;

    void animal_details() {
        System.out.println("ANIMALS DETAILS USING MULTILEVEL INHERITANCE");
        System.out.println("Species: " + name);
    }
}

class Mammal extends Animal {
    boolean hasFur;

    void mammal_details() {
        System.out.println("Has Fur: " + hasFur);
    }
}

class Dog extends Mammal {
    String breed;

    void Dog_details() {
        System.out.println("Breed: " + breed);
    }
}

public class multilevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the animal name:");
        String name = input.nextLine();

        System.out.println("Does it have fur? (true/false):");
        boolean hasFur = input.nextBoolean();

        input.nextLine();  // Consume newline

        System.out.println("Enter the breed:");
        String breed = input.nextLine();

        Dog dog = new Dog();
        dog.name = name;
        dog.hasFur = hasFur;
        dog.breed = breed;

        dog.animal_details();
        dog.mammal_details();
        dog.Dog_details();
    }
}