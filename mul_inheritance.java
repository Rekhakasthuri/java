class Animal
{
    private String speciesName;

    public void setSpeciesName(String speciesName)
    {
        this.speciesName = speciesName;
    }

    public String getSpeciesName()
    {
        return speciesName;
    }
}

class Mammal extends Animal
{
    private boolean hasFur;

    public void setHasFur(boolean hasFur)
    {
        this.hasFur = hasFur;
    }

    public boolean getHasFur()
    {
        return hasFur;
    }
}

class Dog extends Mammal
{
    private String breed;

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public String getBreed()
    {
        return breed;
    }
}

public class mul_inheritance
{
    public static void main(String[] args)
    {
        Dog tommy = new Dog();

        tommy.setSpeciesName("Canine");
        tommy.setHasFur(true);
        tommy.setBreed("Golden Retriever");

        System.out.println("Species: " + tommy.getSpeciesName());
        System.out.println("Has Fur: " + tommy.getHasFur());
        System.out.println("Breed: " + tommy.getBreed());
    }
    
}