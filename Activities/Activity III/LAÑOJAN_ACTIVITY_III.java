import java.util.*;
public class LAÑOJAN_ACTIVITY_III {
    public static void main(String []args){
    int temp;
  do{
        Scanner sc = new Scanner(System.in);

 System.out.print("Enter the temperature (in celcius):");
 temp = sc.nextInt();

if(temp>=100){
    System.out.println("Boiling");

} else
    System.out.println("Not Boiling");
    
}while (temp !=0);

}
}