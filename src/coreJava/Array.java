package coreJava;

public class Array {

	public static void main(String[] args) {
		
//		int a;
//		a=4;
	
		
		//a conteiner which stores multipal values of some data type
		
		int a[]= new int[5]; //delcarse an array and allocates memory for the values
		a[0]=2;
		a[1]=6;
		a[2]=1;
		a[3]=9;
		a[4]=12;
		
		
		int b[] = {1,4,3,5,7,8};
		
		for(int i=0;i<b.length;i++)
		
		{
			System.out.println(b[i]);
		}
		
		

	}

}
