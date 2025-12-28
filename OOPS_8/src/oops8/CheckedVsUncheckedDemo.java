package oops8;

import java.io.IOException;

public class CheckedVsUncheckedDemo {

    // Checked exception example
    static void readFile() throws IOException {

    	boolean fileExists = false;
    	if(!fileExists) {
    		throw new IOException("File Not found at specifed path");
    	}
    	
    }

    // Unchecked exception example
    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        // Handle checked exception
        try {
        	
        	System.out.println("Attempting to read file");
            readFile();
        } catch (IOException e) {
           System.err.println("Caught Checked Exception " + e.getMessage());
        }

        // Unchecked exception (optional handling)
        try {
            System.out.println("Attempting division...");
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Caught an Unchecked Exception: " + e.getMessage());
        }

        System.out.println("Program continues execution...");
    }
}
