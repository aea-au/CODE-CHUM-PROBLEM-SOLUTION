import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the weather condition: ");
        String weather = sc.nextLine();
        
        char firstLetter = weather.charAt(0);
        
        if (weather.equals("Sunny")||firstLetter == 'S'){
            System.out.println("Suggestion: Enjoy the sunshine");
        } else if (weather.equals("Cloudy")|| firstLetter == 'C'){
            System.out.println("Suggestion: Stay indoors");
        } else if (weather.equals("Rainy") || firstLetter == 'R'){
            System.out.println("Suggestion: Bring an umbrella");
            
        } else if (weather.equals("Windy") || firstLetter == 'W'){
            System.out.println("Suggestion: Fly a kite");
            
        } else {
            System.out.println("Invalid weather condition.");
        }
    }
}