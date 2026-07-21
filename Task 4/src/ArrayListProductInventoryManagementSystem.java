import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProductInventoryManagementSystem {



    public static void main(String[] args) {


        // 1. Create Product Lists
        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Integer> productQuantities = new ArrayList<>();
        ArrayList<Double> productPrices = new ArrayList<>();

        productNames.add("Laptop");    productQuantities.add(5);  productPrices.add(750.50);
        productNames.add("Smartphone");   productQuantities.add(12); productPrices.add(499.99);
        productNames.add("Headphones");   productQuantities.add(20); productPrices.add(89.90);
        productNames.add("Keyboard");     productQuantities.add(15); productPrices.add(45.00);
        productNames.add("Mouse");        productQuantities.add(25); productPrices.add(25.50);
        productNames.add("Monitor");    productQuantities.add(8);  productPrices.add(199.99);
        productNames.add("Printer");       productQuantities.add(6);  productPrices.add(150.00);
        productNames.add("Tablet");      productQuantities.add(10); productPrices.add(299.99);
        productNames.add("Camera");        productQuantities.add(4);  productPrices.add(650.00);
        productNames.add("Speaker");       productQuantities.add(18); productPrices.add(120.75);

    //2. Display Inventory


        for(int i =0; i < productNames.size();i++) {
            System.out.println("Product :" + i);
            System.out.println("Name :" + productNames.get(i));
            System.out.println("Quantity :" + productQuantities.get(i));
            System.out.println("Price :" + productPrices.get(i));

        }

    //3. Add New Product
        Scanner input = new Scanner(System.in);
        System.out.println("enter product name");
        String name = input.nextLine();

        System.out.println("enter product quantity");


    }
}
