import java.util.Scanner;
public class BALONGCAS_ACTIVITY_III{
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("Temperature: ");
        int temps = temp.nextInt();
        if(temps>=100){
            System.out.print("Boiling");
        } else
        System.out.print("Not boiling");

    }
}