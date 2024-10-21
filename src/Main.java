import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        int max = 5;
        int min = 1;
        int runningCount = 0;
        int dieOne = ran.nextInt(min + max) + min;
        int dieTwo = ran.nextInt(min + max) + min;
        int total;
        String round = "y";
        String start = "n";
        boolean gameRun = true;

        do {
            System.out.print("Would you like to roll? (y or n)");
            start = in.next();
        }while (!start.equalsIgnoreCase("y"));
        do {
            total = dieOne + dieTwo;
            do {
                if (total == 2) {
                    System.out.println("Die One: " +dieOne+ " Die Two: " +dieTwo+ "   " +total+ " Craps! You lose. You got " + runningCount + " points");
                    gameRun = false;
                } else if (total == 3) {
                    System.out.println("Die One: " +dieOne+ " Die Two: " +dieTwo+ "   " +total+ " Craps! You lose. You got " + runningCount + " points");
                    gameRun = false;
                } else if (total == 12) {
                    System.out.println("Die One:" +dieOne+ "    Die Two: " +dieTwo+ "   " +total+ " Craps! You lose. You got " + runningCount + " points");
                    gameRun = false;
                } else if (total == 7) {
                    System.out.println("Die One: " +dieOne+ " Die Two: " +dieTwo+ "   " +total+ " natural, YOU WIN!!");
                    gameRun = false;
                } else if (total == 11) {
                    System.out.println("Die One: " +dieOne+ "    Die Two: " +dieTwo+ "   " +total+ " natural, YOU WIN!!");
                    gameRun = false;
                } else {
                    runningCount = runningCount + total;
                    System.out.println("Die One: " +dieOne+ "   Die Two: " +dieTwo+ "   You have " +total+ " points");
                    dieOne = ran.nextInt(min + max) + min;
                    dieTwo = ran.nextInt(min + max) + min;
                    total = dieOne + dieTwo;
                }
            } while (gameRun);
            gameRun = true;
            total = 0;
            dieOne = ran.nextInt(min + max) + min;
            dieTwo = ran.nextInt(min + max) + min;
            System.out.print("Would you like to play again? (y or n)");
            round = in.next();
        }while(round.equalsIgnoreCase("y"));
    }
}