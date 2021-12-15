import java.util.Scanner; 

public class Area {
    // method to check whether or not the input is valid
    public static boolean valid (double x, double y) {
        
        boolean validity = true;
        // if either of the variables are less than zero, then the variable is invalid
        if (x < 0 || y < 0) {
            validity = false;     
        } else {
          // other than that they are fine
            validity = true;
        }
        // returns the boolean value as either true or false.
        return validity;
    }
    
    // method to check area of rectangle
    public static double rectangle(double x, double y) {
        // area formula
        double AreaofRectangle = x * y; 
        // returning the double 
        return AreaofRectangle;
    }
    
    // method to check the area of a circle
    public static double circle(double x) {
        // area of the circle formula
        double AreaofCircle = (3.14) * (x * x); 
        // returning the double
        return AreaofCircle;
    }
    
  // method to check the area of the triangle
    public static double triangle (double x, double y) {
      // area of triangle formula  
      double AreaofTriangle = (.5) * (x * y);
        // returning the double
        return AreaofTriangle;
    }
    
  // main method
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
       // asking the user to input a shape type
            System.out.println("Enter a shape to calculate an area. Your options are: rectangle, circle, triangle"); 
            String shape = input.nextLine();
            // while loop for if they do not input the right options 
          while (!shape.equals("rectangle") && !shape.equals("circle") && !shape.equals("triangle")) {
                  System.out.println("This is not a valid input. Please input: rectangle, circle or triangle.");
                  shape = input.nextLine();
          }
            // for if they put rectangle
            if(shape.equals("rectangle")) {
                // inputing a variable for the height 
                    System.out.println("Enter a height: ");
              // for if they do not put in a negative number
                    while (!input.hasNextDouble()) {
                      System.out.println("Please enter a double."); 
                      
                      String junkword = input.nextLine();
                    }
              // variable for the height
                    double x = input.nextDouble();
                    System.out.println("Enter a length: ");
              // while loop for if they do not put in a double
                    while (!input.hasNextDouble()){
                      System.out.println("Please enter a double.");
                      String junkword = input.nextLine();
                    }
              // this is the variable for the length 
                    double y = input.nextDouble();
                   // input for the method of whether this is a valid input. 
                    boolean ValidInput = valid(x, y); 
                 if (ValidInput) {
                   // if it is true then we run the method that calculates the area volume
                    double AreaofRec = rectangle(x , y); 
                    System.out.println("The area of the Rectangle is: " + AreaofRec);
                    // if it is false then we print out that the input was not valid.  
                } else if (!ValidInput){
                    System.out.println("This is not a valid input.");
                }
                // if they put circle
            } else if (shape.equals("circle")) {
                System.out.println("Enter the radius of the circle: ");
              // in case they do not enter a double
                while (!input.hasNextDouble()){
                      System.out.println("Please enter a double.");
                      String junkword = input.nextLine();
                    }
                // value for the radius
                double r = input.nextDouble(); 
                // to check whether the input is valid
                boolean ValidInput = valid (r, r); 
                // for if the input is valid
                if (ValidInput) {
                    double Areaofcirc = circle(r); 
                    System.out.println("The area of the Circle is: " + Areaofcirc);
                  // for if the input is not valid
                } else if (!ValidInput) {
                    System.out.println("This is not a valid input."); 
                }
              // if they put triangle
            }else if (shape.equals("triangle")) {
                System.out.println("Enter the base of the triangle: ");
              // for if it is not a double
                while (!input.hasNextDouble()){
                      System.out.println("Please enter a double.");
                      String junkword = input.nextLine();
                    }
              // variable for the base of the triangle
                double b = input.nextDouble();
                System.out.println("Enter the height of the trianle: ");
              // for if it is not a double 
                while (!input.hasNextDouble()){
                      System.out.println("Please enter a double."); 
                      String junkword = input.nextLine();
                    }
              // variable for the height of the triangle
                double h = input. nextDouble(); 
                // method to check if the inputs are valid
                boolean ValidInput = valid (b, h); 
                // if valid it will calculate the area of the triangle
                if (ValidInput) {
                  double Areaoftri = triangle(b, h); 
                  System.out.println("The area of the triangle is: " + Areaoftri);
                  // if not it will print out not valid
                } else if(!ValidInput) {
                    System.out.println("This is not a valid input."); 
                }
            }  
      }
    }
    
    
    
    
    
    
    
