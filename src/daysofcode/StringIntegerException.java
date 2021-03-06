package daysofcode;

import java.util.Scanner;
/**
 * Read a string and print its integer value; 
 * if string cannot be converted to an integer, print "Bad String".
 * @author J.T. Earl
 *
 */
public class StringIntegerException {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String convert = in.next();
        String convert = "za";	// for testing without input
        
        try{
        	int convertedString = Integer.parseInt(convert);
            System.out.println(convertedString);   
        }catch(NumberFormatException e){
        	System.err.println("Bad String");
        }finally{
        	in.close();
        }
    }
}
