import java.util.Scanner;
// Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
public class BbLeapYear2 {
    public static void Year(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any year : ");
        int year;
        year = scan.nextInt();
        if (year %4 == 0){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
            scan.close();
        }
    }
    public static void main(String[] args) {
    Year();
    }
}
