public class Table{
    public static void printHeader(){
        System.out.println("---------------------------");
    }
    
    public static void title(){
        System.out.println("==\tStudent Points\t==");
    }
    
    public static void printRow(String name, int lab, int bonus){
        System.out.print(name+"\t");
        if(name.length()<9){
            System.out.print("\t");
        }
        System.out.print(lab+"\t"+bonus+"\t"+(lab+bonus));
        System.out.println();
    }
    
    public static void main(String[] args){
        printHeader();
        title();
        printHeader();
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");
        printRow("Joe",43,7);
        printRow("William",50,8);
        printRow("Mary Sue",39,10);
    }
}