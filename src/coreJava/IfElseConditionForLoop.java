package coreJava;

public class IfElseConditionForLoop {

	public static void main(String[] args) {

		
		int [] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
		
		//check if arry has multipal of 2
		
		for (int i=0; i<arr2.length; i++) 
			{
				if (arr2[i] % 2 ==0)
				{
					System.out.println(arr2[i]);
					break;
			}
			else 
			{
			System.out.println(arr2[i] + "is not multiple");
			}
		}
	}

}
