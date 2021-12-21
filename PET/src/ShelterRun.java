import javax.swing.*;

public class ShelterRun {
    public static void main(String[] args) {
        String output = "";
        Owner jack = new Owner("Jack Black");
        Dog max = new Dog(5,"Golden Retriever");
        max.setOwner(jack);
        max.setName("Max");
        max.adoptionCompleted();

        max.eat("Dog biscuits");
        max.sleep(7);
        max.birthday();
        max.move("Home","park");

        output += "\n Dog name: " + max.getName();
        output += "\n Dog breed: " + max.getBreed();
        output += "\n Dog age: " + max.getAge();
        output += "\n Owner: " + max.getOwnerName();

        JOptionPane.showMessageDialog(null,output);
    }
}
