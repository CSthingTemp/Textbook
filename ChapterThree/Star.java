import java.util.Scanner;

public class Star{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("How many stars?");
        final int MAXSTARS=scan.nextInt();
        System.out.println();
        
        int currentStars=0; //1
        for(int j=0; j<MAXSTARS; j++){
            for(int i=currentStars; i<MAXSTARS; i++){
                System.out.print('*');
            }
            currentStars++;
            System.out.println();
        }
        System.out.println();
        
        currentStars=0; //2
        for(int j=0; j<MAXSTARS; j++){
            for(int i=1; i<MAXSTARS-currentStars; i++){
                System.out.print(' ');
            }
            for(int i=0; i<=currentStars; i++){
                System.out.print('*');
            }
            currentStars++;
            System.out.println();
        }
        System.out.println();
        
        currentStars=0; //3
        for(int j=0; j<MAXSTARS; j++){
            for(int i=MAXSTARS; i>MAXSTARS-currentStars; i--){
                System.out.print(' ');
            }
            for(int i=currentStars; i<MAXSTARS; i++){
                System.out.print('*');
            }
            currentStars++;
            System.out.println();
        }
        System.out.println();
        
        currentStars=0; //4
        for(int j=0; j<MAXSTARS/2; j++){
            for(int i=0; i<MAXSTARS/2-currentStars-1; i++){
                System.out.print(' ');
            }
            for(int i=0; i<currentStars*2+1; i++){
                System.out.print('*');
            }
            currentStars++;
            System.out.println();
        }
        currentStars--;
        for(int j=0; j<MAXSTARS/2; j++){
            for(int i=0; i<MAXSTARS/2-currentStars-1; i++){
                System.out.print(' ');
            }
            for(int i=0; i<currentStars*2+1; i++){
                System.out.print('*');
            }
            currentStars--;
            System.out.println();
        }
    }
}