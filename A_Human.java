package oop_Inheritance.d.multiple_inheritance;

public interface A_Human {

    public void religion();
    public void shape();
    public void walk();
    public void run();

    default void eat(){
        System.out.println("I can eat");
    }


}