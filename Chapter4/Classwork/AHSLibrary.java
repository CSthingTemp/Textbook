package Classwork;

public class AHSLibrary{
    public static void main(String[] args){
        final int total=4;
        Library ahs = new Library("1234 Street St.",total);
        for(int i=0; i<total; i++){
            ahs.addBook(i,new Book(new Author("Jeff",total),"Stuff vol. "+(i+1)));
        }
        System.out.println(ahs);
    }
}
