package Section12;

class Dog extends Animal {
    public void makeSound(){
        System.out.println("I can bark");
    }

    //Overwritting method
    protected void sleep(){
        System.out.println("I sleep 15 hours per day");
        System.out.println("Method from father class:");
        super.sleep();
    }
}
