package coreJava;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// 2 4 5 
		// 3 4 7 
		// 5 2 1  
//a[row][coloum]
		
		int a[] [] = new int [2] [3];
		a[0] [0]=2;
		a[0] [1]=4;
		a[0] [2]=5;
		a[1] [0]=3;
		a[1] [1]=4;
		a[1] [2]=5;
		
		System.out.println(a[1][0]);
		
		
		int b [] [] = {{2,4,5}, {3,4,5},{5,2,1}};
		System.out.println(b[2][1]);
		
		
		
	}

}
