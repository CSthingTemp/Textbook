import java.util.Scanner;

public class ShapeDriver{ //not finished
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sides of a regular polygon: ");
        int numOfSides = scan.nextInt();
        System.out.print("Enter the side length of the polygon: ");
        double sidesLength = scan.nextDouble();
        
        Shape thePolygon = new Shape(numOfSides,sidesLength);
        System.out.println("Area of the polygon: " + thePolygon.findArea());
        System.out.println("Perimeter of the polygon: " + thePolygon.findPerimeter());
        System.out.println("One interior angle (degrees): " + thePolygon.findInteriorAngle());
        System.out.println("One exterior angle (degrees): " + thePolygon.findExteriorAngle());
    }
}
