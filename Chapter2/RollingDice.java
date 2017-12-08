import java.util.Random;

public class RollingDice{
    public static void main(String[] args){
        Random gen=new Random();
        int num1=gen.nextInt(6), num2=gen.nextInt(6);
        num1++; num2++;
        System.out.println("Num 1: "+num1);
        System.out.println("Num 2: "+num2);
        System.out.println("Total: "+(num1+num2));
    }
}
