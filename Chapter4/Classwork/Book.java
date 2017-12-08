package Classwork;

public class Book{
    Author writtenBy;
    String name;
    public Book(Author au, String name_){
        this.writtenBy=au;
        this.name=name_;
    }
    public String toString(){
        return "Book, "+this.name+", written by "+this.writtenBy+".";
    }
}
