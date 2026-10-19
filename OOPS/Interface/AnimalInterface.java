import java.util.*;
interface Animal {
    void sound();
}
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks ");
    }
}
class Cat implements Animal {
   public void sound() {
        System.out.println("Cat meows ");
    }
} 
public class AnimalInterface {
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
        System.out.println("Invalid Animal");
    }
    }
}
