import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();
        
        System.out.print("Enter the current year: ");
        int currentYear = sc.nextInt();
        
        int age = currentYear - birthYear;
        
        double squareRoot = Math.sqrt(age);
        
        if(squareRoot == (int) squareRoot){
            System.out.println("Your age is a perfect square.");
        } else {
            System.out.println("Your age is not a perfect square.");
        }
    }
}