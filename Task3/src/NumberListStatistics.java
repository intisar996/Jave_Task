
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

    Integer[] result = numberListStatistics.largestSmallestNumber();

    System.out.println("List Number : " + numberListStatistics.getNumbers());
    System.out.println("Total Sum Of Number : " + numberListStatistics.totalSum());
    System.out.println("Even Number : " + numberListStatistics.sumEven());
    System.out.println("Odd Number : " + numberListStatistics.sumOdd());
    System.out.println("Positive Number : " + numberListStatistics.sumPositive());
    System.out.println("Negative Number : " + numberListStatistics.sumNegative());
    System.out.println("Average  : " + numberListStatistics.calculateAverage());
    System.out.println("Largest Number  : " + result[0]);
    System.out.println("Smallest Number  : " + result[1]);
}


public static class NumberListStatistics {

    //Attributes
    public ArrayList<Integer> numbers;
    Integer largest = 0;
    Integer smallest = 0;

    // Constructor
    NumberListStatistics() {
        numbers = new ArrayList<>();
    }

    //Methods

    // add numbers to list
    public boolean addNumbers(Integer number) {
        numbers.add(number);
        return true;
    }

    // list number
    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    // Sum All number
    public Integer totalSum() {
        Integer sum = 0;
        for (Integer n : numbers) {
            sum += n;
        }
        return sum;
    }

    // Average
    public Double calculateAverage() {
         Double average = 0.0;
         average =(double)(totalSum()) / (numbers.size());
         return  average;
    }

    //Count of even and odd numbers
    public Integer sumNUmber(boolean even) {
        int sum = 0;
        for (Integer n : numbers) {
            if ((n % 2 == 0) == even) {
                sum += n;
            }
        }
        return sum;
    }

    // even number
    public Integer sumEven() {
        return sumNUmber(true);
    }

    // odd number
    public Integer sumOdd() {
        return sumNUmber(false);
    }

    //Count odd or positive number
    public Integer sumNumberType(boolean pos) {
        int sum = 0;
        for(Integer n : numbers) {
            if((n > 0) == pos){
                sum += n;
            }
        }
        return sum;
    }

      // positive number
    public Integer sumPositive(){
        return sumNumberType(true);
    }

    // negative number
    public Integer sumNegative(){
        return sumNumberType(false);
    }

    // Largest

    public Integer[] largestSmallestNumber() {
        for(Integer n : numbers) {
            largest = numbers.getFirst();
            smallest = numbers.getFirst();
            if(n > largest) {
                largest = n;
            }

            if( n < smallest) {
                smallest = n;
            }
        }
          return new Integer[] {largest,smallest};
    }

}
