import java.util.Scanner;
// Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
public class GgSalesCommision7 {

    public static void sales() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sales ID :");
        String salesid = scan.nextLine();
        System.out.println("Enter Seller's Name :");
        String name = scan.nextLine();
        System.out.println("Enter Sales Amount :");
        int amount = scan.nextInt();
        System.out.println("Enter Basic Salary :");
        int Basicsalary = scan.nextInt();
        scan.close();
        if (amount >= 50000) {
            System.out.println("Commission 35% :" + (amount * 35) / 100);
        }
        if (amount >= 30000 && amount < 50000) {
            System.out.println("Commission 20% :" + (amount * 20) / 100);
        }
        if (amount >= 20000 && amount < 30000) {
            System.out.println("Commission 10%:" + (amount * 10) / 100);
        }
        if (amount >= 10000 && amount < 20000) {
            System.out.println("Commission 5% :" + (amount * 5) / 100);
        }
        if (amount < 10000) {
            System.out.println("Commission :" + (amount * 2) / 100);
        }
    }

    public static void main(String[] args) {
sales();
    }
}
