import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random ran = new Random();
        boolean play_again = true;
        System.out.println("Welcome to Number Guessing Game!");
        while (play_again) {
            int random_number = ran.nextInt(100)+1;
            int attempt = 0;
            int max_attempt = 10; 
            boolean number_guessed = false;
            System.out.println("I have chosen a number between 1 and 100.");
            System.out.println("You have " + max_attempt + " attempts to guess it.");
            System.out.println();
            while (attempt<max_attempt) {
                System.out.print("Enter your Guess here : ");
                int user_guess = sc.nextInt();  
                attempt++;
                if(user_guess == random_number){
                    System.out.println("Congrats, you guess the right number in "+ attempt + " attempt");
                    number_guessed = true;
                    break;
                }else if (user_guess < random_number) {
                    System.out.println("Too low, try again");
                }else{
                    System.out.println("Too high, try again");
                }
                System.out.println();
            }
            if (!number_guessed) {
                System.out.println("Sorry, you used all attempts. The number was: " + random_number);
            }
            System.out.println();
            System.out.print("Do you want to play again? (yes/no): ");
            String response = sc.next().toLowerCase();
            play_again = response.equals("yes");
        }
        System.out.println("Thanks for playing!");
        sc.close();
    }
}