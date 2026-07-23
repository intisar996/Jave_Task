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
            for(int i = 0; i < productNames.size(); i++){
                if (productNames.get(i).contains(name)) {
                    System.out.println("product quantity :" + productQuantities.get(i));
                    System.out.println("product price : " + productPrices.get(i));
                }
            }

    // 4. Update Product Information

        System.out.println("enter product index");
        Integer index = input.nextInt();
        input.nextLine();

        int saveI = 0;
        for(Integer i = 0; i < productNames.size(); i++){
            if (i.equals(index)) {
                saveI = i;
                System.out.println("enter Product name To update");
                String upname = input.nextLine();
                productNames.set(i,upname);
                System.out.println("New Product Name :" + upname);
                System.out.println("enter Product quantity To update");
                Integer upquantity = input.nextInt();
                productQuantities.set(i,upquantity);
                System.out.println("New Product Quantity :" + upquantity);
                System.out.println("enter Product price To update");
                Double upprice = input.nextDouble();
                productPrices.set(i, upprice);
                System.out.println("New Product Price :" + upprice);
              }
            }

            System.out.println("UPDATED Product index :" + saveI);
            System.out.println("UPDATED Name :" + productNames.get(saveI));
            System.out.println("UPDATED Product  Quantity :" + productQuantities.get(saveI));
            System.out.println("UPDATED Product  Price :" + productPrices.get(saveI));

           //6. Stock Analysis

        Integer totaloqty = 0;
        Double totaloinventory  = 0.0;
        for(int i = 0; i < productQuantities.size(); i++){
            totaloqty += productQuantities.get(i);
            totaloinventory += productQuantities.get(i) * productPrices.get(i);

        }
        System.out.println("Total Products :" + productNames.size());
        System.out.println("Total Quantity :" + totaloqty);
        System.out.println("Inventory Value :" + totaloinventory);


        // 7. Stock Status Checking

        for(int i = 0; i < productQuantities.size(); i++){
            if(productQuantities.get(i) < 5) {
                System.out.println(productNames.get(i) +  "  low stock");
            } else if (productQuantities.get(i) == 0){
                System.out.println(productNames.get(i) +  "  out of stock");
            }else {
                System.out.println(productNames.get(i) +  "  available stock");
            }

        }


        // 8. Remove Product



    }


}
