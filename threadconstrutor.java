class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        // int i=34;
        System.out.println("thank you");
    }
}
public class threadconstrutor {
    public static void main(String[] args) {
        Mythr t1=new Mythr("Harry");
        Mythr t2=new Mythr("PRIYANSHU");
        t1.start();
        t2.start();
        System.out.println("the id of the thread t is " + t1.getId());
        System.out.println("the name of the thread t is " + t1.getName());
        System.out.println("the id of the thread t is " + t2.getId());
        System.out.println("the name of the thread t is " + t2.getName());
    }
}
