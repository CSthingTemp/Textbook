import java.util.Scanner;
 
public class BaseConvert{
    public static void main(String[] args){
        int base;        // the new base
        long base10Num;   // the number in base 10
        //long maxNumber;   // the maximum number that will fit
        
        Scanner keyboard = new Scanner(System.in);
        String baseBNum = new String (""); // the number in the new base
        
        // read in the base 10 number and the base
        System.out.println();
        System.out.println ("Base Conversion Program!");
        System.out.println();
        System.out.print ("Please enter a base (1 - 9): ");
        base = keyboard.nextInt();
        
        // Compute the maximum base 10 number that will fit in 4 digits
        // in the new base and tell the user what range the number they
        // want to convert must be in
        
        System.out.print ("Please enter a base 10 number to convert: ");
        base10Num = keyboard.nextInt();
        
        
        // Do the conversion (see notes in lab)
        //JavaScript's .toString() can take an argument for what base to put it into!
        
        int digitPlace=0;
        while(Math.pow(base,digitPlace)<base10Num){
            digitPlace++;
        }
        String newNum = "";
        for(int i=digitPlace; i>=0; i--){
            if(base10Num % Math.pow(base, i) < base10Num){
                newNum+= (int) Math.floor(base10Num/Math.pow(base,i));
                base10Num%=Math.pow(base,i);
            }else if(i!=digitPlace)
                newNum+=0;
        }
        
        
        // Print the result (see notes in lab)
        System.out.println(newNum);
    }
}