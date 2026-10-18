import java.util.*;
class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
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
public class AnimalOverriding{
    public static void main(String[] args){
      Animal a1 = new Animal();
      Dog d1 = new Dog();
      Cat c1 = new Cat();
      a1.sound();
      d1.sound();
      c1.sound();
    }
}