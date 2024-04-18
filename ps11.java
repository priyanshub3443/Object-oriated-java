abstract class pen{
   abstract void write();
   abstract void refill();
}

class FountainPen extends pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("money is bite");
    }
}

class Human extends Monkey{
    void eat(){
        System.out.println("Eating the food");
    }
    void sleep(){
        System.out.println("human the sleeping");
    }
}

abstract class Telephone {
abstract void ring();
abstract void lift();
 void disconnect(){
    System.out.println("disconnect.....");
}
    
}
class SmartTelephone extends Telephone{
    @Override
    void ring() {
        System.out.println("tellephone are ringing");
        
    }
    @Override
    void lift() {
        System.out.println("lift....");
    }
}
public class ps11 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Q3
        Human harry = new Human();
        harry.sleep();

        // Q5
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

    //     BasicAnimal lovish = new Human();
    //     // lovish.speak(); --> error
    //     lovish.eat();
    //     lovish.sleep();
    // }
}
