public class Problem1{
    public static double averageArray(int[][] arr){
        int total=0;
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[0].length; j++)
                total+=arr[i][j];
        return total/((double)arr.length*arr[0].length);
    }
    
    public static int[] sumColumns(int[][] arr){
        int[] total=new int[arr.length];
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[0].length; j++)
                total[i]+=arr[i][j];
        return total;
    }
    
    public static int[][] squareArray(int[][] arr){
        int[][] a=new int[arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[0].length; j++)
                a[i][j]=(int)Math.pow(arr[i][j],2);
        return a;
    }
    
    public static void main(String[] args){
        System.out.println(averageArray(new int[][] {{1},{2},{3}}));
    }
}
