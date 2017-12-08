import java.util.Scanner;

public class PalindromeDriver{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String original=scan.nextLine();
        Palindrome p=new Palindrome(original);
        
        System.out.print("\""+original+"\" is ");
        if(!p.isPalindrome()){
            System.out.print("NOT ");
        }
        System.out.println("a palindrome.");
    }
}