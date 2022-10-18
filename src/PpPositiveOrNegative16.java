import java.util.Scanner;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
public class PpPositiveOrNegative16 {
    public static void main(String[] args) {
        findposorneg();
    }
    public static void findposorneg() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Number :");
        double x = scan.nextDouble();
        scan.close();
        if (x < 0){
            System.out.println("Number is Negative");}
        else if (x > 0){
            System.out.println("Number is Positive");}
        else {
            System.out.println("Number is Zero");
        }

    }}
