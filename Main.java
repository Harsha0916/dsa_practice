//harsha--> hrsh
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String ans = "";
	  // 1 input 
	  Scanner s = new Scanner(System.in);
	  String string = s.nextLine();
	  // 2 write function to check if vowel or not 
	  for(int i =0;i<string.length();i++){
	      char ch = string.charAt(i);
	  
	  // 3 if not vowel add it to string (for loop)
	 if(ch !='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
	    ans+=ch;
	 }
    }
    System.out.println(""+ans);
	 
	  
	}
}