
/*
CSE 17 Fall 2019
@author Raphael Keele
Homework #6 	
Program: Combinations
*/


import java.util.*;

public class Combinations{
  
   /**
    @param: args
    @return: void
    
    This main method simply checks for exceptions with input and then passes it to the CombinationsK method that prints the combos


*/
  public static void main(String[] args) {
    
    Scanner input = null; //creating a scanner that will be used to evaluate the command line args
    
    if(args.length == 0){ // if nothing is entered the program will exit
      System.out.println("You need to enter something in the command line.");
      System.exit(0);
    }else { // else it will create a scanner with the command line args 
      input = new Scanner(args[0]);
    }
       
    int number = 0; 
      try {
         ExceptionThrower(input, args[0]); // this method will check to see if there are any wrong inputs
      }
    catch (IllegalArgumentException ex){ // this will print them out to the screen 
        System.out.println(ex.getMessage()); 
        System.exit(0);
      }
    finally { // if there is nothing wrong then the number can be parsed
        number = Integer.parseInt(args[0]); 
      }
    
    String alphabet = "abcdefghijklmnopqrstuvwxyz";  // the giant alphabet that is being referenced
    alphabet = alphabet.substring(0, number); // cutting it at the number
    Combinations("", alphabet); //passing the number in 
   
    
  }
  
  /**
    @params: String before, String alphabet
    @returns: void 
  
    This method prints all Combinations
   */
  
    private static void Combinations(String before, String alphabet){
        System.out.println(before); // this will print out the empty string 
      
        for (int i = 0; i < alphabet.length(); i++){ // this for loop will take the the first char and add to the prefix and substring the rest
            Combinations(before + alphabet.charAt(i), alphabet.substring(i + 1)); 
         }  
    }
  
  

  /**
     @param: Scanner input, String C
     @returns: void 
  
    This method simply checks to see if there are exeptions with the command line inputs

  */
  
  private static void ExceptionThrower(Scanner input, String C) throws IllegalArgumentException{
    
      if(!input.hasNextInt()){ // will throw an exception that is not a number 
        throw new WrongInputException();
      }else { // parse the number and check if it is within the range of the alphabet (0-26)
        int number = Integer.parseInt(C);
        if(number < 0 && number > 26){
          throw new NumberInputException();
        }
      }
    }
  

  
}
  
 /**
  custom exception class that will check if the numbers are in between 0-26 

*/ 

class NumberInputException extends IllegalArgumentException{
  NumberInputException(){
    super("Number is less than zero or greater than 26 ");
  }
}

/**
  custom exception class that will make sure an integer is being entered
*/

class WrongInputException extends IllegalArgumentException{
  WrongInputException(){
    super("This is not an integer.");
  }
}
  