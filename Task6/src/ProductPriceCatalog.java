import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductPriceCatalog {

    public static void main(String[] args) {

        // open Scanner
        Scanner input = new Scanner(System.in);
        // create set
        Map<String,Double> product  = new HashMap<>();
        // ask user to enter number of product
        System.out.println("Enter number of product");
        Integer numOfproduct = input.nextInt();


        // loop
        for(int i = 0; i <= numOfproduct - 1; i++){
            // check number of numOfemployees
            if(numOfproduct <= 0){
                System.out.println("Invalid number of product.");
            }else {
                System.out.println("enter product name");
                String name = input.nextLine();
                System.out.println("enter product price");
                Double price = input.nextDouble();

                if(product.containsKey(name)) {
                    System.out.println("Product ID already exists. Record not added.");
                }else {
                    product.put(name,price);
                }
            }
        }
        //search employee
        System.out.println("Enter product name To updated  grade");
        String proname = input.nextLine();


        // get and update price
        if(product.containsKey(proname)) {
            // display product price
            System.out.println("" + product.get(proname));
            // Ask the user whether they want to update the price (Y/N)
            System.out.println("do you  want to update the price (Y/N)");
            String answer = input.nextLine();
            if (answer.equals("Y") || answer.equals("y")) {
                System.out.println("Enter new price");
                Double newprice = input.nextDouble();
                product.replace(proname,newprice);
                System.out.println("Price updated successfully.");
            }else {
                System.out.println("Product not found.");
            }
        }


        // classify
        if(product.size()  > 10) {
            System.out.println("Large Inventory");
        }else if(product.size() > 5) {
            System.out.println("Medium Inventory");
        }else {
            System.out.println("Small Inventory");
        }


        // print output
        System.out.println("Total unique products :  " + numOfproduct);
        System.out.println("Total products records :  " + product.size());
        System.out.println("All product names and prices :" + product);

    }
}
