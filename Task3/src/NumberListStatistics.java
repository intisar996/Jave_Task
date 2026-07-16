
public static void main(String[] args) {


    Scanner input = new Scanner(System.in);


    NumberListStatistics numberListStatistics = new NumberListStatistics();

    System.out.println("Enter Number");

    int i = 0;
    while (i < 5) {

        try {
            if(input.hasNextInt()) {
                Integer number = Integer.parseInt(input.nextLine());
                numberListStatistics.addNumbers(number);
                i++;
            }else {
                System.out.println("Not number");
                input.next();
            }
        }catch (NumberFormatException e) {
            System.out.println(e);
        }


    }
    System.out.println("List Number" + numberListStatistics.getNumbers());
    System.out.println("Total Sum Of Number" + numberListStatistics.totalSum());
    System.out.println("Even Number" + numberListStatistics.evenNumber());
//    System.out.println("List Number" + numberListStatistics.getNumbers());
//    System.out.println("List Number" + numberListStatistics.getNumbers());
//    System.out.println("List Number" + numberListStatistics.getNumbers());
//    System.out.println("List Number" + numberListStatistics.getNumbers());

}






public static class NumberListStatistics {


    //Attributes

     public ArrayList<Integer> numbers;
     Integer sum = 0;


     // Constructor
    NumberListStatistics() {
        numbers = new ArrayList<>();
    }


    //Methods

    // add numbers to list
    public boolean addNumbers(Integer number){
            numbers.add(number);
            return true;
    }

    // list number
    public ArrayList<Integer> getNumbers(){
        return  numbers;
    }

    // Sum All number
    public Integer totalSum() {
        for(Integer n : numbers){
            sum += n;
        }
        return sum;
    }

    //Count of even numbers
 public Integer evenNumber() {
     int sumEven = 0;
     for (Integer n : numbers) {
         if (n % 2 == 0) {
             sumEven += n;
         }
     }
     return sumEven;
 }

}