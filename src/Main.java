import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean doneInput = false;
        boolean donePoint = false;
        boolean doneRoll = false;
        boolean doneGame = false;
        String gameChoice = "";
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        do {
            do {


                int roll1 = rnd.nextInt(6) + 1;
                int roll2 = rnd.nextInt(6) + 1;
                int CrapsRoll = roll1 + roll2;

                if (CrapsRoll == 2) {
                    doneRoll = true;
                    System.out.println("You Crapped out");
                } else if (CrapsRoll == 3) {
                    doneRoll = true;
                    System.out.println("You Crapped out");
                } else if (CrapsRoll == 12) {
                    doneRoll = true;
                    System.out.println("You Crapped out");
                } else if (CrapsRoll == 7) {
                    doneRoll = true;
                    System.out.println("Congratulations! You win.");
                } else if (CrapsRoll == 11) {
                    doneRoll = true;
                    System.out.println("Congratulations! You Win.");
                } else
                    System.out.println("Your roll is " + CrapsRoll);

                doneRoll = false;
                do {
                    System.out.println(" You are now rolling for the point ");
                    int pointRoll1 = rnd.nextInt(6) + 1;
                    int pointRoll2 = rnd.nextInt(6) + 1;
                    int pointRoll = pointRoll1 + pointRoll2;

                    if (pointRoll == 7) {
                        donePoint = true;
                        System.out.println(" You Crapped out ");
                    } else if (pointRoll == CrapsRoll) {
                        donePoint = true;
                        System.out.println(" Congratulations! You Win.");
                    } else {
                        donePoint = false;
                        System.out.println(" Your roll is " + pointRoll);
                    }

                } while (!donePoint);
                doneRoll = true;
            } while (!doneRoll);

            do {
                System.out.println("Do you want to play again?[Y/N]");
                gameChoice = scanner.nextLine();
                if (gameChoice.equalsIgnoreCase("Y")) {
                    doneInput = true;
                    doneGame = false;
                    donePoint = false;
                    doneRoll = false;

                } else if (gameChoice.equalsIgnoreCase("N")) {
                    doneGame = true;
                    doneInput = true;
                } else {
                    System.out.println("Please enter a valid input");
                    doneGame = false;
                    donePoint = true;
                    doneRoll = true;
                    doneInput = false;
                }
            }while(!doneInput);
        } while (!doneGame);

    }
}