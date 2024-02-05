import java.util.Scanner;
public class SERMON_ACTIVITY_III {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input the temperature in Celsius: ");
        int temp =  sc.nextInt(); 

        if(temp >= 100){
            System.out.println("Boiling");
        }else{
            System.out.print("Not Boiling");
    
        }
    }
}
