public abstract class Animal {
    int age;
    String breed;

    public Animal(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }
    abstract void sleep();
    abstract void runs();
}
