package daysofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Consider a database table, Emails, which has the attributes First Name and
 * Email ID. Given N rows of data simulating the Emails table, print an
 * alphabetically-ordered list of people whose email address ends in @gmail.com.
 * 
 * 
 * @author J.T. Earl
 *
 */
public class RegexDatabasePatterns {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String regex = "@gmail.com";
        Pattern p = Pattern.compile(regex);
        List<String> names = new ArrayList<String>();
        
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = p.matcher(emailID);
            if(m.find()){
            	names.add(firstName);
            }
        }
        in.close();
        Collections.sort(names);
        for (String name : names) {
			System.out.println(name);
		}
    }
}
