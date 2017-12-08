package Classwork;

public class Student{
    private int idNumber;
    private String name;
    private Student bestFriend;
    private Pet currentPet;
    private Hat currentHat;
    
    public Student(){
        
    }
    
    public Student(int num, String name_){
        this.idNumber = num;
        this.name = name_;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int combineIDs(){
        return this.idNumber+this.bestFriend.idNumber;
    }
    
    public Student makeStudent(){
        Student joe = new Student(this.idNumber, this.bestFriend.name);
        return joe;
    }

    public String toString(){
        return "The student name is: " + this.name;
    }
}