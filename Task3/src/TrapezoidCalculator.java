public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Base One");
    Integer base1 = Integer.parseInt(input.nextLine());

    System.out.println("Enter Base tow");
    Integer base2 = Integer.parseInt(input.nextLine());

    System.out.println("Enter height");
    Integer heights = Integer.parseInt(input.nextLine());

    System.out.println("Enter leg One");
    Integer leg1 = Integer.parseInt(input.nextLine());

    System.out.println("Enter leg tow");
    Integer leg2 = Integer.parseInt(input.nextLine());

    if(base1 <= 0 || base2 <= 0 || heights <= 0 || leg1 <= 0 || leg2 <= 0) {
        System.out.println ("Invalid input. All measurements must be greater than zero");
    }else {
        TrapezoidCalculator trapezoid = new TrapezoidCalculator(base1,base2,heights,leg1,leg2);
        trapezoid.calculateArea();
        trapezoid.calculateperimeter();



        System.out.println("Area: " + trapezoid.getArea());
        System.out.println("Perimeter: " + trapezoid.getPerimeter());
        System.out.println("Height : " + trapezoid.getHeight());
        System.out.println("Base one : " + trapezoid.getBase1());
        System.out.println("Base tow : " + trapezoid.getBase2());
        System.out.println("Leg one : " + trapezoid.getLeg1());
        System.out.println("Leg tow : " + trapezoid.getLeg2());
        System.out.println("Classify Trapezoid : " + trapezoid.classifyTrapezoid());

    }

    input.close();
}


    public static class TrapezoidCalculator {
    // Attributes
     Integer base1;
     Integer base2;
     Integer height;
     Integer leg1;
     Integer leg2;
     Integer area;
     Integer perimeter;

     // Constructor
    TrapezoidCalculator(Integer b1,Integer b2,Integer h,Integer l1,Integer l2){
        base1 = b1;
        base2 = b2;
        height = h;
        leg1 = l1;
        leg2 = l2;
    }

    //Methods
     public Integer calculateArea() {
        area = ((base1 + base2) * height) / 2;
        return  area;
     }

    public Integer calculateperimeter() {
        perimeter = base1 + base2 + leg1 + leg2;
        return  area;
    }

    public String classifyTrapezoid() {
         if(perimeter < 30) {
             return "Small Trapezoid";
         }else if (perimeter <= 60) {
             return " Medium Trapezoid";
         }else {
             return "Large Trapezoid";
         }
    }


    public Integer getArea() {
        return  area;
    }

    public Integer getPerimeter() {
        return  perimeter;
    }

    public Integer getBase1() {
        return  base1;
    }

    public Integer getBase2() {
        return  base2;
    }

    public Integer getHeight() {
        return  height;
    }

    public Integer getLeg1() {
        return  leg1;
    }

    public Integer getLeg2() {
        return  leg2;
    }


}
