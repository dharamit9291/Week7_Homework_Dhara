import java.util.Scanner;
// Write a java program that tells us that Input number is odd or even?
public class AaOddEven1 {
    public static void OddEven() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num;
        num = scan.nextInt();
        String eveOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + eveOdd);
        scan.close();
    }

    public static void main(String[] args) {
        OddEven();
    }
}
