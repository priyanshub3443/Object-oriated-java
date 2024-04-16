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
class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

// Cuboid class
class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return area() * height;
    }
}
public class ps_10 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(12, 4);
        System.out.println(obj);
    }
}
