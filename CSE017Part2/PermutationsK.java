import java.util.*;

public class PermutationsK{
  public static void main(String [] args){ 
    Scanner input = null; 
    Scanner input2 = null;
    if(args.length != 2){
      System.out.println("You need to enter two things in the command line.");
      System.exit(0);
    }
    else {
      input = new Scanner(args[0]);
      input2 = new Scanner(args[1]);
    }
     int number = 0;
     int number2 = 0;
      try {
         ExceptionThrower(input, input2, args[0], args[1]);
      }catch (IllegalArgumentException ex){
        System.out.println(ex.getMessage()); 
        System.exit(0);
      } 
      finally {
        number = Integer.parseInt(args[0]); 
        number2 = Integer.parseInt(args[1]);
      }
    
    PermutationsK(number, number2);
  }
  
   private static void PermutationsK(int n, int k){
    String alphabet = "abcdefgphijklmnopqrstuvwxyz";
    String PermutatedAlphabet = alphabet.substring(0, n);
     
     int nfactorial = 1; 
     int kfactorial = 1; 
     for(int i = 1; i < n + 1; i++){
        nfactorial *= i;    
     }
     
     for(int i = 1; i < (n - k)+ 1; i++){
        kfactorial *= i;
     }
     
    int  max = nfactorial/kfactorial;
     System.out.println("The amount of permutations are: " + max);
    PermutationsNK(PermutatedAlphabet,n, k, max);
    
  }
  
    private static void PermutationsNK(String s, int n, int k, int max){  
     
       String [] permutations = new String[max];       
       //String adding = "";
        for(int h = 0; h < max; h++){
          for(int i = 0; i < n; i++){
           // for(int j = 1; j < n; j++){
                //  adding =
                if(i < k+ 1){
                   permutations[h] = s.substring(k);
                  //continue;
                }
            //    }
              }
         }
      
     
      
        for(int i = 0; i < max; i++){
            System.out.println(permutations[i]);          
        }
        

        
          //  System.out.println(permutations[0]);
          
      
      }
      
       private static void ExceptionThrower(Scanner input, Scanner input2, String C, String D) throws IllegalArgumentException{
    
     int number = 0; 
     int number2 = 0; 
     
    if(!input.hasNextInt()|| !input2.hasNextInt()){
      throw new WrongInputException();
    }else {
      number = Integer.parseInt(C);
      number2 = Integer.parseInt(D);
      if(number < 0 || number2 < 0){
        throw new NumberInputException();
      }else if (number > 26 || number2 > 26){
        throw new NumberInputException();
      }else if (number2 > number){
        throw new GreaterThanException();
      }
    }
  
  }
      
    }

class GreaterThanException extends IllegalArgumentException{
  GreaterThanException(){
    super("Your second number is greater than your first."); 
  }
}

class NumberInputException extends IllegalArgumentException{
  NumberInputException(){
    super("Number is less than zero or greater than 26 ");
  }
}

class WrongInputException extends IllegalArgumentException{
  WrongInputException(){
    super("This is not an integer.");
  }
}
