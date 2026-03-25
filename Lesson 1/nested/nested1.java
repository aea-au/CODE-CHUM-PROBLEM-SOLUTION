import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter your genre preference (a for adventure, m for mystery, f for fantasy, s for science fiction): ");
    String genre = sc.nextLine().toLowerCase();
    
    if (age >= 8 && age <= 12 ){
        if (genre.equals("a")){
            System.out.println("The Adventures of Tom Sawyer");
        } else if (genre.equals("m")){
            System.out.println("Nancy Drew: The Secret of the Old Clock");
        } else {
            System.out.println("No recommendation available");
        }
        
    } else if (age >= 13 ){
        if (genre.equals("f")){
            System.out.println("Harry Potter and the Sorcerer's Stone");
        } else if (genre.equals("s")){
            System.out.println("Ender's Game");
        } else {
            System.out.println("No recommendation available");
        }
     
    } else {
        System.out.println("No recommendation available");
    }
}
}