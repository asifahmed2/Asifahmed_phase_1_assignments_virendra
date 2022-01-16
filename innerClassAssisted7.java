package phase1assignment;

public class innerClassAssisted7 {
 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		innerClassAssisted7 obj=new innerClassAssisted7();
		innerClassAssisted7.Inner in=obj.new Inner();  
		in.hello();  
	}
}


class innerClassAssisted2 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	innerClassAssisted2  ob=new innerClassAssisted2 ();  
	ob.display();  
	}
}


//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


 class innerClassAssisted3 {

	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }


}