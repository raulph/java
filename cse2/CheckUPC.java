import java.util.Scanner;
import java.util.Random;
import java.util.Arrays; 
public class CheckUPC{

  public static int[] extractDigits(String s){ 
  //String s = "1234";
int[] intArray = new int[s.length()];

for (int i = 0; i < s.length(); i++) {
 intArray[i] = Character.digit(s.charAt(i), 10);
}
for (int i = 0; i < intArray.length-1; i++) {
System.out.print(intArray[i]+" ");
}
System.out.println();


return intArray;

  }
  public static int getOddSum (int[]intArray){ 
  int sum = 0;
  for (int i = 0; i<intArray.length-0;i+=2){//Since we know which element would be odd, we just add them like this
    sum = sum + intArray[i];
    
    
  }
   sum = sum*3;
    
    return sum;
  }
  public static int getEvenSum  (int[]intArray){ 
  int sum = 0;
  for (int i = 1; i<intArray.length-1;i+=2){//Since we know which element would be odd, we just add them like this
    sum = sum + intArray[i];
    
    
  }
    
    
    return sum;
  }
  public static boolean checkDigit   (int num, int[] intArray){ 
    boolean flag = true;
    int lastdigit;
    int checkdigit;
    int lastdigitposition= intArray.length-1;
    if(num%10==0){
      checkdigit = 0;
      
    }else {
     checkdigit = 10-(num%10);
      
    }
    if(checkdigit == intArray[lastdigitposition])
    {
      flag = true;
      
    }
    else {
     flag = false; 
    }
    System.out.println(checkdigit);
    return flag;
  }
 
public static void main(String[] args) {
  Scanner scan = new Scanner( System.in);
  
 
  String userInput;
  
  String digits = scan.nextLine();
  int[]intArray = extractDigits(digits);
  int oddsum = getOddSum(intArray);
  int evensum = getEvenSum(intArray);
  int sum = evensum + oddsum;
  
  boolean flag = checkDigit(sum,intArray);
  
  if (flag = true){
   System.out.println("UPC code is valid"); 
    
  }else{
     System.out.println("Invalid UPC code");  
  }
  
  
  
  
  System.out.println(sum);
  System.out.println(oddsum);
  System.out.println(evensum);
}
        
  }