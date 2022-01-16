package phase1assignment;

public class OOPSPolymorphism19
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        OOPSPolymorphism19 s = new OOPSPolymorphism19(); 
        System.out.println(s.sum(25, 35)); 
        System.out.println(s.sum(05, 15, 25)); 
        System.out.println(s.sum(11.5, 22.5)); 
    } 
}

