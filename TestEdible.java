package chapter13;

public class TestEdible {
    public static void main(String [] args){
        Chicken Tasty = new Chicken();
        System.out.println((Tasty.howToEat()));
        Lion Alex = new Lion();
        System.out.println((Alex.sound()));
    }
}

abstract class Animal{
    /**return animal sound **/
    public abstract String sound();
}

class Chicken extends Animal implements Edible{
    public String sound(){
        return "Chicken: *Cluck*";
    }
    public String howToEat(){
        return "Chicken: Frt ir Sha!";
    }
}
abstract class Fruit implements Edible {

}
//public interface Edible {}

class Lion extends Animal{
    public String sound(){
        return "Lion: *ROAR*";
    }
}
