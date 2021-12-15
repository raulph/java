//// Raphael Keele, 2/1/2019 
//// CSE 2, lab 02: Cyclometer 
/// This program documents the amount of time and speed of each bicycle wheel 

public class Cyclometer { 
  public static void main (String args []) { //// main method of each program { 
    int secsTrip1, secsTrip2, countsTrip2, countsTrip1; // variables needed 
    secsTrip1 = 480; // this  variable documents the amount of seconds for the first trip 
    secsTrip2 = 3220; // the amount of seconds for the second trip 
    countsTrip1 = 1561; // the amount of rotations of the bicycle for trip 1 
    countsTrip2 = 9037; // the amount of rotations of the bicycle for trip 2 
  

    double PI, feetPerMile, inchesPerFoot, secondsPerMinute, wheelDiameter; // variables that document the constants needed to run the program
    double distanceTrip1, distanceTrip2, totalDistance; // variables that document the distance of everything 
  
    PI = 3.14159;  
    feetPerMile = 5280; 
    inchesPerFoot = 12; 
    secondsPerMinute = 60; 
    wheelDiameter = 27.0; 
    
    distanceTrip1 = countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // above gives the distance in inches for each wheel count 
        //a rotation in wheels travels the diameter in inches times PI 
    distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
    totalDistance = distanceTrip1 + distanceTrip2; 
  
  
    /// printing output data 
    System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute)+ " minutes and had "+ countsTrip1+ " counts."); 
    System.out.println ("Trip 2 took " + (secsTrip2/secondsPerMinute)+ " minutes and had "+ countsTrip2+ " counts."); 
    System.out.println("Trip 1 was " + distanceTrip1+" miles");
    System.out.println("Trip 2 was " + distanceTrip2+ " miles"); 
    System.out.println("The total distance was " +totalDistance+" miles"); 
  



  } // end of the main method


} // end of the class
