package javaBasics;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a ="sunil kunwal";
		String b = "";
		
		for (int i = a.length() - 1; i >= 0; i--)
		{
			b = b + a.charAt(i);
			
		}
		System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("The string is a palindrome.");
		}
		else
		{
			System.out.println("The string is not a palindrome.");
		}
	}

}
