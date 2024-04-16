class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
}

class Cylinder extends Circle{
    private int hight;
    public Cylinder(int r, int h){
        super(r);
        this.hight=h;
    }
    public double volume(){
        return Math.PI*radius*radius*hight;
    }
}
public class ps_10 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(12, 4);
        System.out.println(obj);
    }
}
