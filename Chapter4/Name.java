public class Name{
    private String first, middle, last;
    public Name(String first, String middle, String last){
        this.first=first;
        this.middle=middle;
        this.last=last;
    }
    
    public String getFirst(){
        return this.first;
    }
    
    public String getMiddle(){
        return this.middle;
    }
    
    public String getLast(){
        return this.last;
    }
    
    public String firstMiddleLast(){
        return this.first+" "+this.middle+" "+this.last;
    }
    
    public String lastFirstMiddle(){
        return this.last+" "+this.first+" "+this.middle;
    }
    
    public boolean equals(Name other){
        return other.getFirst().toLowerCase().equals(this.first.toLowerCase()) &&
               other.getMiddle().toLowerCase().equals(this.middle.toLowerCase()) &&
               other.getLast().toLowerCase().equals(this.last.toLowerCase());
    }
    
    public String initials(){
        return (this.first.substring(0,1)+this.middle.substring(0,1)+this.last.substring(0,1)).toUpperCase();
    }
    
    public int length(){
        return this.first.length()+this.middle.length()+this.last.length();
    }
}
