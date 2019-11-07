
/**
 * Jason Adler
 * HW #1, Fall 2018
 * The purpose of the code in this file is to simulate a game of craps played 10,000 times.
 * The output will display to the console the total wins and losses, as well as probability of winning.
 * This work is entirely my own.
 */
public class HW1
{
    
    /**
     * main - drives the game of craps test of wins/losses in 10000 games
     */
    public static void main (String [] args)
    {
        // start a new game
        int i;
        double wins = 0.00;
        double losses = 0.00;
        double probability = 0.00;
        double winPercentage = 0.00;
                   
        Craps game = new Craps();  // an instance of a Craps class
        for(i = 1; i<=10000; i++){
        // call the method that plays the game
        
        if (game.playCraps() == 1) {
            wins++;
            
           }
        else {
            losses++;
           
          }
         
        }
         System.out.printf("****************************************************%n%n");
         System.out.printf("Simulation of 10,000 games of Craps:%n%n");
         System.out.printf("Wins: %.0f%n", wins);
         System.out.printf("Losses: %.0f%n%n", losses);
         probability = wins/(wins+losses);
         winPercentage = probability*100;
         System.out.printf("Probability of winning (rounded to three decimals): %.3f%n", probability);
         System.out.printf("Player wins approximately %.1f percent of games.",winPercentage);
         System.out.printf("%n%n****************************************************");
    }

}