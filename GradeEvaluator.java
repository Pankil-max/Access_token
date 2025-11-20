import java.util.Scanner;
public class GradeEvaluator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter your grade: ");
        int grade=input.nextInt();
        String result=(grade>=40)?"Pass":"Fail";
        System.out.println(result);
    }
}