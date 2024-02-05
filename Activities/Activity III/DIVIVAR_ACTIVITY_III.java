import java.util.Scanner;
public class DIVIVAR_ACTIVITY_III {
    public static void main(String[]args){
        int temp;
        
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Temperature (in Celsius)");
            temp = input.nextInt();
            if(temp >= 100){
                    System.out.println("Boiling");
            }else
            System.out.println("Not Boiling");
    }
            
}
