package Classwork;

public class Hat {
    private String company;
    private boolean hasHoles;
    
    public Hat(String company_, boolean hasHoles_){
        this.company=company_;
        this.hasHoles=hasHoles_;
    }
    
    public void madeBy(){
        System.out.println(this.company + "made this hat.");
    }
    
    public String toString(){
        String temp="";
        if(!this.hasHoles)
            temp="NO ";
        return this.company + "made this hat with " + temp + "holes";
    }
}
