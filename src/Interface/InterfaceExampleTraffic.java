package Interface;

import javaBasics.InterfaceExample;
import javaBasics.InterfaceExample2;

public class InterfaceExampleTraffic implements InterfaceExample,InterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample a = new InterfaceExampleTraffic();
		a.redStop();
		a.FlashYellow();
		a.greenGo();
		
		InterfaceExample2 c = new InterfaceExampleTraffic();
		InterfaceExampleTraffic b = new InterfaceExampleTraffic();
		b.walkonsymbol();
		c.Trainsymbol();
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("GreenGo implementation");
		
	}

	public void walkonsymbol()
	{
		System.out.println("walking");
	}
	
	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop implementation");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("FlashYellow implementation");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Trainsymbol implementation");
	}

}
