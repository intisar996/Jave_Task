public class TrapezoidCalculator {


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
