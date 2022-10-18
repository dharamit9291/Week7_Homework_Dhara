import java.util.Arrays;

public class QqNumStringArrays17 {
    //Write a Java program to sort a numeric array and a string array.

    public static void Arrays(){
        int[] array1 = { 15,-10,5,0,50,30,3,44,22,13 };
        String [] array2 = { "One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        System.out.println("Original numeric array:\n "+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted array:\n " + Arrays.toString(array1));
        System.out.println("Original string array:\n "+ Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted array:\n " + Arrays.toString(array2));
    }

    public static void main(String[] args) {
        Arrays();
    }
}
