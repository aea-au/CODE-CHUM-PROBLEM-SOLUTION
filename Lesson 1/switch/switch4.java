import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Quadrilateral type (S for Square, R for Rectangle, P for Parallelogram, T for Trapezoid): ");
        char quadrilateralType = sc.next().charAt(0);
        
        if (quadrilateralType == 'S' || quadrilateralType == 's'){
            System.out.println("Properties of a Square:");
            System.out.println(" - All sides are equal");
            System.out.println(" - All angles are 90 degrees");
        } else if (quadrilateralType == 'R' || quadrilateralType == 'r'){
            System.out.println("Properties of a Rectangle:");
            System.out.println(" - Opposite sides are equal");
            System.out.println(" - All angles are 90 degrees");
    } else if (quadrilateralType == 'P' || quadrilateralType == 'p'){
            System.out.println("Properties of a Parallelogram:");
            System.out.println(" - Opposite sides are parallel");
            System.out.println(" - Opposite angles are equal");
    } else if (quadrilateralType == 'T' || quadrilateralType == 't'){
            System.out.println("Properties of a Trapezoid:");
            System.out.println(" - One pair of opposite sides are parallel");
            System.out.println(" - Adjacent angles are supplementary");        
} else {
    System.out.println("Invalid Quadrilateral type.");
}
}
}