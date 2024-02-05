import java.util.Scanner;
public class ACTIVITY_PIEDAD_II{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter first number: ");
    int fnum= input.nextInt();
    System.out.print("Enter secont number: ");
    int snum= input.nextInt();
    System.out.print("Enter third number: ");
    int tnum= input.nextInt();
    int sum = fnum + snum + tnum;
    int difference = fnum - sum - tnum;
    int product = fnum * snum * tnum;
    int quotient = fnum / snum / tnum;
    System.out.println("The sum is "+sum);
    System.out.println("The difference is "+difference);
    System.out.println("The product is "+product);
    System.out.println("The quotient is "+quotient);
    }
  }

