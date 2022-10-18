public class SsAvrArray19 {
    //Write a Java program to calculate the average value of array elements.

public static void Average(){
   int arr[] = new int[]{10,20,30,40,50};
    int sum = 0;
    for (int i=0; i<arr.length;i++) {
        sum = sum + arr[i];
    }
        System.out.println("Average of string is : "+(sum/arr.length));

}

    public static void main(String[] args) {
Average();
    }

}
