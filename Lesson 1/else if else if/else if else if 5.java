import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a year: ");
    int year = sc.nextInt();
    
    if (year % 100 == 0){
        
        if (year % 400 == 0){
            System.out.println("It's a leap century year.");
        } else {
            System.out.println("It's a century year.");
        }
    } else if (year % 4 == 0){
        System.out.println("It's a leap year.");
    } else {
        System.out.println("It's neither a leap year nor a century year.");
    }
    }
}