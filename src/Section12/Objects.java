package Section12;

public class Objects {
    public static void main(String[] args) {
        //Instance of class Person
        var objectPerson = new Person();
        //Attributes of the object of class Person
        objectPerson.name = "Jacobo";
        objectPerson.surname = "James";
        //Method of the class Person through object
        objectPerson.showName();
        //Method of the class Person through object (changing the attributes).
        objectPerson.addName("Michael", "Robinson");
        //Method of the class Person through object
        objectPerson.showName();
    }
}


