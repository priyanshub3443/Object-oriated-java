// package folder.folder.folder;


import java.lang.Math;

class Calculator {
    int a;
    int b;
    
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void sum() {
        System.out.println("the sum is " + (a + b));
    }
}

class ScCalculator {
    int a;
    int b;
    
    public ScCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void sinSum() {
        double result = Math.sin(a + b);
        System.out.println("the sine of the sum is " + result);
    }
}

class HyCalculator {
    int a;
    int b;
    
    public HyCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void sum() {
        System.out.println("the sum is " + (a + b));
    }
}


public class problem2 {
    public static void main(String[] args) {
        System.out.println("the calculater is ");
    }
}
