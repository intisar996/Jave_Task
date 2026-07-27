import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductInventorySetSystem {

    public static void main(String[] args) {
        // open Scanner
        Scanner input = new Scanner(System.in);
        // create set
        Set<String> product = new HashSet<>();

        // askuser to input number of product
        System.out.println("Enter number of Product");
        Integer numOfproduct = input.nextInt();

        // loop
        for(int i = 0; i <= numOfproduct - 1; i++){
            // check number of product
            if(numOfproduct <= 0){
                System.out.println("Invalid number of products.");
            }else {
                System.out.println("enter product name");
                String productname = input.next();
                if(product.contains(productname)) {
                    System.out.println("Product already exists. Duplicate entries are not allowed.");
                }else {
                    // add product to set
                    product.add(productname);
                }
            }
        }

        input.nextLine();
        // search product
        System.out.println("Search by prouct Name");
        String search = input.nextLine();
            if(product.contains(search)) {
                System.out.println("Product found in inventory.");
            }else {
                System.out.println("Product not found in inventory.");
            }


            if(product.size() > 10 ){
                System.out.println("Large Inventory");
            }else if(product.size() >= 5) {
                System.out.println("Medium Inventory");
            }else {
                System.out.println("Small Inventory ");
            }
        // print output
        System.out.println("Total products :" + numOfproduct );
        System.out.println("Total unique products : " + product.size() );
        System.out.println("All unique products : " + product );

        input.close();

    }
}
