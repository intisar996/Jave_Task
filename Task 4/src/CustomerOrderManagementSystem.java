import java.util.ArrayList;

public class CustomerOrderManagementSystem {
    ArrayList<Integer> orderId = new ArrayList<>();
    ArrayList<String> customerName = new ArrayList<>();
    ArrayList<String> productName = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();
    ArrayList<String> orderStatus = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();

    int[] ids = {1001, 1002, 1003, 1004};

    String[] customers = {"intisar", "Sara", "Omar", "Ahmed"};

    String[] products = {"Laptop", "Phone", "Keyboard", "Monitor"};

    int[] qty = {2, 3, 4, 2};

    double[] price = {750.0, 500.0, 50.0, 300.0};

    String[] status = {"Pending", "Completed", "Cancelled", "Pending"};
    int total=0;
    double sales=0;
    double average=0;
    double highestOrder=0;
    double lowestOrder=0;
    double new_sales=0;


    void main(String[] args) {
        for (int i = 0; i < ids.length; i++) {

            orderId.add(ids[i]);
            customerName.add(customers[i]);
            productName.add(products[i]);
            quantities.add(qty[i]);
            prices.add(price[i]);
            orderStatus.add(status[i]);
        }

        String input =IO.readln("enter the id of order");
        int user=new Integer(input);
        if(orderId.contains(user)){
            int index=orderId.indexOf(user);
            System.out.println("Order ID: " + orderId.get(index));
            System.out.println("Customer: " + customerName.get(index));
            System.out.println("Product: " + productName.get(index));
            System.out.println("Quantity: " + quantities.get(index));
            System.out.println("Price: " + prices.get(index));
            System.out.println("Status: " + orderStatus.get(index));
            double total= quantities.get(index) * prices.get(index);
            IO.println("total is" + total);

        }
        String input1 =IO.readln("enter your name");
        String input2 =IO.readln("enter product name");
        String input3 =IO.readln("enter quantities");
        int products=new Integer(input3);
        String input4 =IO.readln("enter prices");
        double price=new Double(input4);
        customerName.add(input1);
        productName.add(input2);
        quantities.add(products);
        prices.add(price);
        IO.println(customerName);


        for (int i = 0; i < ids.length; i++) {
            total++;
            sales=  (sales+ prices.get(i));
            average=sales/total;
            highestOrder = quantities.get(0) * prices.get(0);
            lowestOrder = quantities.get(0) * prices.get(0);

            if (total > highestOrder) {
                highestOrder = total;
            }

            if (total < lowestOrder) {
                lowestOrder = total;
            }

        }
        System.out.println("Total Orders: " + orderId.size());
        System.out.println("Total Sales: " + sales);
        System.out.println("Average Order: " + average);
        System.out.println("Highest Order: " + highestOrder);
        System.out.println("Lowest Order: " + lowestOrder);

        int pending = 0;
        int completed = 0;
        int cancelled = 0;

        for (String status : orderStatus) {

            if (status.equalsIgnoreCase("Pending"))
                pending++;

            else if (status.equalsIgnoreCase("Completed"))
                completed++;

            else if (status.equalsIgnoreCase("Cancelled"))
                cancelled++;
        }

        System.out.println("Pending Orders: " + pending);
        System.out.println("Completed Orders: " + completed);
        System.out.println("Cancelled Orders: " + cancelled);

        String input5=IO.readln("enter total amount of order");
        int name=new Integer(input5);
        if(name>=5000){
            double new_sales = sales * 0.15;
        }else if(name >=2000){
            double new_sales = sales * 0.10;

        }else if (name >=1000){
            IO.println("no discount");
        }
        IO.println("origninal sales:" + sales);
        IO.println("new sales:" + new_sales);

        for(int i=0; i<=prices.get(i-1); i++){
            for(int j=i+1; j<=prices.get(i-1); j++){
                double total1 = quantities.get(i) * prices.get(i);
                double total2 = quantities.get(j) * prices.get(j);
                if (total1 > total2) {
                    int tempId = orderId.get(i);
                    orderId.set(i, orderId.get(j));
                    orderId.set(j, tempId);

                    String tempCustomer = customerName.get(i);
                    customerName.set(i, customerName.get(j));
                    customerName.set(j, tempCustomer);

                    String tempProduct = productName.get(i);
                    productName.set(i, productName.get(j));
                    productName.set(j, tempProduct);

                    int tempQuantity = quantities.get(i);
                    quantities.set(i, quantities.get(j));
                    quantities.set(j, tempQuantity);

                    double tempPrice = prices.get(i);
                    prices.set(i, prices.get(j));
                    prices.set(j, tempPrice);

                    String tempStatus = orderStatus.get(i);
                    orderStatus.set(i, orderStatus.get(j));
                    orderStatus.set(j, tempStatus);
                }
            }
        }


    }

}



