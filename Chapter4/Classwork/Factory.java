package Classwork;

public class Factory{
    String address;
    Car[] inventory;
    
    public Factory(String st, int size){
        this.address=st;
        this.inventory=new Car[size];
    }
    
    public void addCar(Car c, int location){
        this.inventory[location]=c;
    }
    
    public String toString(){
        String output = "Factory inventory:\n";
        for(int i=0; i<this.inventory.length-1; i++){
            output+=this.inventory[i].toString()+"\n";
        }
        return output+this.inventory[this.inventory.length-1].toString();
    }
}
