public class TriangleCalculator {


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
    public int Cal_Area() {
         area = (base * height) / 2;
         return area;
    }
    // calculate Perimeter
    public int cal_Perimeter(){
        Perimeter = length1 + length2 + length3;
        return Perimeter;
    }

    //
    public String Tringle_Type() {
         if(length1.equals(length2) && length2.equals(length3)){
             return "Equilateral Triangle";
         }else if(length1.equals(length2) || length2.equals(length3)) {
             return  "Isosceles Triangle";
         }else {
             return "Scalene Triangle";
         }
    }

    public int get_base() {
         return  base;
    }

    public int get_Height() { return height; }

    public int get_Length1() {return  length1;}
    public int get_Length2() {return  length2;}
    public int get_Length3() {return  length3;}
    public int get_Area() {return  area;}
    public int get_Perimeter() {return  Perimeter;}
}
