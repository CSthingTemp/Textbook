public class Palindrome{
    public String word;
    
    public Palindrome(String word){
        this.word=word;
    }
    
    public boolean testWord(){
        String newWord = this.word.replace(" ","");
        String another = "";
        for(int i=0; i<newWord.length(); i++)
            another+=newWord.charAt(newWord.length()-1-i);
        return (newWord.equals(another));
    }
}