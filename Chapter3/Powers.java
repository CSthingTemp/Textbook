import java.util.Scanner;

public class Powers{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("How many powers of two? ");
        int powers=scan.nextInt();
        
        System.out.println("Here are the first "+powers+" powers of two:");
        for(int i=0; i<=powers; i++){
            System.out.println("2^"+i+" = "+ (int)Math.pow(2,i));
        }
    }
}