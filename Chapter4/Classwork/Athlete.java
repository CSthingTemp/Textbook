package Classwork;

public class Athlete{
    String name;
    int age;
    public Athlete(String name_, int a){
        this.name=name_;
        this.age=a;
    }
    public boolean equals(Athlete other){
        return (this.name.equals(other.name) && this.age==other.age);
    }
    public String toString(){
        return this.name+" is an athlete that is "+this.age+" years old.";
    }
}
