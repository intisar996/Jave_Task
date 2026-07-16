public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter base");
     Integer base = Integer.parseInt(input.nextLine());

    Scanner InputHeight = new Scanner(System.in);
    System.out.println("Enter Height");
    Integer height = Integer.parseInt(InputHeight.nextLine());

    Scanner Inputlength1 = new Scanner(System.in);
    System.out.println("Enter Length side 1");
    Integer length1 = Integer.parseInt(Inputlength1.nextLine());

    Scanner Inputlength2 = new Scanner(System.in);
    System.out.println("Enter Length side 2");
    Integer length2 = Integer.parseInt(Inputlength2.nextLine());

    Scanner Inputlength3 = new Scanner(System.in);
    System.out.println("Enter Length side 3");
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

    input.close();
}


public static class TriangleCalculator {


    // Declare var
    // Attributes
     Integer base;
     Integer height;
     Integer length1;
    Integer length2;
    Integer length3;
    Integer area;
    Integer Perimeter;

  // Constructor
     TriangleCalculator(Integer b,Integer h,Integer l1,Integer l2,Integer l3) {
        base = b;
        height = h;
        length1 = l1;
        length2 = l2;
        length3 = l3;
    }


    // Methods

    // Calculate area
    public int calculateArea() {
         area = (base * height) / 2;
         return area;
    }
    // calculate Perimeter
    public int calculatePerimeter(){
        Perimeter = length1 + length2 + length3;
        return Perimeter;
    }

    //
    public String triangleType() {
         if(length1.equals(length2) && length2.equals(length3)){
             return "Equilateral Triangle";
         }else if(length1.equals(length2) || length2.equals(length3) ||  length1.equals(length3)) {
             return  "Isosceles Triangle";
         }else {
             return "Scalene Triangle";
         }
    }

    public Integer get_base() {
         return  base;
    }

    public Integer get_Height() { return height; }

    public Integer get_Length1() {return  length1;}
    public Integer get_Length2() {return  length2;}
    public Integer get_Length3() {return  length3;}
    public Integer get_Area() {return  area;}
    public Integer get_Perimeter() {return  Perimeter;}
}
