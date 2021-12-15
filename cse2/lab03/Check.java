//////// CSE 2, Lab 3 
//////// Raphael Keele 
/////// 849241448 2/8/19


import java.util.Scanner; 

public class Check {
    public static void main (String args[]) {
        
        
        System.out.println("Enter the price of the check here in the form of xx.xx: ");  
        Scanner input = new Scanner (System.in); 
        double checkCost = input.nextDouble(); 
        
        
        System.out.println("Enter the percentage of tip you would like to pay: "); ///////////
        double tipPercent = input.nextDouble(); ////////
        tipPercent /= 100; ////////// We want to convert the percentage into a decimal value
        
        System.out.println("Enter the number of people who went out to dinner: "); /////// 
        int numPeople = input.nextInt(); /////// 
        double totalCost, costPerPerson; ///////
        int dollars,dimes, pennies; /////
        totalCost = checkCost * (1 + tipPercent); /////
        costPerPerson = totalCost / numPeople; /// get the whole amount, dropping decimal fraction

        dollars=(int)costPerPerson;  /////////// whole dollar amount of cost
        dimes=(int)(costPerPerson * 10) % 10;  ////////// to the right of the decimal point
        pennies=(int)(costPerPerson * 100) % 10; ///////// for the right cost 
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies); 
    }
}


