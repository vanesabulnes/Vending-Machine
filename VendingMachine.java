import  java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
		 System.out.println("Please select which drink you want to order");
            System.out.println("0 for Tea,\n1 for Espresso, \n2 for Americano, \n3 for Water");
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int choice = sc.nextInt();

        if (choice < 0 || choice > 4){
            System.out.println("Invalid");
        } else {
            System.out.println(menu[choice]);
        }
    }

}
