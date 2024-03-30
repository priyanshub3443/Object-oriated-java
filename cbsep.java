import java.util.Scanner;

public class cbsep{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter obetin all marks in 5 subjects");
        double totalMarks=0;
        for(int i=1;i<=5;i++){
            System.out.println("subject " + i + "marks: ");
            double marks=scanner.nextDouble();
            totalMarks += marks;

        }
        double percentage =(totalMarks/500)*100;
        System.out.println("total marks obtained:" + totalMarks);
        System.out.println("percentage: " +percentage + "%");

    }
}