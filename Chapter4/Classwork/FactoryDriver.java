package Classwork;

public class FactoryDriver {
    public static void main(String[] args){
        Factory tesla=new Factory("123 Main st.",100);
        for(int i=0; i<100; i++){
            tesla.addCar(new Car(4,"Tesla"),i);
        }
        
        System.out.println(tesla);
    }
}
