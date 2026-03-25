import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the triangle type identifier (E for Equilateral, I for Isosceles, S for Scalene): ");
    char type = sc.next().charAt(0);
    
    System.out.print("Enter the length of side 1: ");
    float side1 = sc.nextFloat();
    
    System.out.print("Enter the length of side 2: ");
    float side2 = sc.nextFloat();
    
    System.out.print("Enter the length of side 3: ");
    float side3 = sc.nextFloat();
    
    if (type == 'E' || type == 'e'){
        
        if (side1 == side2 && side2 == side3){
            System.out.println("The given sides form an Equilateral triangle.");
        } else {
            System.out.println("The given sides do not form an Equilateral triangle.");
        }
    } else if (type == 'I' || type == 'i'){
        if (side1 == side2 || side2 == side3 || side1 == side3){
            System.out.println("The given sides form an Isosceles triangle.");
        } else {
            System.out.println("The given sides do not form an Isosceles triangle.");
        }
    } else if (type == 'S' || type == 's'){
        if (side1 != side2 && side2 != side3 && side1 != side3){
            System.out.println("The given sides form a Scalene triangle.");
        } else {
            System.out.println("The given sides do not form a Scalene triangle.");
        }
    } else {
        System.out.println("Invalid triangle type identifier.");
    }
}  
}