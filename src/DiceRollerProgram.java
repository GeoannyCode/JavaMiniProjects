import java.util.Random;
import java.util.Scanner;

public class  DiceRollerProgram {

    public static void main(String[] args){
        // JAVA DICE ROLLER PROGRAM

        // DECLARE VARIABLES
        Scanner  sc = new Scanner(System.in);
        Random rnd = new Random();
        int numOfDice;
        int total;

        // GET # OF DICE FROM THE USER
        System.out.print("Enter the number of dice to roll: >>");
        numOfDice = sc.nextInt();

        // CHECK IF # OF DICE > 0
        if(numOfDice > 0){

            for(int i = 0; i < numOfDice; i++){
                int roll = rnd.nextInt(1, 7);
                System.out.println("You rolled: " + roll);
            }

        }else{
            System.out.println("Number of dice must be greater than 0");
        }

        // ROLL ALL THE DICE
        // GET THE TOTAL
        // DISPLAY ASCII OF DICE

        sc.close();
    }

}
