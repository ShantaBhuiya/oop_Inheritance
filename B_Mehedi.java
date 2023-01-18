package oop_Inheritance.e.hybrid_inheritance;

public interface B_Mehedi {


    public void walk();
    public void run();

    default void eat(){
        System.out.println("I can eat");
    }


}