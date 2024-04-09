public class ps_methord {
    static void mathmatic(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n", n, i, n*i);
        }
    }

    static void patten(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        }
    static int sumRe(int n){
        if (n==1) {
            return 1;
        }
            return n + sumRe(n-1);
    }
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n){
        if (n==1||n==2) {
            return n-1;
        }
        else{
            return fib(n-2) + fib(n-1);
        }
    }

    static int avrage(int n1, int n2, int n3){
        int avg= (n1+n2+n3)/3;
        return avg;
    }
    static float celciasTOferanite(float C){
            // F = C * (9/5) + 32
            float F;
            F=(C*(9/5F)+32);
            return F;
    }
    public static void main(String[] args) {
        // mathmatic(5);
        // patten(5);
    //   int c =  fib(4);
    //   System.out.println(c);
      float c =  celciasTOferanite(67.0f);
      System.out.println(c);
    //   int c =  avrage(56, 87, 90);
    //   System.out.println(c);


    }
    //   int c =  sumRe(4);
    //   System.out.println(c);
    // }

}
