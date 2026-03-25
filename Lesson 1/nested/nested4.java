import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first score: ");
        float score1 = sc.nextFloat();
        
        System.out.print("Enter the second score: ");
        float score2 = sc.nextFloat();
        
        if (score1 > score2 && score1 > 80){
            System.out.println("Excellent!");
        } else if (score1 > score2 && score1 <= 80){
            System.out.println("Good job!");
        } else if (score1 <= score2){
            System.out.println("Keep up the good work!");
        }
    }
}