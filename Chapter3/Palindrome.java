public class Palindrome{
    private String value;
    public Palindrome(String word){
        this.value=word;
    }
    
    public boolean isPalindrome(){
        for(int i=0; i<this.value.length()/2; i++){
            if(this.value.charAt(i)!=this.value.charAt(this.value.length()-1-i))
                return false;
        }
        return true;
    }
}