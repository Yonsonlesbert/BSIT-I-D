import java.util.Scanner;
public class PINILI_ACTIVITY_III{
	public static void main(String []args){
		int temp;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature (in Celsius)");
		temp = input.nextInt();
			if(temp >= 100){
				System.out.println("boiling");
			}else
				System.out.println("Not boiling");

		}
	}