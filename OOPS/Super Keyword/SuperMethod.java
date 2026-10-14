class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }

    void displaySounds(){
        super.sound();
        sound();
    }
}

public class SuperMethod {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.displaySounds();
    }
}