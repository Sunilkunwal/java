package coreJava;

public class ForLoop {

	public static void main(String[] args) {
		
		
		int [] arr = new int [5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;
		
		
		int [] arr2 = {4,5,7,95,7,5,478,15,4,546,454};
		//for loop arr.lenght -5
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		for (int i=0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		} 
		
		String [] name = {"sunil", "kunwal", "golu"};
		for (int i=0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		for(String s: name) {
			System.out.println(s);
		}
		for (int b: arr2) {
			System.out.println(b);
		}
	}

}
