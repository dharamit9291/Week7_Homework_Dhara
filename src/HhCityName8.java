import java.util.Scanner;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
public class HhCityName8 {
    public static void city(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any alphabet :");
        char alphabet=scan.next().charAt(0);
        if(alphabet == 'A'){
            System.out.println("Ahmedabad");
        }   else if(alphabet == 'B'){
            System.out.println("Berlin");
        }   else if(alphabet == 'C'){
            System.out.println("Chandigadh");
        }   else if(alphabet == 'D'){
            System.out.println("Delhi");
        }   else if(alphabet == 'E'){
            System.out.println("Edinburgh");
        }   else if(alphabet == 'F'){
            System.out.println("France");
        } else {
            System.out.println("Invalid Entry");
            scan.close();
        }
    }

    public static void main(String[] args) {
city();
    }
}
