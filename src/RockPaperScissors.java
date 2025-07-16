import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME

        Scanner sn = new Scanner(System.in);
        Random rand = new Random();

        // DECLARE VARIABLES
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            // GET CHOICE FROM THE USER
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = sn.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }

            // GET RANDOM CHOICE FOR THE COMPUTER
            computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            // CHECK WIN CONDITIONS
            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }else if(playerChoice.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("You win!");
            }else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You win!");
            }else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            }else{
                System.out.println("You lose!");
            }

            // ASK TO PLAY AGAIN?
            System.out.print("Play Agan (yes/no): ");
            playAgain = sn.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        // GOODBYE MESSAGE
        System.out.println("Thanks for playing.");

        sn.close();
    }
}
