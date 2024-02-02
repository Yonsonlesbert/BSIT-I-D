import java.util.Scanner;

public class OBINQUE_ACTIVITY_II{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter Values:");
        num1 = sc.nextInt();

        System.out.print("Enter Values:");
        num2 = sc.nextInt();

        int sum = num1 + num2;
        int Prod = num1 * num2;
        int Qou = num1 - num2;
        int Diff = num1 / num2;

        System.out.println("Sum: "+ sum);
        System.out.println("Product: "+ Prod);
        System.out.println("Qoutient: "+ Qou);
        System.out.println("Different: "+ Diff);


    }

}