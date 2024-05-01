import java.util.Scanner;

public class ps14 {
    public static void main(String[] args) {
        // problem 1
        // Syntax Errir - int a =7
        int age =78;
        int year_born =2000-78;

        //problem 2
        try{
            int a=666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch(ArithmeticException e){
            System.out.println("Haha");
        }
        // problem 3
        boolean flag = true;
        int [] marks= new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5) {
            try{
                System.out.println("Enter the value o index");
                index = sc.nextInt();
                System.out.println("the value of marks[index is]" +  marks[index]);
                break;
            }
            catch{
                System.out.println("invalid INdex");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
