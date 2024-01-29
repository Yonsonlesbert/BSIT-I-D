import java.util.Scanner;
public class MAURIN_ACTIVITY_II {
    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);

        int num1;
        int num2;
        
        System.out.print( " Enter value ");
        num1 = sc.nextInt();

        System.out.print( " Enter value ");
        num2 = sc.nextInt();

        int sum = num1 + num2;
        int difference = num2 - num1;
        int product = num1*num2;
        
        System.out.println( "Sum is " +sum);
        System.out.println( "Difference is " +difference);
        System.out.println( "Product is " +product);
}
    
}
