package Abstraction;

public class Single_level_class1 extends Single_level_abstract
{

	
	@Override
	public void m1()
	{
		System.out.println("m1 is an abstract methodand implemented in sigle level");
		
	}

	@Override
	public void m2() 
	{
		System.out.println("m2 is an abstract methodand implemented in sigle level");
		
	}
	public static void main(String[] args) {
		Single_level_class1 slc = new Single_level_class1();
		slc.m1();
		slc.m2();

	}


}
