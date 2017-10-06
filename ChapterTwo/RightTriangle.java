import java.util.Scanner;

public class RightTriangle{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double side1, side2;  // lengths of the sides of a right triangle
        double hypotenuse;        // length of the hypotenuse
        
        // Get the lengths of the sides as input
        System.out.print("Please enter the length of the side of a right triangle: ");
        side1 = keyboard.nextDouble();
        System.out.println();
        System.out.print("Please enter the length of the other side of a right triangle: ");
        side2=keyboard.nextDouble();
        System.out.println();
        
        // Compute the length of the hypotenuse
        hypotenuse=Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        
        // Print the result
        System.out.print("Length of the hypotenuse: ");
        if(hypotenuse%1==0)
            System.out.println((int)hypotenuse);
        else
            System.out.println(hypotenuse);
    }
}