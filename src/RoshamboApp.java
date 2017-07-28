/**
 * Created by D.Cisero on 7/25/17.
 */
import java.util.Scanner;

public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName;
        String choosePlayer;
        String userChoice;
        String compChoice = "";
        String randyChoice = "";
        String resultOne = "You lucky winner you!!!";
        String resultTwo = "Awe shucks, you Lose!";
        String resultThree = "We have a Draw!";
        String answer = "y";

    do {
        System.out.println("Welcome to the classic game of Rock, Paper, Scissors!");
        System.out.println();

        //prompt the user to enter a name and select an opponent
        System.out.print("Please enter your name: ");
        userName = scan.next();

        //prompt the user to select a player
        System.out.print("Select your opponent (Computer or Randy): ");
        choosePlayer = scan.next();
        System.out.println();

        //prompt the user to select rock, paper, scissors
        System.out.print("Rock, paper, or scissors? ");
        userChoice = scan.next();
        Being uc = new Being();
        System.out.println();

        //validate: if user makes an invalid selection, print error message and prompt again until correct
        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid move, please try again!");
            return;
        }

        //print the player's choice
        System.out.print(userName + ": " + uc.generateRoshambo(userChoice));
        System.out.println();

        //print the opponent's choice
        if (choosePlayer.equalsIgnoreCase("Computer")) {
            Computer computer = new Computer();
            compChoice = computer.generateRoshambo();
            System.out.println("Computer: " + compChoice);
        } else if (choosePlayer.equalsIgnoreCase("Randy")) {
            Randy randy = new Randy();
            randyChoice = randy.generateRoshambo();
            System.out.println("Randy: " + randyChoice);
        }
        scan.nextLine();

        //print the result of the match
        if (userChoice.equals("paper") && compChoice.equals("rock")) {
            System.out.println(userName + " " + resultOne);
        } else if (userChoice.equals("rock") && randyChoice.equals("rock")) {
            System.out.println(resultThree);
        } else if (userChoice.equals("scissors") && randyChoice.equals("scissors")) {
            System.out.println(resultThree);
        } else if (userChoice.equals("rock") && randyChoice.equals("scissors")) {
            System.out.println(userChoice + " " + resultOne);
        } else if (userChoice.equals("rock") && compChoice.equals("rock")) {
            System.out.println(resultThree);
        } else if (userChoice.equals("paper") && randyChoice.equals("paper")) {
            System.out.println(resultThree);
        } else if (userChoice.equals("scissors") && compChoice.equals("rock")) {
            System.out.println(userName + " " + resultTwo);
        } else if (userChoice.equals("scissors") && randyChoice.equals("rock")) {
            System.out.println(userName + " " + resultTwo);
        }
        System.out.println("Try your luck again? (Y/N)");
        scan.nextLine();
    }
         //create do while loop to allow the player to play until they end the game
        while (answer.equalsIgnoreCase("y"));
        System.out.println();

    }
}
