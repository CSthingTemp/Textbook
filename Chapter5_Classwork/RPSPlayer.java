

public class RPSPlayer implements Player
{
    private String name;
    private String choice;
    private boolean cpu;
    private int score;
    /**
     * Constructor for objects of class RPSPlayer
     */
    public RPSPlayer(boolean computer) {
        // initialise instance variables
        this.cpu = computer;
        this.name = setName(cpu);
    }

    /**
     * Returns String of "Rock", "Paper" or "Scissors"
     * Will be random if computer = true
     */
    public void setChoice(boolean computer) {
        if(this.cpu)
            this.choice=this.randomChoice();
        else{
            System.out.print("Enter your choice from \"Rock\", \"Paper\", or \"Scissors\": ");
            this.choice=scan.nextLine();
        }
    }
    
    public boolean getCPU() {
        return this.cpu;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public void updateScore(int value) {
        this.score=value;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getChoice() {
        return this.choice;
    }
    
    public String toString() {
        return "The player " + name + " has choosen " + choice;
    }
    
    /**
     * Sets the player name.  If computer = true, returns "CPU"
     */
    public String setName(boolean computer) {
        if(computer){
            this.name="CPU";
            return "CPU";
        }
        System.out.print("Enter your name: ");
        this.name=scan.nextLine();
        return this.name;
    }
    
     /**
     * If cpu then return a random choice
     */
    public String randomChoice() {
        int value=(int) (Math.random()*3);
        String[] choices={"Rock","Paper","Scissors"};
        return choices[value];
    }
}
