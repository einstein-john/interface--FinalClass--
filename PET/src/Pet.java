public abstract class Pet implements DomesticAnimal{
    protected int age;
    protected String breed;
    protected Owner owner;

    public Pet(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setOwner(Owner o) {
        this.owner = o;
    }
    public String getOwnerName(){
        return this.owner.getName();
    }
    public void birthday(){
        age +=1;
    }

    abstract void adoptionCompleted();




}
