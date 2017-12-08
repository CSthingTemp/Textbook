public class Compare1 implements Comparable<String>{
    private String value;
    
    public Compare1(String v){
        this.value=v;
    }
    
    public int compareTo(String s2){
        for(int i=0; i<this.value.length() && i<s2.length(); i++)
            if(this.value.charAt(i)!=s2.charAt(i))
                return this.value.charAt(i)-s2.charAt(i);
        return this.value.length()-s2.length();
    }
    
    public static String largest(String s1, String s2){
        if(s1.compareTo(s2)>=0)
            return s1;
        else
            return s2;
    }
}
