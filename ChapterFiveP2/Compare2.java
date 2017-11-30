public class Compare2 implements Comparable<Integer>{
    private int value;
    
    public Compare2(int v){
        this.value=v;
    }
    
    public int compareTo(Integer other){
        return this.value-other;
    }
    
    public static int largest(int a1, int a2){
        return (a1>=a2 ? a1 : a2);
    }
}
