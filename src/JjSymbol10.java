import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
/*Write a java program to input any two number and ask user to enter their symbol (+, -,
        /, *) find addition, Subtraction, multiplication and division according to their symbol*/
import java.util.Scanner;

public class JjSymbol10 {
    public static void Calc () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number : ");
        int f1 = scan.nextInt();
        System.out.println("Input second number : ");
        int f2 = scan.nextInt();
        System.out.println("Enter symbol : ");
        char sym = scan.next().charAt(0);
        scan.close();
        if (sym =='+') {
            System.out.println(f1 + "+" + f2 + "=" + (f1 + f2));
        } else if(sym == '-') {
            System.out.println(f1 + "-" + f2 + "-" + (f1 - f2));}
        else if (sym == '*') {
            System.out.println(f1 + "x" + f2 + "=" + (f1 * f2));
        } else if (sym == '/') {
            System.out.println(f1 + "/" + f2 + "=" + (f1 / f2));
        }
    }
        public static void main (String[]args){
            Calc();
        }
    }
