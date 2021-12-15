import java.util.Scanner;

public class TwistGenerator {
    public static void main (String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer for the length of the twists ");
        
      
        // this integer is used for the length of the string. length2 is used for how much it actually is
        int length, length2;
      /// this is to check for an integer
        while (input.hasNextInt() == false) { 
            String junkword = input.next();
            System.out.println("You did not do an integer, please put in an integer"); 
        }
      /// this is for when it works 
        while (input.hasNextInt() == true) {
            length = input.nextInt();
            length2 = length/3; 
            for (int i = 0; i < length2; i++) {
                System.out.print("/\\ ");
            }
          // printing out a space makes it so that the other for loops can be practiced
            System.out.println(" ");
          // printing the third X
            for (int j = 0; j < length2; j++) {
                System.out.print("  X");
            }    
          // printing out the last pattern for the twists
            System.out.println(" "); 
            for (int k = 0; k < length2; k++) {
                System.out.print("\\/ ");
            }
        }
    }
}

