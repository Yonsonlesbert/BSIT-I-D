import java.util.Scanner;
public class PIEDAD_ACTIVITY_III{
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		int temperature;
		System.out.print("Enter your Temperature: ");
		int tem = input.nextInt();
		if (tem<=105){
			System.out.println("Boiling ");
		}
		else{
		System.out.println("Not Boiling");
		}
	  }
	}
