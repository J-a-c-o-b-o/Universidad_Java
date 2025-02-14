package Section12;

public class Person {
    //Atributes
    String name;
    String surname;
    String email;
    String smartphone;

    //Constructor (It doesn't have type: String, int or void, E.g.) (If I don't put a constructor, Java will create a default one)
    public Person(){
    }

    //Methods
    public void showName(){
        System.out.println("The name is " + name + " and the surnane is " + surname);
    }

    public void addName(String nameAsParameter, String surnameAsParameter){
        name = nameAsParameter;
        surname = surnameAsParameter;
    }

}
