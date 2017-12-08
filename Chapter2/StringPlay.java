public class StringPlay{
    public static void main(String[] args){
        String college=new String("PoDunk College");
        String town=new String("Anytown, USA");
        int stringLength=town.length();
        System.out.println(college+" contains "+stringLength+" characters");
        String change1=college.toUpperCase();
        String change2=change1.replace("O","*");
        String change3=college.concat(town);
        System.out.println(change3);
    }
}