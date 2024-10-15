import java.util.Scanner;
class Parent{
    String name;

    public Parent(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
abstract class AbstractClass extends Parent{

    public AbstractClass(String name){
        super(name);
    }
    public void Display(){
        System.out.println("Name:" + getName());
    }
}

class Child extends Parent{

    public Child(String name){
        super(name);
    }

    public void Display(){
        System.out.println("Name:" + getName());
    }
}

public class keywords {
    public static void main(String[] args) {
        Child obj = new Child("rekha");

        obj.Display();
    }
}