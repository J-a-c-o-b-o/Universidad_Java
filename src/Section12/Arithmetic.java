package Section12;

public class Arithmetic {
    int operator1;
    int operator2;

    //constructor overloading
    //Void constructor (by default if isn't declared any constructor)
    public Arithmetic(){}

    //Constructor with values
    public Arithmetic(int oper1, int oper2){
        System.out.println("Executing constructor");
        operator1 = oper1;
        operator2 = oper2;
    }

    void sum (){
        var result = operator1 + operator2;
        System.out.println("result = " + result);
    }
}
