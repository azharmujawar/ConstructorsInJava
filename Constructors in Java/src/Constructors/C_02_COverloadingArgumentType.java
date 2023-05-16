package Constructors;

public class C_02_COverloadingArgumentType {
	
	public C_02_COverloadingArgumentType(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition : "+ c);
	}
	
	public C_02_COverloadingArgumentType(double a,double b)
	{
		double c=a+b;
		System.out.println("Addition : "+ c);
	}

	public void display()
	{
		System.out.println("Constructor is working ok");
	}
	public static void main(String[] args) {
	
		C_02_COverloadingArgumentType obj=new C_02_COverloadingArgumentType(10,20);
		obj.display();
		
		C_02_COverloadingArgumentType obj1=new C_02_COverloadingArgumentType(10.15,20.15);
		obj1.display();
		
		
		

	}

}
