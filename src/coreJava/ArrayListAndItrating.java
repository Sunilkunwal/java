package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAndItrating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> a = new ArrayList<String>();
		a.add("sunil");
		a.add("kunwal");
		a.add("selenium");
		a.add("appium");
		a.get(2);
		System.out.println(a.get(0));
		
		for (int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("*****************");
		for (String val :a) {
			System.out.println(val);
			
		}
		
		//item is present in ArrayList
		System.out.println(a.contains("selenium"));
		
		String [] name = {"sunil", "kunwal", "golu"};
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("selenium");

	}

}
