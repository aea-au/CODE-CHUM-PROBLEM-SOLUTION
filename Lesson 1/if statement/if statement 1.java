import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        
        System.out.print("Enter z: ");
        int z = scanner.nextInt();
        
        if (x == y && y == z){
            System.out.println("Triangle is equilateral.");
        }
    }
}