public class Dog extends Pet{
    private String name;

    public Dog(int age, String breed) {
        super(age, breed);
    }

    @Override
    void adoptionCompleted() {

        System.out.println(name + " is adopted by " + getOwnerName());
    }

    @Override
    public void move(String from, String to) {
        System.out.println(name + " runs from " + from + " to the " + to);
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }

    @Override
    public void sleep(int hours) {
        System.out.println(name + " sleeps for " + hours + " hours per day");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
