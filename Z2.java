package phase1assignment;

class N {
	
	protected long protectedLongMethod()
	{
		long var4=125556555;
		return var4;
	}
	
	public int publicIntMethod()
	{
		int var5=455;
		return var5;
	}
	
	double defaultDoubleMethod()
	{
		double var6=562.32;
		return var6;
	}
}
class P {
	
	public void callingMethod()
	{
		M m=new M();
		long defaultLongValue =m.defaultLongMethod();
		float protectedFloatValue=m.protectedFloatMethod();
		N n=new N();
		double defaultDoubleValue =n.defaultDoubleMethod();
		long protectedLongValue=n.protectedLongMethod();
		
		System.out.println("M class variables are "+defaultLongValue+" and "+protectedFloatValue);
		System.out.println("N class variables are "+defaultDoubleValue+" and "+protectedLongValue);
	}

}
class X {
	private int varx1=10;
	long varX2=1523300;
	protected float varX3=1.5f;
	public char varX4= 'x';

}
class Y {
	
	public void methodY() {
		M m=new M();
		long defaultLongValue =m.defaultLongMethod();
		float protectedFloatValue=m.protectedFloatMethod();
		N n=new N();
		double defaultDoubleValue=n.defaultDoubleMethod();
		float protectedLongValue=n.protectedLongMethod();
		System.out.println("M class variables are "+defaultLongValue+ "and "+protectedFloatValue);
		System.out.println("N class Variables are "+defaultDoubleValue+ " and "+protectedLongValue);
		X x=new X();
		System.out.println("class X variables are "+x.varX2+" and "+x.varX3+" and "+x.varX4);
		
	}

}
public class Z2 {
	public static void main(String[] args) {
		M m= new M();
		long defaultLongValue =m.defaultLongMethod();
		float protectedFloatValue=m.protectedFloatMethod();
		N n=new N();
		double defaultDoubleValue=n.defaultDoubleMethod();
		long protectedLongValue=n.protectedLongMethod();
		
		System.out.println("From class Z");
		System.out.println("M class variables are "+defaultLongValue+" and "+protectedFloatValue);
		System.out.println("N class variables are "+defaultDoubleValue+" and "+protectedLongValue);
		
		P p=new P();
		
		System.out.println("calling Method p");
		p.callingMethod();
		System.out.println("calling Method y");
		Y y=new Y();
		y.methodY();
		
		System.out.println("calling Method X");
		X x=new X();
		System.out.println("X class Variables "+x.varX2+" and "+x.varX3+" and "+x.varX4);
		
	}

}
class M 
{
	private int privateIntMethod() 
	{
		int var1= 10;
		return var1;
	}
	
	long defaultLongMethod() 
	{
		long var2=123556522;
		return var2;
	}
	
	protected float protectedFloatMethod() 
	{
		float var3 =5.6f;
		return var3;
	}
}

