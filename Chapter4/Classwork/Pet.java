package Classwork;

public class Pet {
    private String name;
    private String sound;
    private static int numPets;
    
    public Pet(String name_, String sound_){
        this.name=name_;
        this.sound= sound_.toUpperCase();
        numPets++;
    }
    
    public void emitNoise(){
        System.out.println("The pet makes the noise: " + this.sound);
    }
    
    public String toString(){
        return this.name + " makes the sound: " + this.sound;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getSound(){
        return this.sound;
    }
    
    public boolean equals(Pet other){
        return (this.name == other.getName()); 
    }
    
    public static void example(){
        System.out.println("This is in a static method!");
    }
}