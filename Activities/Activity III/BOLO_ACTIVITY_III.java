import java.util.Scanner;
public class BOLO_ACTIVITY_III{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int temp;

        System.out.print("Enter a temperature celcius: 20");
        temp = sc.nextInt();

        if(temp>=100){
        System.out.println("Boiling");
    } else {
       System.out.println("Not Boiling");

       }

   
    } 

}