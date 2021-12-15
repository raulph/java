
import java.util.*;
// to use scanner and sorting for arrays
public class ArrayGames {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Would you like to run insert or shorten. I for insert, S for shorten.");
    String option = input.nextLine();
    // so that the user follows directions
     while(!option.equals("I") && !option.equals("S")) {
      System.out.println("This is not a valid option, please input I or S."); 
      option = input.nextLine();
    }
    // for if the option equals I 
    if(option.equals("I")) {
      // finding out the length of the int making it from 10 - 20 
      int length = (int) ((Math.random() * 11)+ 10);
      // new array
      int [] Array1 = new int [length];
      System.out.println("Array1: ");
      // initializing all the memebers of the array 
      for (int i = 0; i < Array1.length; i++) {
        Array1[i] = (int) (Math.random() * 21);
      }
      // bringing it to a method to print it out
      print(Array1); 
      // a new array 
      System.out.println("Array2: ");
      int [] Array2 = new int [length];
      generate(Array2); // method that generates the array for me
      insert(Array1, Array2); // method that inserts one of the arrays inside of the other
    } else if (option.equals("S")){
      // if the option is S
      // new array 
      int length = (int) ((Math.random() * 11)+ 10);
      int [] Array1 = new int [length];
      for (int i = 0; i < Array1.length; i++) {
        Array1[i] = (int) (Math.random() * 21);
      }
     // number that will be excluded from the array 
      System.out.println("Pick a number, any number: ");
      int number = input.nextInt(); 
      System.out.println("Array: ");
      print(Array1); // printing the array
      shorten(Array1, number); // shortening it 
    }    
  }
   public static void generate(int [] x) {
         // generating a new array
      for (int i = 0; i < x.length; i++) {    
        x[i] = (int) (Math.random() * 11 + 10);
      } 
      // printing new array
     print(x);   
    }
    // printing all arrays
    public static void print(int [] x) {
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + " ");
        }
      System.out.println();
    }
  // method that inserts one array inside of the other
  public static void insert(int [] x, int [] y) {
    // choosing the number where one array is inserted inside the number
    int random = (int) (Math.random() * x.length); 
    System.out.println("Output: ");
    // for loop
    for (int i = 0; i < x.length; i++) {
      if (i < random) {
      // prininting all the numbers that come before said number
      System.out.print( x[i] + " "); 
      } else if (i == random) {
      // printing out all the numbers in between 
        for (int j = 0; j < x.length; j++){
          System.out.print(y[j] + " ");
        }
      } else if (i > random) { // all the numbers after
        System.out.print(x[i] + " ");
      }
    }System.out.println();
  }
  // method to shortening the array
  public static void shorten(int [] x, int y) { 
    System.out.println("Output: ");
    // prints all the terms before number, this is for if the number is greater than the length of the array  
    if (x.length < y ) {
      for(int i = 0; i < x.length; i++) {
        System.out.print(x[i] + " ");
      } System.out.println();
    } else if (x.length >= y) {
      // for if it is less than or equal to the number
      for (int j = 0; j < x.length; j++) {
        if (j < y) {
        // printing out all the numbers before the term 
          System.out.print(x[j] + " "); 
        }  else if ( j == y) {
        // printing out nothing if it is the number 
          System.out.print(""); 
        } else if (j > y) {
        // all the numbers that occur after 
          System.out.print(x[j] + " ");
        } 
      }     
    }System.out.println();
  }
}