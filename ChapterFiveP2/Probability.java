public class Probability implements ProbabilityCalc,Comparable<Probability>{
    double value;
    public Probability(double v){
        this.value=v;
    }
    
    public double probabilityAND(Probability p2){
        return p2.value*this.value;
    }
    
    public double probabilityOR(Probability p2, double overlap){
        return this.value+p2.value-overlap;
    }
    
    public int compareTo(Probability p2){
        double a=this.value-p2.value;
        if(a<0)
            return (int)(a-1);
        if(a>0)
            return (int)(a+1);
        return 0;
    }
}
