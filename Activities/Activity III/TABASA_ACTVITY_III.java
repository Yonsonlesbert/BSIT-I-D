import java.util.Scanner;
public class TABASA_ACTVITY_III {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        int temp;
          
            System.out.print("Enter the temperature:");
            temp = input.nextInt();
            if(temp >= 105){
                System.out.println("Boiling");
            }
            else {
                System.out.println("Not Boiling");
            }
    
         
    }

    
}
