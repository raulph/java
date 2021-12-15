/**

CSE 17 Fall 2019
@author Raphael
IBL8
Program: RecursiveCalls 

*/


public class RecursiveCalls {
  /**
    param: char currLetter
    returns: none

    Recursive Method that prints backwards Alphabet.

  */
  public static void backwardsAlphabet(char currLetter){
    if(currLetter == 'a'){
      System.out.println(currLetter); 
    } else {
      System.out.print(currLetter + " ");
      backwardsAlphabet(--currLetter); // changes the value 
    }
  }
  public static void main(String [] args) { 
    
    char StartingLetter; 
    
    StartingLetter = 'z'; 
    
    backwardsAlphabet(StartingLetter); //calls the method
  
  }
}