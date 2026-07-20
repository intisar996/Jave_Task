public static void main(String[] args) {

    List<String> productNames  = new ArrayList<>();
    List<Double> productPrices = new ArrayList<>();
    List<Integer> productQuantities = new ArrayList<>();


    Scanner input = new Scanner(System.in);

    for(int i =0; i < 3; i++){
        System.out.println("enter product name");
        String name = input.nextLine();
        System.out.println("enter product prices");
         Double price = input.nextDouble();
        System.out.println("enter product quantities");
         Integer quantity = input.nextInt();
          input.nextLine();
        productNames.add(name);
        productPrices.add(price);
        productQuantities.add(quantity);
    }
    ProductInventorySystem.displayReport(productNames, productPrices, productQuantities);
    input.close();
    }


public static class ProductInventorySystem {


    //Methods

    // calculate inventory total
    public static Double calculateTotalValue(List<Double> prices, List<Integer> quantities) {
        Double total = 0.0;
        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i) * quantities.get(i);
        }
        return total;
    }

    //checkStockStatus()
    public static String checkStockStatus(int quantities) {
        if (quantities > 10) {
            return "High Stock";
        } else if (quantities >= 1) {
            return "Available";
        } else {
            return "Out of Stock";
        }
    }

    // find expensive product
    public static  String  findMostExpensiveProduct(List<String> names, List<Double> prices) {

         Double Hights = prices.getFirst();
        String expensiveProductName = "";
         for(int i =0; i < prices.size(); i++) {
             if (Hights > prices.get(i)) {
                 Hights = prices.get(i);
                  expensiveProductName = names.get(i);
             }
         }
            return Hights + "Expensive Product Name : " + expensiveProductName;
    }

   // Number of product in stock ,out stock
    public static Integer[] countAvailabilityProduct(List<Integer> quantities){

         Integer outOfStock = 0;
         Integer available =0;
         for(Integer q : quantities){
             if(checkStockStatus(q).equals("High Stock")  || checkStockStatus(q).equals("Available") ) {
                 available++;
             }else {
                 outOfStock++;
             }
         }
         return  new Integer[] {available,outOfStock};
}



// fun to display all output
public static void displayReport(List<String> names, List<Double> prices, List<Integer> quantities) {

    System.out.println("========== Inventory Report ==========");


    for (int i = 0; i < names.size(); i++) {
        System.out.println("Product: " + names.get(i) +
                " | Price: " + prices.get(i) +
                " | Quantity: " + quantities.get(i) +
                " | Stock Status: " + checkStockStatus(quantities.get(i)));
    }


    double totalValue = calculateTotalValue(prices, quantities);
    Integer[] stock = countAvailabilityProduct(quantities);
    String expensive = findMostExpensiveProduct(names, prices);

    System.out.println("--------------------------------------");
    System.out.println("Total Inventory Value : " + totalValue);
    System.out.println("Most Expensive Product : " + expensive);
    System.out.println("Available Products : " + stock[0]);
    System.out.println("Out of Stock Products : " + stock[1]);
}

}
