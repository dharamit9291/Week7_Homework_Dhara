public class KkDivide11 {
  //  Write a java program to print the numbers between 1 to 100 which can be divided by 3
   //and 5 separately.
    public static void divide(){
        int i=100;
        System.out.print("Numbers divisible by 3 are : ");
        for(i=1;i<=100;i++){
            if(i%3==0)
            System.out.print(i+",");
        }
        //System.out.println();
        System.out.print("\nNumbers divisible by 5 are :");
        for(i=1;i<=100;i++){
            if(i%5==0)
                System.out.print(i+",");
        }
        //System.out.println();
        System.out.print("\nNumbers divisible by 3 and 5 are :");
        for(i=1;i<=100;i++){
            if(i%3==0 && i%5==0)
                System.out.print(i+",");
        }
    }
    public static void main(String[] args) {
divide();
    }
}
