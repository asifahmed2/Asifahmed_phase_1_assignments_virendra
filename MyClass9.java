package phase1assignment;

public class MyClass9 {
public static void main(String args[]) {
	int a[]= {1,2,3,4,5};//single dimensional
	int b[][]= {{1,2,3},{4,5,6},{7,8,9}};//multi dimensional 
	System.out.println("the single dimensional array  is ");
	for(int i =0;i<a.length;i++) {
		System.out.print(a[i]+ " ");
	}
	System.out.println();
	System.out.println("the multi dimensional array  is ");
	for(int i= 0;i<b.length;i++){
		for(int j=0;j<b[i].length;j++) {
			System.out.print(b[i][j]+" ");
			
		}
		System.out.println();
	}
}
}
