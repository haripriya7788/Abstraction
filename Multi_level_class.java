package Abstraction;

public class Multi_level_class extends Multi_level_abstract2
{


	@Override
	public void m3() 
	{
		System.out.println("m3 is an abstract method and implemented in multi_level_class");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 is an abstract method and implemented in multi_level_class");
		
	}

	@Override
	public void m1() {
		System.out.println("m1 is an abstract method and implemented in multi_level_class");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 is an abstract method and implemented in multi_level_class");
		
	}

	public static void main(String[] args) {
		Multi_level_class mc = new Multi_level_class();
		mc.m1();
		mc.m2();
		mc.m3();
		mc.m4();

	}

}
