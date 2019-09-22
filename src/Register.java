import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Register {
    ArrayList totalCart;
    HashMap<Integer, String> stock;

    public Register() {
        this.totalCart = new ArrayList<>();
        this.stock = new HashMap<>();
        stock.put(10, "Apple");
        stock.put(20, "Mango");
        stock.put(30, "Banana");
    }

    void addingTotal() {
        int sum = 0;
        int acount=0;
        int bcount=0;
        int ccount=0;
        for (int i = 0; i < totalCart.size(); i++) {
            int itemPrice = (int) totalCart.get(i);
            sum += itemPrice;
            String currentItem = stock.get(itemPrice);

            if (currentItem.equalsIgnoreCase("apple")){
               acount++;
                }
            else if(currentItem.equalsIgnoreCase("mango")){
                bcount++;
            }
            else if(currentItem.equalsIgnoreCase("banana")){
                ccount++;
            }
        }
        System.out.println("Total Apples"+"                       "+acount);
        System.out.println("total Mangoes"+"                      "+bcount);
        System.out.println("total Bananas"+"                      "+ccount);
        System.out.println("total number of items" +"              "+ totalCart.size());
        System.out.println("                         ______________"   );
        System.out.println("total amount due is " +"             "+ "$"+sum);
        System.out.println("                         ______________"   );
        System.out.println("\n");
    }

    void addingItems(Scanner scanner, int apple, int mango, int banana) {
        System.out.println("enter item Number to add to cart:");
        String selection = scanner.nextLine();
        System.out.println("enter the quantity ");
        int quantity = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= quantity; i++) {
            if (selection.equalsIgnoreCase("apple")) {
                totalCart.add(apple);
            } else if (selection.equalsIgnoreCase("mango")) {
                totalCart.add(mango);
            }
            else if (selection.equalsIgnoreCase("banana")) {
                totalCart.add(banana);
        }
    }
    }
}
