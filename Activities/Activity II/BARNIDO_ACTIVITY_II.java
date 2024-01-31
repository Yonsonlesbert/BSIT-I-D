import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class BARNIDO_ACTIVITY_II {
    public static void main(String[] args){
        int num1, num2, sum, diff, prod;

        Scanner numbers= new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1=numbers.nextInt();

        System.out.println("Enter the second number: ");
        num2=numbers.nextInt();

        sum=num1+num2;
        diff=num1-num2;
        prod=num1*num2;

        System.out.println("Sum: " +sum);
        System.out.println("Difference: " +diff);
        System.out.println("Product: " +prod);
    }
}