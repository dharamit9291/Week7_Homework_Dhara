import java.util.Scanner;
// Same as above program-8 using switch statement
public class IiSwitchCity9 {

public static void Switch(){
    Scanner scan = new Scanner(System.in);
    String city;
    System.out.println("Enter any alphabet from A to F :");
    city = scan.nextLine();
    scan.close();
    switch (city){
        case "A":
            System.out.println("Ahmedabad");
            break;
        case "B":
            System.out.println("Berlin");
            break;
        case "C":
            System.out.println("Chandigadh");
            break;
        case "D":
            System.out.println("Delhi");
            break;
        case "E":
            System.out.println("Edinburgh");
            break;
        case "F":
            System.out.println("France");
            break;
        default:
            System.out.println("Invalid Entry");
    }

    }

    public static void main(String[] args) {
        Switch();
    }
}

