package Section12;

public class Objects {
    public static void main(String[] args) {
        var objectPerson = new Person();
        objectPerson.name = "Jacobo";
        objectPerson.surname = "James";

        objectPerson.showName();

        objectPerson.addName("Michael", "Robinson");

        objectPerson.showName();
    }
}


