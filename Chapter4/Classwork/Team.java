package Classwork;


/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team{
    String name;
    Athlete[] players;
    public Team(String name_, int num){
        this.name=name_;
        this.players = new Athlete[num];
    }
    public void addPlayer(Athlete a, int location){
        this.players[location]=a;
    }
    public String toString(){
        String temp="A team called "+this.name+" has in its team:\n";
        for(Athlete a : this.players){
            temp+=a+"\n";
        }
        return temp.substring(0,temp.length()-1);
    }
    
}
