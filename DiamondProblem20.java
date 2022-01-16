package phase1assignment;

interface Drawable{  
	int salary = 100;
	void draw();  //by default abstarct method() // public abstract void draw();		
	void show();
}  

interface IShape{
	int salary = 200;
	void shape();  //by default abstarct method()  // public abstract void shape();	
	void show();
}

interface Demo extends IShape{	
}
	
	public class DiamondProblem20 implements IShape, Drawable{
		
		int salary = 900;
		
		public void show(){
			System.out.println("inside show()");
		}

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("inside draw");
		}

		@Override
		public void shape() {
			// TODO Auto-generated method stub
			System.out.println("inside shape");	
		}
		
		public static void main(String args[]){
			DiamondProblem20 obj = new DiamondProblem20();
			obj.shape();
			obj.show();
			obj.draw();
			
			IShape d = new DiamondProblem20();
			System.out.println(d.salary);
			
			System.out.println("salary  "+ obj.salary);		
		}
	}

