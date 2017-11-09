public class Shape{ //not done
    public int sides;
    public double sideLength;
    
    public Shape(int sides_, double sideLength_){
        this.sides = sides_;
        this.sideLength = sideLength_;
    }
    
    public double findArea(){
        double apothem = Math.sin(this.findAnIntAngle()/180*Math.PI/2)*this.sideLength/2; //fix: use radius, not sideLength/2
        double area = apothem*this.sideLength/2*this.sides;
        return area;
    }
    public double findPerimeter(){
        double total=0;
        for(int i=0; i<this.sides; i++){
            total+=this.sides * this.sideLength;
        }
        return total;
    }
    public double findInteriorAngle(){
        return this.findAnIntAngle();
    }
    public double findExteriorAngle(){
        return 360-this.findAnIntAngle();
    }
    private double findAnIntAngle(){
        int totalAngles = (this.sides-2)*180;
        double oneAngle = totalAngles/(double)this.sides;
        return oneAngle;
    }
}
