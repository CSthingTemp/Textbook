import java.util.Scanner;

public class PalindromeDriver{
    
    public static void main(String[] args){
        boolean keepGoing=true;
        while(keepGoing){
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter a word: ");
            Palindrome p = new Palindrome(keyboard.nextLine());
            boolean correct = p.testWord();
            System.out.print("The word " + p.word + " is ");
            if(!correct)
                System.out.print("NOT ");
            System.out.print("a palindrome");
            if(correct)
                System.out.println('!');
            else
                System.out.println('.');
            System.out.print("\nAgain (y/n)? ");
            if(keyboard.nextLine().charAt(0)!='y')
                keepGoing=false;
        }
    }
}
