public abstract class Animal {
    String name;
    int age;
    String species;
    String location;

    Animal(String name, int age, String species, String location) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void makeSound();
    public abstract void move();
    public abstract void eat();
}
