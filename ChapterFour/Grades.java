public class Grades{
    public static void main(String[] args){
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");
        //input grades for Mary
        student1.inputGrades();
        //print average for Mary
        System.out.println(student1);
        System.out.println();
        //input grades for Mike
        student2.inputGrades();
        //print average for Mike
        System.out.println(student2);
        System.out.println();
        student1.printInfo();
        student2.printInfo();
    }
}