package Classwork;

public class PetDriver {
   public static void main(String[] args){
        Pet sparky = new Pet("Sparky", "bark");
        
        sparky.emitNoise();
        System.out.println(sparky);
        Pet.example();
    }
}
