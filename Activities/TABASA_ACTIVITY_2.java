import java.util.Scanner;

class TABASA_ACTIVITY_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstnum = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondnum = input.nextInt();

        int a = firstnum + secondnum;
        int b = firstnum - secondnum;
        int c = firstnum * secondnum;
        int d = firstnum / secondnum;

        System.out.println("SUM is: " + a);
        System.out.println("DIFFERENCE is: " + b);
        System.out.println("PRODUCT is " + c);
        System.out.println("QUOTIENT is " + d);
    }
}
