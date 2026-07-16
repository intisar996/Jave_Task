import java.util.Scanner;

public static void main(String[] args) {
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
    input.close();
}

public static class CircleCalculator {

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





