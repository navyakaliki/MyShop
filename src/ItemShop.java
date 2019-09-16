import java.util.ArrayList;
import java.util.Scanner;

public class ItemShop {

    public static void main(String[] args) {
        ArrayList totalCart = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to Display Items\n" +
                        "Enter 2 to add items to cart\n" +
                        "Enter 3 to check out cart\n"+
                        "enter 4 to Exit cart\n");
                    String choice = scanner.nextLine();
                    int a1 = 1;
                    int a2 = 2;
                    int a3 = 1;
                    switch (choice) {
                        case "1":

                    System.out.println("LIST OF ITEMS\n" +
                            "a1-Apple = $1 ea\n" +
                            "a2- Mango= $2 ea\n" +
                            "a3- Banana= $1 ea\n");
                    break;

                case "2":
                    System.out.println("enter item Number to add to cart:");
                    String selection = scanner.nextLine();
                    System.out.println("enter the quantity ");
                    int quantity= Integer.parseInt(scanner.nextLine());
                    for(int i=1;i<=quantity;i++) {
                        if (selection.equalsIgnoreCase("a1")) {
                            totalCart.add(a1);
//                            System.out.println(totalCart);
                        } else if (selection.equalsIgnoreCase("a2")) {
                            totalCart.add(a2);
//                            System.out.println(totalCart);
                        } else if (selection.equalsIgnoreCase("a3")) {
                            totalCart.add(a3);
//                            System.out.println(totalCart);
                        }

                    }
                    break;

                case "3":
                    int sum=0;
                    for(int i=0;i<totalCart.size();i++){
                        sum+= (int) totalCart.get(i);
                    }
                    System.out.println(totalCart);
                    System.out.println("total amount due is $"+sum);
                    break;
                case "4":
                    System.exit(0);
                    System.out.println("See you again!");
            }

        }while (true);
    }
}
