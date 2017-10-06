public class Paint{
    public static void main(String[] args){
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        //declare integers length, width, and height;
        //declare double totalSqFt;
        //declare double paintNeeded;
        //Declare and initialize the length, width, and height of the room
        int length=15, width=11, height=8;
        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        double totalSqFt=length*width+2*height*(length+width);
        //Compute the amount of paint needed
        int paintNeeded=(int)Math.ceil(totalSqFt/COVERAGE);
        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.println("Paint needed: "+paintNeeded+"gal");
    }
}