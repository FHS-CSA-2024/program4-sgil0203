import java.util.Scanner; 

public class Program4 {
    public static void main(String[]args){
        //Declare Variable 
        int value1 = 0; 
        int value2 = 0; 
        int value3 = 0; 
        int value4 = 0;
        
        //Create my scanner
        Scanner theScanner = new Scanner(System.in); 
        
        //Ask for user input
        System.out.println("Enter the first value: "); 
        value1 = theScanner.nextInt(); 
        
        System.out.println("Enter the second value: "); 
        value2 = theScanner.nextInt(); 
        
        System.out.println("Enter the third value: "); 
        value3 = theScanner.nextInt(); 
        
        System.out.println("Enter the fourth value: ");
        value4 = theScanner.nextInt(); 
        
        //Calculate
        int sum = value1 + value2 + value3 + value4;
        double average = sum / 4.0;
        
        //Print results 
        System.out.println("The sum of the four numbers is " + sum); 
        System.out.println("The average of the four numbers is " + average);
        
        
        
    }
}


//Paste console output below:
/*
Enter the first value: 
475
Enter the second value: 
821
Enter the third value: 
369
Enter the fourth value: 
562
The sum of the four numbers is 2227
The average of the four numbers is 556.75

*/
