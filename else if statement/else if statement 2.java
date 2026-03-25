import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your birth month: ");
        int month = sc.nextInt();
        
        System.out.print("Enter your birth day: ");
        int day = sc.nextInt();
        
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)){
            System.out.println("Your zodiac sign is Capricorn.");
        } else {
            System.out.println("Your zodiac sign is not Capricorn.");
        }
    }
}