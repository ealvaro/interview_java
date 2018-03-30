import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        // Create list of names that match a gmail
        List<String> testList=new ArrayList();
        // This will match a gmail address
        String myRegExString = "[a-zA-Z]+\\@gmail.com";
        // Create a Pattern object
        Pattern p = Pattern.compile(myRegExString);

        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            // We need a Matcher to match our compiled RegEx to a String
            Matcher m = p.matcher(emailID);
            // if our Matcher finds a match
            if( m.find() ) {
                testList.add(firstName);
            }
        }
        Collections.sort(testList);
        for(String name : testList)
                // Print the match
                System.out.println(name);
    }
}
// 6
// riya riya@gmail.com
// julia julia@julia.me
// julia sjulia@gmail.com
// julia julia@gmail.com
// samantha samantha@gmail.com
// tanya tanya@gmail.com
