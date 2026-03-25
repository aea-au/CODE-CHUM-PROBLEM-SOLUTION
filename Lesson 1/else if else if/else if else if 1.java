import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        if (num1 > 0 && num2 > 0 && num3 > 0){
            System.out.println("All numbers are positive.");
        } else if (num1 < 0 && num2 < 0 && num3 <0){
            System.out.println("All numbers are negative.");
        } else if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0){
            System.out.println("All numbers are even.");
        } else if (num1 % 2 != 0 && num2 % 2 != 0 && num3 %2 != 0){
            System.out.println("All numbers are odd.");
        } else {
            System.out.println("Numbers are different.");
        }
    }
}