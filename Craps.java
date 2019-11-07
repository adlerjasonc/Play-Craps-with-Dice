/**
 *  Craps.java - simulates the dice game of craps
 *  to watch the game, uncomment the "commented-out" print statements
 * 
 *  Shell provide by McCauley
 * 
 * 
 */
public class Craps
{
    private Die die1 = new Die();
    private Die die2 = new Die();
    int dice1 = 0;
    int dice2 = 0;
    int score;
    int roll;
    int point;
            
    /**
     * playCraps - simulates a single game of craps
     * @return - 1 indicates a win, 0 a loss
     */  
    public int playCraps()
    {  
       dice1 = die1.roll();
       dice2 = die2.roll();
       score = dice1 + dice2;
       //System.out.println("roll value is "+score);
       if (score == 7 || score == 11) {
          //System.out.println("Player wins 7 or 11!");
          //System.out.println();
           return 1;
           }
       else if (score == 2 || score == 3 || score == 12) {
           //System.out.println("Player loses 2 3 or 12!");
           //System.out.println();
           return 0;
           }
       else {
           point = score;
           dice1 = die1.roll();
           dice2 = die2.roll();
           score = dice1 + dice2;
           while (score != point || score != 7) {
               dice1 = die1.roll();
               dice2 = die2.roll();
               score = dice1 + dice2;
               //System.out.println("point is "+point);
               //System.out.println("re-roll is "+score);
                                    
               if (score == point) {
                  //System.out.println("Player wins after point roll!");
                  //System.out.println();
                  return 1;
                  }
               else if (score == 7) {
                  //System.out.println("Player loses because of 7!");
                  //System.out.println();
                  return 0;
                  }
                  
                }
                return 0; //confused about why I need this???
         }
    }
}


    
