package Abstraction;

public class Hirarchical_Abstract1 extends Hierachical_class {

	@Override
	public void m1() {
	System.out.println("m1 is an abstract method and implemented in multi_level_class");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 is an abstract method and implemented in multi_level_class");
		
	}
	public static void main(String[] args)
	{
		Hirarchical_Abstract1 hc=new Hirarchical_Abstract1();
		hc.m1();
		hc.m2();
		hierarchical_class2 obj=new hierarchical_class2();
		obj.m1();
		obj.m2();
		

	}

}
class hierarchical_class2 extends Hirarchical_Abstract1
{
	@Override
	public void m1() 
	{
		System.out.println("m1 is an abstract method and implemented in multi_level_class");
	}
	}

