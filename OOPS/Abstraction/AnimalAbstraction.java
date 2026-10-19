import java.util.*;
abstract class Animal {
    abstract void sound();
}
class Dog extends Animal {
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal {
    void sound(){
        System.out.println("Cat Meows");
    }
}
public class AnimalAbstraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name.equalsIgnoreCase("dog")){
            Dog d1 = new Dog();
            d1.sound();
        }
        else if(name.equalsIgnoreCase("cat")){
            Cat c1 = new Cat();
            c1.sound();
        }
        else{
            System.out.println("No valid name");
        }
    }
}