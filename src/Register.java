import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Register {
    ArrayList totalCart;
    HashMap<Integer,String> stock;
    public Register() {
        this.totalCart=new ArrayList<>();
        this.stock=new HashMap<>();
        stock.put(1,"Apple");
        stock.put(2,"Mango");
        stock.put(3,"Banana");
    }

    void addingTotal() {
        int sum=0;
        for(int i=0;i<totalCart.size();i++){
            int itemCode= (int) totalCart.get(i);
            sum+= itemCode;
            String currentItem=stock.get(itemCode);
            System.out.println(currentItem);
        }

        System.out.println("total amount due is $"+sum);
    }

    void addingItems(Scanner scanner, int apple, int mango, int banana) {
        System.out.println("enter item Number to add to cart:");
        String selection = scanner.nextLine();
        System.out.println("enter the quantity ");
        int quantity= Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=quantity;i++) {
            if (selection.equalsIgnoreCase("apple")) {
                totalCart.add(apple);
//                            System.out.println(totalCart);
            } else if (selection.equalsIgnoreCase("mango")) {
                totalCart.add(mango);
//                            System.out.println(totalCart);
            } else if (selection.equalsIgnoreCase("banana")) {
                totalCart.add(banana);
//                            System.out.println(totalCart);
            }

        }
    }
}
