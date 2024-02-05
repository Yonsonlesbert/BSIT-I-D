import java.util.Scanner;

public class GUTIB_ACTIVITY_III {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;
        System.out.print("Enter your emperatur: ");
        temp = input.nextInt();
        if (temp >= 105) {
            System.out.println("Boioling");

        } else {
            System.out.println("Not Boiling");

        }

    }

}
