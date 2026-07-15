import java.util.Scanner;

public class CircleCalculator {

    // attributes
    Double pi = 3.14;
    Double radius;
    Double area;
    Double circumference;

    //Constructor
    CircleCalculator(Double r) {
        radius = r;
    }


    // Methods
    public void calculate() {
        area = pi * radius * radius;
        circumference = (2 * pi * radius);
    }
    // End metho


    // classify Method
    public String classify() {
        if (radius < 5) {
            return ("Small Circle");
        } else if (radius <= 15) {
            return("Medium Circle");
        } else {
            return("Large Circle");
        }
    }

      public double getArea() {
        return  area;
      }

      public double getRadius() {
        return radius;
      }

      public double getCircumference() {
        return circumference;
      }


}





