package Section12;

public class Arithmetic {
    int operator1;
    int operator2;

    //constructor overloading
    //Void constructor (by default if isn't declared any constructor)
    public Arithmetic(){}

    //Constructor with values
    public Arithmetic(int operator1, int operator2){
        System.out.println("Executing constructor");
        //operator1 = operator1;
        //operator2 = operator2;
        /*For not to have to do the above with the names of parameters, we can use 'this' like this way:*/
        this.operator1 = operator1;
        this.operator2 = operator2;
        //In this way we're indicating that the variable of the left is the variable of the class
        System.out.println("this = " + this);
    }
    void sum (){
        var result = this.operator1 + this.operator2;
        System.out.println("result = " + result);
    }

    public int getOperator1(){
        return this.operator1;
    }

    public int getOperator2(){
        return this.operator2;
    }

    public void setOperator1(int operator1){
        this.operator1 = operator1;
    }

    public void setOperator2(int operator2){
        this.operator2 = operator2;
    }

    public static void main(String[] args) {
        var arithmetic0 = new Arithmetic(1, 2);
        System.out.println("Memory adress of object arithmetic0 = " + arithmetic0);
    }
}
