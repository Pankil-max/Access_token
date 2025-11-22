import java.util.Scanner;
public class RickshawFare{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter distance in km: ");
        float distance=input.nextFloat();
        input.nextLine();
        System.out.println("Enter time in minute: ");
        float time=input.nextFloat();
        input.nextLine();
        System.out.println("Are you local? say yes or no: ");
        String type=input.nextLine();
        System.out.println("Are you travelling in night? say yes or no: ");
        String travel=input.nextLine();
        String isLocal=(type=="yes")?"Local":"Non-Local";
        String isnight=(travel=="yes")?"Night":"Day";
        float fare=(15*distance)+(4*time);
        float discount_fare=(float)0.10*fare;
        float Increased_fare=(float)1.10*fare;
        float final_fare =(type=="yes"&&travel=="yes")?discount_fare:
        (type!="yes"&&travel=="yes")?Increased_fare:fare;

        
        System.out.println("Your final fare is: "+final_fare);
        
        
        
        
        
        
        
        
        
        
        
    }
}