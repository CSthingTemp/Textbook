import java.util.Scanner;
public class IntegerList{
    int[] list; //values in the list
    Scanner scan = new Scanner(System.in);
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size){
        list = new int[size];
    }
    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize(){
        for(int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print(){
        for(int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target){
        for(int i=0; i<list.length; i++)
            if(list[i]==target)
                return i;
        return -1;
    }
    //-------------------------------------------------------
    //sort the list into ascending order using the selection sort algorithm
    //-------------------------------------------------------
    public void selectionSort(){
        System.out.println();
        for(int i=0; i < list.length-1; i++){
            int min=i;
            for(int j=i+1; j<list.length; j++){
                if(list[j]<list[min])
                    min=j;
            }
            this.swap(i,min);
        }
    }
    
    public void swap(int i1, int i2){
        int temp=this.list[i2];
        this.list[i2]=this.list[i1];
        this.list[i1]=temp;
    }
    
    public void replaceFirst(int oldVal, int newVal){
        if(this.search(oldVal) != -1)
            this.list[this.search(oldVal)]=newVal;
    }
    
    public void replaceAll(int oldVal, int newVal){
        while(this.search(oldVal) != -1)
            this.list[this.search(oldVal)]=newVal;
    }
}