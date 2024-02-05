import java.util.Scanner;
public class DIVIVAR_ACTIVITY2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int fnum = sc.nextInt();
        System.out.print("Second number: ");
        int snum = sc.nextInt();
        
        int sum = fnum+snum;
        int product = fnum * snum;
        int diff = fnum- snum;
        int quotient = fnum/snum;

        System.out.println("Sum = "+sum);
        System.out.println("Product =" +product);
        System.out.println("Diff = "+diff);
        System.out.println("Quotient =" +quotient);
    }
}
