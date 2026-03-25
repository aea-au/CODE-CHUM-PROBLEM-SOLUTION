import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        
        if ( x == y ){
            System.out.println("Numbers are equal.");
        }
    }
}