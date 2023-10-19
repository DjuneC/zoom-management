public class Mamal extends Animal{
    int numberOfLegs;
    Mamal(String name, int age, String species, String location, int numberOfLegs){
        super(name, age, species, location);
        this.numberOfLegs = numberOfLegs;
    }
    @Override
    public void makeSound(){}
    @Override
    public void move(){}
    @Override
    public void eat(){}
}
