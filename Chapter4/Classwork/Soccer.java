package Classwork;

public class Soccer{
    public static void main(String[] args){
        Team ahs = new Team("Cats",8);
        for(int i=0; i<8; i++){ //strange team
            ahs.addPlayer(new Athlete("player"+i,(int)Math.floor(Math.random()*43)+8),i);
        }
        System.out.print(ahs);
    }
}
