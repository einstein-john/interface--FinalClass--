public class Cat extends Animal implements Mammal,Carnivore{

    public Cat(int a, String b) {
        super(a, b);
    }

    @Override
    void sleep() {
    System.out.println(breed + " sleeps a lot");
    }

    @Override
    void runs() {
        System.out.println(breed + " loves to run");
    }

    @Override
    public void eatMeat() {
        System.out.println(breed + " eats meat");
    }

    @Override
    public boolean isWarmBlooded() {
        return isWarmBlooded;

    }
}
