public class Bird extends Animal{
    int wingspan;
    Bird(String name, int age, String species, String location, int wingspan){
        super(name, age, species, location);
        this.wingspan = wingspan;
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
