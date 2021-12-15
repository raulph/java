
/*
CSE 17 Fall 2019
@author Raphael Keele
Homework #6
Program: Permutations
*/



import java.util.*;

public class Permutations{

  /**
    @param: String args
    @return: void
    
    This main method simply checks for exceptions with input and then passes it to the PermutationsAlphabet method that prints the permutations.
  */
  
  public static void main(String[] args) {
    
    Scanner input = null; //scanner for the command line arg 
    
    if(args.length == 0){ // if nothing is entered the program will exit
      System.out.println("You need to enter something in the command line.");
      System.exit(0);
    }else { // else it will passe them through Scanners
      input = new Scanner(args[0]);
    }
       
    int number = 0; 
      try { // this method will catch alll the exceptions
         ExceptionThrower(input, args[0]);
      }catch (IllegalArgumentException ex){ 
        System.out.println(ex.getMessage()); // print out a message and exit if there is an exception
        System.exit(0);
      } finally {
        number = Integer.parseInt(args[0]); //parsing the number 
      }
    
    String Ralphabet = "abcdefghijklmnopqrstuvwxyz"; //original alphabet 
    String alphabet = Ralphabet.substring(0, number); // substringed version
    char [] mutations = alphabet.toCharArray(); // turning it into an arry
    
    
    PermutationsAlphabet(mutations, 0); //printing everything
  }
  
  /**
    @params: char [] data, int counter
    @returns: void 
  
    This method prints all permutations. 
   */
  
   private static void PermutationsAlphabet(char [] data, int counter){
   
     if (counter == data.length) // if it is the size of the alphabet (so for abcd if it is 4)
        {
            for (int i = 0; i < data.length; i++) 
            {
                System.out.print(data[i]);
            }
            System.out.println(); //printing the whole array on one line
        } 
        else 
        {
            for (int i = counter; i < data.length; i++) 
            {
                char temp = data[counter];  //swaps values
                data[counter] = data[i]; 
                data[i] = temp;
 
                PermutationsAlphabet(data, counter + 1);
 
                temp = data[counter]; //swaps the characters so that the order is rearranged
                data[counter] = data[i]; 
                data[i] = temp;
            }
        }
  }

  /**
     @param: Scanner input, String C
     @returns: void 
  
    This method simply checks to see if there are exeptions with the command line inputs

  */
  private static void ExceptionThrower(Scanner input, String C) throws IllegalArgumentException{
    
    if(!input.hasNextInt()){ // if no int is entered
      throw new WrongInputException();
    }else {
      int number = Integer.parseInt(C);
      if(number < 0){ // if they are less than zero
        throw new NumberInputException();
      }else if (number > 26){ // if they are greater than 26
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

