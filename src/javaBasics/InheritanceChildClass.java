package javaBasics;

public class InheritanceChildClass extends InheritanceParentclass {
	
	public void Engine ()
	{
		System.out.println("new Engine");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceChildClass cd = new InheritanceChildClass();
		cd.colour();
		cd.Brake();
		cd.Audiosystem();
	}

}
