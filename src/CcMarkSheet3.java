import java.text.DecimalFormat;
import java.util.Scanner;
/* Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result*/
public class CcMarkSheet3 {
    public static void studentdetails() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String Name = scan.next();
        System.out.println("Enter Your Roll No :");
        int Rollno = scan.nextInt();
        System.out.println("Enter Your Math's marks :");
        int Maths = scan.nextInt();
        if (Maths < 0 || Maths > 100) {
            System.out.println("Invalid Maths marks ");
        }
        System.out.println("Enter Your Science's marks :");
        int Science = scan.nextInt();
        if (Science < 0 || Science > 100) {
            System.out.println("Invalid Science Marks");
        }
        System.out.println("Enter Your English's marks :");
        int English = scan.nextInt();
        if (English < 0 || English > 100) {
            System.out.println("Invalid English Marks");
        }
        System.out.println("---------------------------");
        System.out.println("|        Mark Sheet       |");
        System.out.println("|                         |");
        System.out.println("|-------------------------|");
        System.out.println("|      Name : " + Name + "        |");
        System.out.println("|    Roll No:  " + Rollno + "         |");
        System.out.println("|-------------------------|");
        System.out.println("|    Subject :   Marks    |");
        System.out.println("|-------------------------|");
        System.out.println("|  Math :   " + new DecimalFormat("000").format(Maths) + "           |");
        System.out.println("| Science : " + new DecimalFormat("000").format(Science) + "           |");
        System.out.println("| English : " + new DecimalFormat("000").format(English) + "           |");
        System.out.println("|                         |");
        System.out.println("|-------------------------|");


        int Total = Maths + Science + English;
        System.out.println("| Total :  " +new DecimalFormat("000").format(Total) + "            |");
        System.out.println("|-------------------------|");
        double percentage = ((Total * 100) / 300);
        System.out.println("|Percentage:  " + percentage + "        |");
        if (Maths <= 34 || English <= 34 || Science <= 34) {
            System.out.println("|Result:  " + "Fail" + "            |");
        } else
            System.out.println("|Result:  " + "Pass" + "            |");

        if (percentage >= 80.0) {
            System.out.println("|Grade:  " + "A+" + "               |");
            System.out.println("|-------------------------|");
        }
        if (percentage >= 60.0 && percentage < 80.0) {
            System.out.println("|Grade:  " + "A" + "                |");
            System.out.println("|-------------------------|");
        }
        if (percentage >= 50.0 && percentage < 60.0) {
            System.out.println("|Grade:  " + "B" + "                |");
            System.out.println("|-------------------------|");
        }
        if (percentage >= 35.0 && percentage < 50.0) {
            System.out.println("|Grade:  " + "C" + "                |");
            System.out.println("|-------------------------|");
        }
        if (percentage < 35) {
            System.out.println("|No Grade:                          |");
            System.out.println("|-------------------------|");
        }
    }
    public static void main(String[] args) {
        studentdetails();
    }
}


