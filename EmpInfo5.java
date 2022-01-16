package phase1assignment;

public class EmpInfo5 {
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

class constructorDemo {

public static void main(String[] args) {

	EmpInfo5 emp1=new EmpInfo5();
	EmpInfo5 emp2=new EmpInfo5();

	emp1.display();
	emp2.display();
	}
}

//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

class paramConstrDemo{
public static void main(String[] args) {

	Std std1=new Std(2,"Alex");
	Std std2=new Std(10,"Annie");
	std1.display();
	std2.display();
		}

}
