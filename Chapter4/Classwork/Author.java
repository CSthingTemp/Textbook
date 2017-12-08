package Classwork;

public class Author{
    String name;
    int booksPublished;
    public Author(String name_, int books){
        this.name=name_;
        this.booksPublished=books;
    }
    public String toString(){
        return this.name;
    }
}