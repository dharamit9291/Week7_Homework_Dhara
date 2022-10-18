import java.util.Arrays;

public class RrSumArray18 {
    //Write a Java program to sum values of an array.

public void Sum(){
    double arr[] = {12,5,0,-14,55,80,90 };
    double sum = Arrays.stream(arr).sum();
    System.out.println("sum of array is :" + sum);

}

    public static void main(String[] args) {
        RrSumArray18 obj = new RrSumArray18();
        obj.Sum();
    }

}
