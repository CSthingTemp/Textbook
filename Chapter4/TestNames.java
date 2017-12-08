import java.util.Scanner;

public class TestNames{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String[] names = new String[6];
        String[] stuff={"first","middle","last"};
        for(int i=0; i<6; i++){
            System.out.println("Enter a "+stuff[i%3]+" name: ");
            names[i]=scan.nextLine();
        }
        Name name1=new Name(names[0],names[1],names[2]),name2=new Name(names[3],names[4],names[5]);
        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println(name1.length()+"\n");
        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println(name2.length()+"\n");
        System.out.println("The names are \"equal\":"+name1.equals(name2));
    }
}
