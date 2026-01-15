/*
 * Author: Mauricio Lopez Alvarez
 * Course: CEN 4802C
 * Assignment: Assignment 1
*/
 
public class FibonacciExample{
    
    // Recursive static method
    public static int fibonacci(int n){
        
        if(n <= 1){
            
            return n;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
        
    } // end fibonacci method
    
    
    // Main method
    public static void main(String[] args) {
       
        // Variables
        int n = 10;
        int result = fibonacci(n);
        
        // Output
        System.out.println("The " + n + "th term of the fibonacci sequence is " 
                            + result + ".");
        
    } // end main method

} // end FibonacciExample class


