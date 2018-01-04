import java.util.Scanner;

public class IntegerList{
    int[] list; //values in the list
    int size;
    int elements;
    Scanner scan = new Scanner(System.in);
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size){
        list = new int[size];
        this.size=size;
        this.elements=0;
    }
    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize(){
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        this.elements=this.size;
    }
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print(){
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target){
        for (int i=0; i<list.length; i++)
            if (list[i] == target)
                return i;
        return -1;
    }
    //-------------------------------------------------------
    //sort the list into ascending order using the selection sort algorithm
    //-------------------------------------------------------
    public void selectionSort(){
        int minIndex;
        for (int i=0; i < list.length-1; i++){
            //find smallest element in list starting at location i
            minIndex = i;
            for (int j = i+1; j < list.length; j++)
                if (list[j] < list[minIndex])
                    minIndex = j;
            //swap list[i] with smallest element
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }
    
    public void increaseSize(){
        int[] arr = new int[this.list.length*2];
        for(int i=0; i<this.list.length; i++)
            arr[i]=this.list[i];
        this.list=arr;
        this.size*=2;
    }
    
    public void addElement(int newVal){
        if(this.list[this.list.length-1]!=0)
            this.increaseSize();
        for(int i=0; i<this.list.length; i++)
            if(this.list[i]==0){
                this.list[i]=newVal;
                break;
            }
        this.elements++;
    }
    
    public void removeFirst(int newVal){
        if(this.search(newVal)!=-1){
            int place=this.search(newVal);
            this.list[place]=0;
            this.elements--;
            for(int i=place; i<this.list.length-1; i++)
                this.list[i]=this.list[i+1];
            this.list[this.list.length-1]=0;
        }
    }
}
