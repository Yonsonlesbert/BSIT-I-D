import java.util.Scanner;
public class CLIMACO_ACTIVITY_V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
       
        System.out.print("Enter age: ");
        age = sc.nextInt();
        if (age >= 15 && age <= 16 ){
            System.out.println("Teen");
        }else if (age >= 2 && age <= 10) {
                System.out.println("Child");
            }else{
                System.out.println("Adult"); 
         }
    }
}