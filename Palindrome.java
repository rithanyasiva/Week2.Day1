package week2.day1;

public class Palindrome {
	public void palin()
	{
		String text="madam";
		String rev="";
		text=text.toLowerCase();
		for(int i=text.length()-1;i>=0;i--)
		{
			rev=rev+text.charAt(i);
			
		}
		if(text.equals(rev))
		{
			System.out.println("The given string is a palindrome");

		}
		else
		{
			System.out.println("The given string is a palindrome");
		}
	}
public static void main(String[] args) {
		Palindrome obj= new Palindrome();
		obj.palin();
		
	}
}
	

