package Constructors;

public class C_01_Constructor {

	
	public C_01_Constructor()
	{
		
		System.out.println("This is constructor");
	}
	
	public void method()
	{
		System.out.println("This is method");
	}
	
	
	public static void main(String[] args) {
		
		C_01_Constructor obj=new C_01_Constructor();
		
		obj.method();

	}

}
