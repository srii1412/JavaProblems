//Anagram
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		while(n>0){
			String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                    System.out.println("Valid");
                }
             catch (PatternSyntaxException e) {
                System.out.println("Invalid");
             }
             n--;            
        }
        in.close();
            
          	
		}
	}
