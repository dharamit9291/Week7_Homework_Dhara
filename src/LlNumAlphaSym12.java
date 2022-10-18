import java.util.Scanner;
 //Write a program that tells us input value is number or an alphabet or symbol.
public class LlNumAlphaSym12 {

        public static void identifyInput(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any value : ");
        char ch = scan.next().charAt(0);
        scan.close();
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println("is a Alphabet");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println("is a Digit");

        } else {

            System.out.println("is a Special Character");
        }

    }

    public static void main(String[] args) {
        identifyInput();
    }
}

