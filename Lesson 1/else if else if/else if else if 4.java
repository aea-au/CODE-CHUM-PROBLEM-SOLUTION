import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        System.out.print("Enter first integer: ");
        int sagot1 = sc.nextInt();
        
        System.out.print("Enter second integer: ");
        int sagot2 = sc.nextInt();
        
        System.out.print("Enter third integer: ");
        int sagot3 = sc.nextInt();
        
        System.out.print("Enter fourth integer: ");
        int sagot4 = sc.nextInt();
        
        System.out.print("Enter fifth integer: ");
        int sagot5 = sc.nextInt();
        
        if (sagot1 > 0){
            positiveCount++;
        } else if (sagot1 < 0){
            negativeCount++;
        } else {
            zeroCount++;
        }
        if (sagot2 > 0){
            positiveCount++;
        } else if (sagot2 < 0){
            negativeCount++;
        } else {
            zeroCount++;
        }
        if (sagot3 > 0){
            positiveCount++;
        } else if (sagot3 < 0){
            negativeCount++;
        } else {
            zeroCount++;
        }
        if (sagot4 > 0){
            positiveCount++;
        } else if (sagot4 < 0){
            negativeCount++;
        } else {
            zeroCount++;
        }
        if (sagot5 > 0){
            positiveCount++;
        } else if (sagot5 < 0){
            negativeCount++;
        } else {
            zeroCount++;
        }
        
        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);
    }
}