import java.util.Scanner;

public class CLIMACO_ACTIVITY_III {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Celsius: ");
        int temp = sc.nextInt();

        if (temp>=180){
            System.out.println("Boiling");
        } else {
            System.out.println("Not Boiling");
        }
    }
}