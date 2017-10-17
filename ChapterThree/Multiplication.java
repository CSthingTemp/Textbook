public class Multiplication{
    public static void main(String[] args){
        final int horz=12, vert=12;
        final int maxNumLength=Integer.toString(horz*vert).length();
        for(int i=1; i<=vert; i++){
            for(int j=1; j<=horz; j++){
                String num=Integer.toString(i*j);
                while(num.length()<maxNumLength){
                    num=" "+num;
                }
                System.out.print(num+"\t");
            }
            System.out.println();
        }
    }
}