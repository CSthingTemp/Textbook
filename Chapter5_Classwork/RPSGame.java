
public class RPSGame implements Game
{
    // instance variables - replace the example below with your own
    Player pOne;
    Player pTwo;
    int numPlayers;
   

    /**
     * Constructor for objects of class RPS
     */
    public RPSGame()
    {
        // initialise instance variables
        numPlayers = determineNumberPlayers();
        
        playGame();
    }
    
    
    public void playGame() {
        setPlayers();
        while(continueGame()) {
            pOne.setChoice(pOne.getCPU());
            pTwo.setChoice(pTwo.getCPU());
            int win  = comparePlayers(pOne, pTwo);
            //Print results
            System.out.println(pOne+ "\n" + pTwo); //toString in RPSPlayer
            
            updateScore(win);
            System.out.println("The score for " + pOne.getName() + " is: " + pOne.getScore());
            System.out.println("The score for " + pTwo.getName() + " is: " + pTwo.getScore());
            System.out.println();
        }
        System.out.println();
        System.out.println("Thank you for playing.  The final score is: \n" + pOne.getName() + ":\t" + pOne.getScore());
        System.out.println(pTwo.getName()+ ":\t" + pTwo.getScore());
        
    }
    
    public void setPlayers() {
        pOne = new RPSPlayer(false); //human player
        pTwo = new RPSPlayer(numPlayers!=0); //cpu
    }
    
     /**
     * Returns 1 or 2 based on how many players are playing RPS
     */
    public int determineNumberPlayers() {
        System.out.print("How many players? ");
        return scan.nextInt();
    }
    
    /**
     * Compare player values and return 1 for p1 win, 0 for tie & -1 for loss
     */
    public int comparePlayers(Player p1, Player p2) {
        if(p1.getChoice().equals(p2.getChoice()))
            return 0;
        if(p1.getChoice().equals("Rock")){
            if(p2.getChoice().equals("Paper"))
                return -1;
            else
                return 1;
        }else if(p1.getChoice().equals("Paper")){
            if(p2.getChoice().equals("Scissors"))
                return -1;
            else
                return 1;
        }else{ //scissors
            if(p2.getChoice().equals("Rock"))
                return -1;
            else
                return 1;
        }
    }
    
    /**
     * Update score based on who wins. Winner will be 1 for player 1 win, 0 for tie and -1 for player 2 win
     */
    public void updateScore(int winner) {
        if(winner==1)
            pOne.updateScore(pOne.getScore()+1);
        else
            pTwo.updateScore(pTwo.getScore()+1);
    }
    
    /**
     * Ask to continue and return true for yes
     */
    public boolean continueGame() {
        System.out.print("Continue (y/n)? ");
        return scan.next().charAt(0)=='y';
    }

}
