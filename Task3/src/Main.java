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
    Scanner inputRaduis = new Scanner(System.in);
    IO.readln("enter radius  ");
    Double radius = Double.parseDouble(inputRaduis.nextLine());

    if (radius <= 0) {
        System.out.println("Invalid radius. Radius must be greater than zero.");
    }else {
        CircleCalculator c = new CircleCalculator(radius);
        c.calculate();
        c.classify();


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


     Scanner InputBase = new Scanner(System.in);
     IO.readln("Enter base");
     Integer base = Integer.parseInt(InputBase.nextLine());

    Scanner InputHeight = new Scanner(System.in);
    IO.readln("Enter Height");
    Integer height = Integer.parseInt(InputHeight.nextLine());

    Scanner Inputlength1 = new Scanner(System.in);
    IO.readln("Enter Height");
    Integer length1 = Integer.parseInt(Inputlength1.nextLine());

    Scanner Inputlength2 = new Scanner(System.in);
    IO.readln("Enter Height");
    Integer length2 = Integer.parseInt(Inputlength2.nextLine());

    Scanner Inputlength3 = new Scanner(System.in);
    IO.readln("Enter Height");
    Integer length3 = Integer.parseInt(Inputlength3.nextLine());


    if(base <= 0 || height <= 0 || length1 <= 0 || length2 <= 0 ||length3 <= 0){
       System.out.println("Invalid input. All values must be greater than zero");
    }else {

        TriangleCalculator triangleCalculator = new TriangleCalculator(base,height,length1,length2,length3);
        triangleCalculator.Cal_Area();
        triangleCalculator.cal_Perimeter();
        triangleCalculator.Tringle_Type();


        System.out.println("Base: " + triangleCalculator.get_base());
        System.out.println("Height: " + triangleCalculator.get_Height());
        System.out.println("Length side 1: " + triangleCalculator.get_Length1());
        System.out.println("Length side 2: " + triangleCalculator.get_Length2());
        System.out.println("Length side 3: " + triangleCalculator.get_Length3());
        System.out.println("Area: " + triangleCalculator.get_Area());
        System.out.println("Perimeter: " + triangleCalculator.get_Perimeter());
        System.out.println("Triangle Type: " + triangleCalculator.Tringle_Type());
    }

}
