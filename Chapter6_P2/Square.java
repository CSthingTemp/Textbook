import java.util.Scanner;
public class Square{
    int[][] square;
   
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int s){
        this.square=new int[s][s];
    }
    public Square(){}
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row){
        int total=square[row][0];
        for(int i=1; i<square.length; i++)
            total+=square[row][i];
        return total;
    }
    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col){
        int total=square[0][col];
        for(int i=1; i<square.length; i++)
            total+=square[i][col];
        return total;
    }
    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag(){
        int total=square[0][0];
        for(int i=1; i<square.length; i++)
            total+=square[i][i];
        return total;
    }
    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag(){
        int total=square[0][square.length-1];
        for(int i=1; i<square.length; i++)
            total+=square[i][square.length-1-i];
        return total;
    }
    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic(){
        int total=sumRow(0);
        boolean flag=false;
        for(int i=1; i<square.length; i++)
            if(sumRow(0)!=sumRow(i)){
                flag=true;
                break;
            }
        if(flag)
            return false;
        int other=sumCol(0);
        for(int i=1; i<square.length; i++)
            if(sumCol(0)!=sumCol(i)){
                flag=false;
                break;
            }
        if(flag)
            return false;
        return (total==other && total==sumMainDiag() && total==sumOtherDiag());
    }
    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
    public void setSquare(int[][] sq){
        this.square = sq.clone();
    }
   
    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare(){
        for(int row = 0; row < square.length; row++) {
            for(int col =0; col < square[0].length; col++) {
                System.out.print(square[row][col] + "\t");
            }
            System.out.println();
        }
     }
}