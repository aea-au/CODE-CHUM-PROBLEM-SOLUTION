import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the difficulty level (Easy, Medium, Hard): ");
        String difficulty = sc.nextLine();
        
        switch(difficulty){
            case "Easy":
                System.out.println("Message: You selected Easy difficulty. Enjoy the game!");
                break;
            case "Medium":
                System.out.println("Message: You selected Medium difficulty. Get ready for a challenge!");
                break;
            case "Hard":
                System.out.println("Message: You selected Hard difficulty. Brace yourself for a tough gameplay!");
                break;
           default:
                System.out.println("Invalid difficulty level.");
            break;
        }
    }
}