import java.util.Scanner;
import java.util.Random;
public class Rock{
    public static void main(String[] args){
        String personPlay;    //User's play -- "R", "P", or "S"
        char computerPlay;    //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine computer's play
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        //Get player's play -- note that this is stored as a string
        System.out.println("Enter R, P, or S: ");
        personPlay=scan.nextLine();
        //Make player's play uppercase for ease of comparison
        personPlay=personPlay.toUpperCase();
        //Generate computer's play (0,1,2)
        computerInt=generator.nextInt(3);
        //Translate computer's randomly generated play to string
        char[] plays={'R','P','S'};
        computerPlay=plays[computerInt];
        //Print computer's play
        System.out.println("Computer's play: "+computerPlay);
        //See who won:
        
        char playerPlay = personPlay.charAt(0);
        String[] outcomes={"Rock crushes scissors","Scissors cuts paper","Paper covers rock"};
        String[] text={", computer wins!",", player wins!"};
        
        if(playerPlay!='R' && playerPlay!='P' && playerPlay!='S'){
            System.out.println("The human was dumb and couldn't follow basic instructions. Exiting.");
            return;
        }
        
        if(computerPlay==playerPlay){
            System.out.println("A tie between the computer and the human.");
        }else{
            if(computerPlay=='R'){
                if(playerPlay=='S'){
                    System.out.println(outcomes[0]+text[0]);
                }else{
                    System.out.println(outcomes[2]+text[1]);
                }
            }else if(computerPlay=='P'){
                if(playerPlay=='R'){
                    System.out.println(outcomes[2]+text[0]);
                }else{
                    System.out.println(outcomes[1]+text[1]);
                }
            }else{ // 'S'
                if(playerPlay=='P'){
                    System.out.println(outcomes[1]+text[0]);
                }else{
                    System.out.println(outcomes[0]+text[1]);
                }
            }
        }
    }
}