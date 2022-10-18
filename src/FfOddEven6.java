import java.util.Scanner;
// Write a java program to input any number and find out if it’s odd or even
public class FfOddEven6 {

    public static void OddEven6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num;
        num = scan.nextInt();
        scan.close();
        if (num % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        OddEven6();
    }
}


