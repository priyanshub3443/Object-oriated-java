public class ps5{
    public static void main(String[] args) {
    // qustion 1 pattenn
        //     int n=4;
    //     for(int i=n; i>0;i--) {
    //         for(int j=0; j<i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.print("\n");
    //     }
     // qustion 2 
     //write a progaram sum the n even number
    //  int sum=0;
    //  int n=4;
    //  int i=0;
    //  while (i<n) {
    //     sum= sum+ (2*i);
    //     i++;
        
    //  }
    //   System.out.print("Sum of even numbers is: ");
    //  System.out.println(sum);

    //qustion 3 
    //write a progaram to prinit a multiple table number of n
    // int n=5;
    // for(int i=1;i<=10;i++){
    //     System.out.printf(" %d * %d = %d\n", n, i, n*i);
    // }

    //qustion 4
    //write a program revere oder table
    // int n=5;
    // for(int i=10;i>=0;i--){
    //     System.out.printf(" %d * %d = %d\n", n, i, n*i);
    // }
    //qustion 5
    //write a progarm find factorial using n number
    // int factorial=1;
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     factorial=factorial*i;
    // }
    // System.out.println("the faction of " + n +"==" + factorial );
     int factorial=1;
    int n=5;
    int i=1;
    while (i<=n) {
        factorial=factorial*i;
        i++;
    }
    System.out.println("the faction of " + n +"==" + factorial );
     
    }
}