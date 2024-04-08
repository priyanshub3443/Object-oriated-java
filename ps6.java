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
        // float []marks={34.6f, 56.8f, 78.9f, 67.0f, 54.0f};
        // float sum=0;
        // for (float physics : marks) {
        //     sum=sum+physics;
        // }
        // System.out.println("the arverg of all student is " + sum/marks.length);

        // qustion 4
        // a program to add the martris 2 X 3
        // int [][] mat1 = {{1, 2, 3},
        //                  {4, 5, 6}};
        // int [][] mat2 = {{2, 6, 13},
        //                  {3, 7, 1}};
        // int [][] result = {{0, 0, 0},
        //                    {0, 0, 0}};

        // for (int i=0;i<mat1.length;i++){ // row number of times
        //     for (int j=0;j<mat1[i].length;j++) { // column number of time
        //         System.out.format(" Setting value for i=%d and j=%d\n", i, j);
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }
        //     // Printing the elements of a 2-D Array
        // for (int i=0;i<mat1.length;i++){ // row number of times
        //     for (int j=0;j<mat1[i].length;j++) { // column number of time
        //         System.out.print(result[i][j] + " ");
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        //     System.out.println(""); // Prints a new line
        // } 
        
        // qustion 5
        //write a java to rever a array
        // int [] arr = {1, 21, 3, 4, 5, 34, 67};
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;

       
        // for(int i=0; i<n; i++){
        //     // Swap a[i] and a[l-1-i]
        //     // a   b   temp
        //     // |4| |3| ||
        //     temp = arr[i];
        //     arr[i] = arr[l-i-1];
        //     arr[l-i-1] = temp;
        // }

        // for(int element: arr){
        //     System.out.print(element + " ");
        // }
        // qustion 6 
        //write a java program to find tha maximum element of array
      
        // int[] arr = {1, 21, 3, 4, 5, 34, 67};
        // int temp;
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] > arr[i + 1]) {
        //         temp = arr[i];
        //         arr[i] = arr[i + 1];
        //         arr[i + 1] = temp;
        //     }
        // }
        // System.out.println("the max element of the array is " + arr[arr.length - 1]);

        // int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        // int max = Integer.MIN_VALUE;
        // for(int e: arr){
        //     if(e>max){
        //         max = e;
        //     }
        // }
        // System.out.println("the value of the maximum element in this array is: "+ max);

        //question 7
        //write a java program to find tha min element of array
        // int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        // int min=Integer.MAX_VALUE;
        // for (int e : arr) {
        //     if (e<min) {
        //         min=e;                
        //     }
        // }
        // System.out.println("the value of minimum element is the array is "+ min);

        // question 8 
        // find out an  array is sorted or not
                boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }


    }    
}
