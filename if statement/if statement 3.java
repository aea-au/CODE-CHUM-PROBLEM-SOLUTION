import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter character: ");
        char char1 = scanner.next().charAt(0);
        
        if (!Character.isLetterOrDigit(char1))
        {
            System.out.println("Character is a special character.");
        }
    }
}