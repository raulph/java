
/*
CSE 17 Fall 2019
@author Raphael Keele
Homework #6
Program: CombinationsK
*/



import java.util.*;

public class CombinationsK{
  
  /**
    @param: args
    @return: void
    
    This main method simply checks for exceptions with input and then passes it to the CombinationsK method that prints the combos


*/

  
  public static void main(String [] args){ 
    Scanner input = null; //scanner for the first command line arg 
    Scanner input2 = null; // scanner for the second command line arg
    
    if(args.length != 2){ // if two things aren't entered the program will exit
      System.out.println("You need to enter two things in the command line.");
      System.exit(0);
    }
    else { // else it will passe them both through Scanners
      input = new Scanner(args[0]);
      input2 = new Scanner(args[1]);
    }
     int number = 0; // numbers that will store the command lines
     int number2 = 0;
      try {
         ExceptionThrower(input, input2, args[0], args[1]); // this method will catch alll the exceptions
      }catch (IllegalArgumentException ex){ // print out a message and exit if nothing has been printed
        System.out.println(ex.getMessage()); 
        System.exit(0);
      } 
        number = Integer.parseInt(args[0]); //parsing the first number 
        number2 = Integer.parseInt(args[1]); //parsing the second number
      String Ralphabet = "abcdefghijklmnopqrstuvwxyz"; //original alphabet 
      String alphabet = Ralphabet.substring(0,number); // substringed version
      char [] stuff = alphabet.toCharArray(); // turning it into an arry 
      char [] combos = new char[number2]; // storing the values
    
     CombinationsK(stuff, combos, 0, number - 1, 0, number2); //printing everything
     System.out.println(); //making it all on one line
  
     }
 
  
/**

  @params: char [] alphabet, char[] combos, int count, int end, int index, int val
  @returns: void 
  
  This method prints all the combinations. 
*/

 private static void CombinationsK(char [] alphabet, char [] combos, int count, int end, int index, int val){
     String combo = ""; // string combos
         if (index == val){ // if index which is 0 when first passed equals the args[1], then will iterate through the array
            for (int j=0; j<val; j++){ // turn it into a string
                combo += combos[j]; // and then print out the strings
            }
            System.out.print(combo + " "); 
            return; 
        }
         for (int i=count; i<=end && end-i+1 >= val-index; i++){ // this will make sure that the for loop actually runs
                combos[index] = alphabet[i];  // the reason why is because we have to make sure that the loop will perform all the 
                CombinationsK(alphabet, combos, i+1, end, index+1, val); // correct amount of enumerations
         }
 }
 
  
/**

  @param: Scanner input, Scanner input2, String C, String D 
  @returns: void 
  
  This method simply checks to see if there are exeptions with the command line inputs
*/

  
  private static void ExceptionThrower(Scanner input, Scanner input2, String C, String D) throws IllegalArgumentException{
    
    if(!input.hasNextInt()|| !input2.hasNextInt()){
      throw new WrongInputException(); // if no int is entered
    }else {
      int number = Integer.parseInt(C);
      int number2 = Integer.parseInt(D);
      if(number < 0 || number2 < 0){ // if they are less than zero
        throw new NumberInputException();
      }else if (number > 26 || number2 > 26){ // if they are greater than 26 
        throw new NumberInputException();
      }else if (number2 > number){ // if one is greater than the other
        throw new GreaterThanException();
      }
    }
  
  } 
}


/**
  custom exception class that will make sure that the second number isn't greater than the first

*/

class GreaterThanException extends IllegalArgumentException{
  GreaterThanException(){
    super("Your second number is greater than your first."); 
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