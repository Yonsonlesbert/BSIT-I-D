import java.util.Scanner;
public class JIMENEZ_ACTIVITY_II{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int num1;
       int num2;
       System.out.print("Enter a value: ");
        num1 =sc.nextInt();
       
        System.out.print("Enter a value: ");
     num2 =sc.nextInt();
       

        int sum = num1+num2;
        int diff = num1-num2;
        int product = num1*num2;

        System.out.println("The sum is: "+sum);
        System.out.println("the diff is : "+diff);
        System.out.println("the product is :"+product);

      
    }
}