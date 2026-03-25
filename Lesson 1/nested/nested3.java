import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        if (num % 2 != 0 && num % 3 == 0){
            System.out.println("Oddly divisible by 3");
        } else if (num % 2 != 0){
            System.out.println("Odd number");
        } else if (num % 2 == 0 && num % 4 == 0){
            System.out.println("Evenly divisible by 4");
        } else if (num % 2 == 0){
            System.out.println("Even number");
        } 
    }
}