class practice1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Good Moring!");
        }
    }
}

class practice2 extends Thread{
    public void run(){
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class ps_13 {
    
}
