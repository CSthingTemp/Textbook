import java.util.ArrayList;
import java.util.Scanner;

public class Shop{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<Item> cart = new ArrayList<Item>();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        char keepShopping = 'y';
        
        while (keepShopping=='y'){
            System.out.print ("Enter the name of the item: ");
            itemName = scan.next();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            cart.add(new Item("fruit",13.99,1));
            
            // *** print the contents of the cart object using println
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next().toLowerCase().charAt(0);
        }

        checkOut(cart);

    }
    
    public static void checkOut(ArrayList<Item> yourCart) {
        //You do NOT need a getter method (think about public instance variables)
        
        //Print the contents of the cart (you may use the toString() method)
        System.out.println(yourCart);
        //Ask the user if they would like to remove an item.  If yes, remove that item.
        System.out.print("Would you like to a remove an item (y/n)? ");
        if(scan.next().toLowerCase().charAt(0)=='y'){
            boolean go=true;
            while(go && yourCart.size()>0){
                System.out.println("Your cart:\n"+yourCart);
                System.out.print("What item should be removed (number)? ");
                int r=scan.nextInt();
                yourCart.remove(r);
                System.out.println("Keep removing (y/n)? ");
                go=(scan.next().toLowerCase().charAt(0)=='y');
            }
        }
        //Print final total of items and final price (total)
        System.out.println("Number of items: \t"+yourCart.size());
        double total=0;
        for(Item i : yourCart)
            total+=i.price;
        total=Math.round(total*100)/100;
        System.out.println("Final price: \t"+total);
    }
}