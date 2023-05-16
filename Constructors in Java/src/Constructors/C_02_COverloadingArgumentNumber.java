package Constructors;

public class C_02_COverloadingArgumentNumber {
	
	public C_02_COverloadingArgumentNumber(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public C_02_COverloadingArgumentNumber(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	
	public void display()
	{
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
	
		
		C_02_COverloadingArgumentNumber obj=new C_02_COverloadingArgumentNumber(10,20);
		obj.display();
		
		C_02_COverloadingArgumentNumber obj1=new C_02_COverloadingArgumentNumber(10,20,30);
		obj1.display();
		

	}

}
