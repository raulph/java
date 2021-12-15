import java.util.Scanner;

public class StringAnalysis {
  
  // method for checking whether or not there is a letter in every part of the string. 
    public static boolean Analysis(String x){
      // boolean value that will be returned if there is a letter in every part of the string.        
        boolean isLetter = true; 
        
      // this measures the length of the string 
        int length = x.length(); 
        
      // the for loop that will run through the same length of the for loop 
      // so string s12 will run three times because the length is three characters
        for (int i = 0; i < length; i++) {
          // this will check the character of each string
            char check = x.charAt(i); 
          
          // this runs the boolean of each char
            isLetter = Character.isLetter(check);
          // it only takes one character to not have a letter, so it should immediately return the boolean as false.  
          if (!isLetter){
            return isLetter; 
            }
          // else this returns an isLetter = true.
        }
      return isLetter;  
    }
    
    // method for checking a specific number in the letter in the string. 
    public static boolean Analysis(String x, int y) {
        // boolean with the true value
        boolean isLetter = true; 
        // measures the lentgh of the string
        int length = x.length();
        // if the length is outside of y 
        if (y > length) {
            char check = x.charAt(y - length);
            isLetter = Character.isLetter(check);
          // if not 
        } else {
            char check = x.charAt(y);
            isLetter = Character.isLetter(check);
        }
        // returns the boolean
        return isLetter; 
        
    }
    
  
  // main method   
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Enter a string: ");
        
        // string that is going to be analyzed
        String enter = input.nextLine();
        
        
        System.out.println("Would you like to examine the string by numbers or characters. Enter n for numbers or c for characters: "); 
        
        // string that is used to judge how the string will be analyzed
        String option = input.nextLine();
        
      
      while (!option.equals("c") && !option.equals("n")) {
        
          System.out.println("This is not a valid input."); 
          option = input.nextLine();
        
        
      }
        // if they put n as the option
        if (option.equals("n")) {
            
            System.out.println("Enter a number to check the string through: "); 
            
          // loop for if they do not put in a string. 
            while(!input.hasNextInt()) {
                System.out.println("ERROR. Please input an integer.");
                
                String junkword = input.nextLine();
            }
            
            int num = input.nextInt();
          
          // loop for if the number is less than 1
            while(num < 1) {
              System.out.println("Enter a number greater than zero."); 
              
              num = input.nextInt();
              
            }
          
          
          // because string analysis starts at 0, a person will type in 1, thinking it is 1 when it is really the 2nd character
          // to prevent that we create a new number that will be used for string analysis.
            int num2 = num - 1;
            
            boolean CheckALetter = Analysis (enter, num2); 
            
          // this is for if at a certain number/ position, there is not a letter, meaning the boolean Character.isLetter was false. 
            if (!CheckALetter) {
                System.out.println("The position of the string:" + " [" + enter + "]"  +  " at " + num + " is not a letter"); 
              // for if it was true meaning that there was a letter at this position
            } else {
                System.out.println("The position of the string: " + " [" + enter + "]" + " at " + num + " is a letter.");
            }
            
            // if there user picks c, this part of the program will test whether each character in the string is a letter. 
        } else if (option.equals("c")) {
            // this calls a method to check whether or not every character in the string is a letter. 
            boolean CheckAllChars = Analysis(enter); 
          
          // this for if there is not a letter in every part of the srting. 
            
            if (!CheckAllChars) {
                System.out.println("Every character in the string: " + " [" + enter + "]" + " is not a letter."); 
            // this is for if it is. 
            } else {
                System.out.println("Every character in the string: " + " [" + enter + "]" + " is a letter.");
            }
            
            // this is for the user does not put in anything.
        }
   
        }
            
        
    }
