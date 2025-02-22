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

        //Instance of Arithmetic class (with values for the object)
        var arithmetic1 = new Arithmetic(2, 3);
        System.out.println("Attribute 1: " + arithmetic1.getOperator1());
        System.out.println("Attribute 2: " + arithmetic1.getOperator2());
        arithmetic1.setOperator1(10);
        arithmetic1.setOperator2(15);
        System.out.println("Attribute 1: " + arithmetic1.getOperator1());
        System.out.println("Attribute 2: " + arithmetic1.getOperator2());

        //Method of class Arithmetic
        arithmetic1.sum();

        //Giving other values through variables of class
        arithmetic1.operator1 = 4;
        arithmetic1.operator2 = 6;

        //Method of class Arithmetic
        arithmetic1.sum();
        System.out.println("Memory adress of object 'arithmetic1' = " + arithmetic1);
    }
}


