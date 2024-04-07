public class ps6 {
    public static void main(String[] args) {
        //qustion 1
        // WRP for 5 float and calculate sum
        // float []marks={34.6f, 56.8f, 78.9f, 67.0f, 54.0f};
        // float sum=0;
        // for (float f : marks) {
        //     sum+=f;
        
        // }
        // System.out.println("the sum of the float int " + sum);

        //qustion 2
        // write a progam who identy the array wheter to given intizer is presnt in or not
        // float []marks={34.6f, 56.8f, 78.9f, 67.0f, 54.0f};
        // float num=34.6f;
        // boolean isArray=false;
        // for (float element : marks) {
        //     if (num==element) {
        //         isArray=true;
        //         break;
        //     }
        // }
        // if (isArray) {
        //     System.out.println("The array are prent in the Array");
        // }
        // else{
        //     System.out.println("the array are not prent");
        // }

        // qustion 3
        //calculate avagre marks in array of physics student
        float []marks={34.6f, 56.8f, 78.9f, 67.0f, 54.0f};
        float sum=0;
        for (float physics : marks) {
            sum=sum+physics;
        }
        System.out.println("the arverg of all student is " + sum/marks.length);
    }    
}
