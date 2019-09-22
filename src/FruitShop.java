import java.util.ArrayList;
import java.util.Scanner;

public class FruitShop {

    public static void main(String[] args) {
        Register register=new Register();
        Scanner scanner = new Scanner(System.in);
        boolean readyToExit=false;

        do {
            System.out.println("Enter 1 to Display Items\n" +
                        "Enter 2 to add items to cart\n" +
                        "Enter 3 to check out cart\n"+
                        "enter 4 to Exit cart\n");
                    String choice = scanner.nextLine();
                    int apple = 10;
                    int mango = 20;
                    int banana = 30;
                    switch (choice) {
                     case "1":
                         printMenu();
                         break;

                case "2":
                    register.addingItems(scanner, apple, mango, banana);
                    break;

                case "3":
                    register.addingTotal();
                    break;
                case "4":
                    readyToExit=true;
                    System.out.println("See you again!");
            }

        }while (readyToExit==false);
    }

    private static void printMenu() {
        System.out.println("LIST OF ITEMS\n" +
                "a1-Apple = $1 ea\n" +
                "a2- Mango= $2 ea\n" +
                "a3- Banana= $1 ea\n");
    }
}
