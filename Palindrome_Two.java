package coderbyte;
import java.util. *;
public class Palindrome_Two{

		 static String PalindromeTwo(String str) { 
		     
			    String strReverse = "";
			     
			    // replace all symbols, punctuation, and spaces with ""
			    strReverse = str.replaceAll("[\\W]", "");
			 
			    // check for palindrome
			    String reverse = new StringBuilder(strReverse).reverse().toString();
			    if (reverse.equalsIgnoreCase(strReverse)){
			      return "true";
			    } else {
			      return "false";
			    }  
			  }      
		public static void main(String[] args){
			Scanner scn = new Scanner(System.in);
			
			String test1="Noel - sees Leon";
			System.out.println(PalindromeTwo(test1));
			
			String test2="A war at Tarawa";
			System.out.println(PalindromeTwo(test2));
			
			String test3="Anne,I vote more cars race Rome-to-Vienna";
			System.out.println(PalindromeTwo(test3));
			
			System.out.println(PalindromeTwo(scn.nextLine()));
			scn.close();
		}
	}