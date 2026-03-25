import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your income: $");
        float income = sc.nextFloat();
        
        if (age >= 60 && income < 10000){
            System.out.println("Eligible for senior citizen discount");
        } else if (age >= 60 && income >= 10000){
             System.out.println("Not eligible for senior citizen discount");
        } else if (age < 60){
            System.out.println("Not eligible for senior citizen discount");
        }
    }
}