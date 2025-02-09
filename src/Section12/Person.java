package Section12;

public class Person {
    //Atributes
    String name;
    String surname;
    String email;
    String smartphone;

    //Methods
    public void showName(){
        System.out.println("The name is " + name + " and the surnane is " + surname);
    }

    public void addName(String nameAsParameter, String surnameAsParameter){
        name = nameAsParameter;
        surname = surnameAsParameter;
    }

}
