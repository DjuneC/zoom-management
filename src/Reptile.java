public class Reptile extends Animal{
    double length;
    Reptile(String name, int age, String species, String location, double length){
        super(name, age, species, location);
        this.length = length;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }
}
