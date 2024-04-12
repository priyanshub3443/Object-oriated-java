/**
 * Employee
 */
class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        this.name = n;
    }
}
/**
 * CellPhone
 */
class CellPhone {
   public void ring(){
        System.out.println("Ringing...");
    }
   public void vibrate(){
        System.out.println("Vibrating...");
    }
   public void callFriend(){
        System.out.println("Calling MUkul...");
   }
}
/**
 * Square   
 */
 class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
/**
 * Rectangular
 */
 class Rectangular {
    int hight, lenth;
    public int area(){
        return hight*lenth;
    }
    public int perimeter(){
        return 2*(lenth+hight);
    }
    
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}


public class ps_oops {

    public static void main(String[] args) {
        // // Problem 1
        // Employee harry = new Employee();
        // harry.setName("CodeWithHarry");
        // harry.salary = 233;
        // System.out.println(harry.getSalary());
        // System.out.println(harry.getName());
        
        // Problem 2
        // CellPhone asus = new CellPhone();
        // asus.callFriend();
        // asus.vibrate();
        //problem 3
        // Square sq= new Square();
        // sq.side=3;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());
        //problem 4
        // Rectangular r= new Rectangular();
        // r.hight=5;
        // r.lenth=6;
        // System.out.println(r.area());
        // System.out.println(r.perimeter());
        // problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

    }
}
