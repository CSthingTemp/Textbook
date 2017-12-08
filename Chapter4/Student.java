import java.util.Scanner;

public class Student{
    Scanner scan = new Scanner(System.in);
    //declare instance data
    private String name;
    private int test1Score;
    private int test2Score;
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName){
        this.name=studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades(){
        System.out.print("Please enter the first test grade for "+this.name+": ");
        this.test1Score=scan.nextInt();
        System.out.print("Please enter the second test grade for "+this.name+": ");
        this.test2Score=scan.nextInt();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public String getAverage(){
        return String.valueOf((this.test1Score+this.test2Score)/2);
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    public String getName(){
        return this.name;
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    public void printName(){
        System.out.println(this.name);
    }
    
    public String toString(){
        return this.name+" got the average test score of "+this.getAverage()+".";
    }
    
    public void printInfo(){
        System.out.println("Name: "+this.name+"\tTest 1 score: "+this.test1Score+"\tTest 2 score: "+this.test2Score);
    }
}