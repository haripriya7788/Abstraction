package Abstraction;

public abstract  class Multi_level_abstract1 
{
	abstract public void m1();
	abstract public void m2();

}
abstract class Multi_level_abstract2 extends Multi_level_abstract1 
{
	abstract public void m3();
	abstract public void m4();

}
