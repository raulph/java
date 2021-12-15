/**

CSE 17 Fall 2019
@author Raphael
IBL8
Program: CountDownTimer

*/


public class CountDownTimer {
  
  /**
    param: int count int 
    returns: none

    Recursive Method that prints a countdown 

  */

  public static void countdown(int countInt){
    
    if(countInt == 0){
      System.out.println("GO!");
    }else {
      System.out.println(countInt);
      countdown(countInt - 1);
    }
  }

  public static void main (String [] args) {
    countdown(2);
    
  }




}