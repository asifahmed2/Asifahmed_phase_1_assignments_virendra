package phase1assignment;

public class OOPSObject19
{  
    String name; 
    String breed; 
    int age; 
    String color; 
    public OOPSObject19(String name, String breed, int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and "+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        OOPSObject19 scott = new OOPSObject19("Mike","papillon", 3, "white"); 
        System.out.println(scott.toString()); 
    } 
}

