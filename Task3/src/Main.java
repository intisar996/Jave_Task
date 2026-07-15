//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    /* Task 1 ( CircleCalculator)
    *
    *
    *
    *
    *
    *
    * */
    System.out.println("Task 1 ( CircleCalculator)");

    Scanner input = new Scanner(System.in);
    System.out.println("enter radius");
    Double radius = Double.parseDouble(input.nextLine());

    if (radius <= 0) {
        System.out.println("Invalid radius. Radius must be greater than zero.");
    }else {
        CircleCalculator c = new CircleCalculator(radius);
        c.calculate();


        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
        System.out.println("Classification: " + c.classify());
    }

    /*Task 2  TriangleCalculator
   *
   *
   *
   *
   * */

    System.out.println("Task 2  TriangleCalculator");
    System.out.println("------------------------------------------------------------------");

    System.out.println("Enter base");
     Integer base = Integer.parseInt(input.nextLine());

    Scanner InputHeight = new Scanner(System.in);
    System.out.println("Enter Height");
    Integer height = Integer.parseInt(InputHeight.nextLine());

    Scanner Inputlength1 = new Scanner(System.in);
    System.out.println("Enter Length");
    Integer length1 = Integer.parseInt(Inputlength1.nextLine());

    Scanner Inputlength2 = new Scanner(System.in);
    System.out.println("Enter Length");
    Integer length2 = Integer.parseInt(Inputlength2.nextLine());

    Scanner Inputlength3 = new Scanner(System.in);
    System.out.println("Enter Length");
    Integer length3 = Integer.parseInt(Inputlength3.nextLine());


    if(base <= 0 || height <= 0 || length1 <= 0 || length2 <= 0 ||length3 <= 0){
       System.out.println("Invalid input. All values must be greater than zero");
    }else {

        TriangleCalculator triangleCalculator = new TriangleCalculator(base,height,length1,length2,length3);
        triangleCalculator.calculateArea();
        triangleCalculator.calculatePerimeter();

        System.out.println("Base: " + triangleCalculator.get_base());
        System.out.println("Height: " + triangleCalculator.get_Height());
        System.out.println("Length side 1: " + triangleCalculator.get_Length1());
        System.out.println("Length side 2: " + triangleCalculator.get_Length2());
        System.out.println("Length side 3: " + triangleCalculator.get_Length3());
        System.out.println("Area: " + triangleCalculator.get_Area());
        System.out.println("Perimeter: " + triangleCalculator.get_Perimeter());
        System.out.println("Triangle Type: " + triangleCalculator.triangleType());
    }


    /*Task 3  TrapezoidCalculator
     *
     *
     *
     *
     * */

    System.out.println("Task 3  TrapezoidCalculator");
    System.out.println("------------------------------------------------------------------");
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
        System.out.println("Leg one : " + trapezoid.getLeg1());
        System.out.println("Leg tow : " + trapezoid.getLeg2());
        System.out.println("Classify Trapezoid : " + trapezoid.classifyTrapezoid());



    }


    input.close();
}
