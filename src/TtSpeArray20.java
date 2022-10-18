public class TtSpeArray20 {
    //Write a Java program to test if an array contains a specific value.

    public static void SpecArray(){
        int arry[] = {50,100,200,-300,-15,20,25,10};
        int input = 50;
        boolean found=false;
        for(int n : arry){
        if (n==input){
            found=true;
            //break;
        }}
        if(found){
            System.out.println(input+ " number is found");}
        else {
            System.out.println(input+ " number is not found");
        }
        }


    public static void main(String[] args) {
        SpecArray();
    }
}
