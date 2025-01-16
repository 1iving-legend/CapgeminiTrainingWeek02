import java.util.*;

class Palindrome{

public static void main(String []args)
{
     Scanner sc= new Scanner(System.in);
    System.out.println("Enter text: ");
	String text= sc.nextLine();
	PalindromeChecker obj= new PalindromeChecker();
	
	boolean res = obj.isPalindrome( text);
	System.out.println("Is palindrome: "+ res);
	
	
sc.close();
}

}






class PalindromeChecker{
   public String text;
   
   
   public String reverse(String text)
   {
	   String rs="";
	   for(int i=text.length()-1;i>=0;i--)
	   {
		   char temp= text.charAt(i);
		   rs+=temp;
	   }
	   return rs;
   }
   
   public boolean isPalindrome(String text)
   {
      String temp= reverse(text);
	  if(text.equals(temp))
	  {
	    return true;
	  }
	  return false;
   }



}