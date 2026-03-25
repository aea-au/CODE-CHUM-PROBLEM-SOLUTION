import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        if (num % 4 == 0){
            System.out.println("The number is divisible by 4.");
        } else if (num % 3 == 0){
            System.out.println("The number is divisible by 3.");
        } else if (num % 2 == 0){
            System.out.println("The number is divisible by 2.");
        } else {
            System.out.println("The number is not divisible by 2, 3, or 4.");
        }
    }
}