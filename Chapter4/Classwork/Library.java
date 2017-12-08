package Classwork;

public class Library{
    Book[] inventory;
    String location;
    public Library(String location_, int size){
        this.inventory=new Book[size];
        this.location=location_;
    }
    public void addBook(int place, Book b){
        inventory[place]=b;
    }
    public String toString(){
        String output="This library contains the following books: ";
        for(Book b : this.inventory){
            output+="\n"+b;
        }
        return output;
    }
}
