class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height){
        this.radius=radius;
        this.height=height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle{
    int length;
    int breadth;
    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public int getBreadth() {
        return breadth;
    }
    
    public int getLength() {
        return length;
    }
    
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    
    public void setLength(int length) {
        this.length = length;
    }

}

public class ps_9 {
    public static void main(String[] args) {
        // Cylinder myCylinder = new Cylinder(9, 12);
        // myCylinder.setHeight(12);
        // System.out.println(myCylinder.getHeight());
        // myCylinder.setRadius(9);
        // System.out.println(myCylinder.getRadius());

        Rectangle r = new Rectangle(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
