package Classwork;

public class Car{
    private int wheels;
    private String brand;
    public Car(int wheels_, String brand_){
        this.wheels=wheels_;
        this.brand=brand_;
    }
    
    public void vroom(){
        System.out.println("Vroom vroom, I'm a car!");
    }
    
    public String toString(){
        return "This car has "+ this.wheels +" wheels and was made by " +this.brand;
    }
    
    public int getWheels(){
        return this.wheels;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public boolean equals(Car other){
        return (this.brand.equals(other.getBrand()) && this.wheels==other.getWheels());
    }
}
