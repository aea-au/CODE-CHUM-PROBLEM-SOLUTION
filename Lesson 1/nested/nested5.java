import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        int sqrtNum = (int) Math.sqrt(num);
        boolean isPerfectSquare = (sqrtNum * sqrtNum == num);
        
        int cubeRootNum = (int) Math.round(Math.cbrt(num));
        boolean isPerfectCube = (cubeRootNum * cubeRootNum * cubeRootNum == num);
        
        if (isPerfectSquare && isPerfectCube){
            System.out.println("Perfect in every way");
        } else if (isPerfectCube && num % 2 == 0){
            System.out.println("Perfect in even cubes");
        } else if (isPerfectCube && num % 2 != 0){
            System.out.println("Perfect in an odd way");
        } else {
            System.out.println("Nothing special");
        }
    }
}