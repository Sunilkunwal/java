package coreJava;

public class StringsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//String is an object 		//String literal
		
		//String s1 = "Sunil Kunwal";
		String s2 = "hello";
		
		//new 
		String s3 = new String("Welcome");
		String s4 = new String ("Welcome");
		
		
		String s = "Sunil Kunwal QA"; 
		String[] splittrdString = s.split("Kunwal");
		System.out.println(splittrdString[0]);
		System.out.println(splittrdString[1]);
		//System.out.println(splittrdString[2]);
		System.out.println(splittrdString[1].trim());
		
		for (int i=s.length()-1; i>=0; i--) {
			
			
			System.out.println(s.charAt(i));
		}
		
	}

}
