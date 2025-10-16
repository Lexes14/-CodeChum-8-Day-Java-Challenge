import java.util.Scanner;

public class retailTransactionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double itemPrice = 0;
        double totalCost = 0;
        double salesTax = 0;
        double quantity = 0;
        double subTotal;

        System.out.print("Enter the item price: ");
        itemPrice = sc.nextDouble();

        System.out.print("Enter the quantity: ");
        quantity = sc.nextDouble();

        subTotal = itemPrice * quantity;
        salesTax = subTotal * 0.056;

        totalCost = subTotal + salesTax;

        System.out.printf("%.2f", totalCost);

        sc.close();

    }

}