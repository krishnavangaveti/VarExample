import java.util.*;

public class VariableEample {
	public String myVar = "instance variable";

	public void myMethod() {
		String myVar = "local myVar";
		System.out.println("my local var is :" + myVar);
	}

	public static void main(String args[]) {
		VariableEample obj1 = new VariableEample();
		System.out.println("class instance variable :" + obj1.myVar);

		obj1.myMethod();

		char ch = 'P';
		int asciiCode = ch;
		// type casting char as int
		int asciiValue = (int) ch;

		System.out.println("ASCII value of " + ch + " is: " + asciiCode);
		System.out.println("ASCII value of " + ch + " is: " + asciiValue);
		
		double base = 10;
	    double height = 15;
	    double trianleArea = (base * height)/2;
	    System.out.println("Triangle area is  : "+trianleArea);
	    int num1 =11;
	    int num2 = 12;
	    int num3 = num1 | num2;
	    int x= 10;
	    int y = 20;
	    System.out.println("bitwise and :"+num3);
	    System.out.println("val of x is : "+ x++);
	    System.out.println("val of x is : "+ --y);
	    System.out.println("val of x is : "+ ++x);
	    System.out.println("val of x is : "+ ++y);       
	  	
	   ArrayList<String> strList = new ArrayList<String>();
	   
	   strList.add("Krishna");
	   strList.add("John");
	   strList.add("Smith");
	   
	   Collections.sort(strList);
      
	   Iterator itr = strList.iterator();
	   System.out.println(strList);
	   while (itr.hasNext())
	   {
		   System.out.println("values of the arrayList :" + itr.next());
	   }
	   
	   for(String name: strList)
		   System.out.println("..... :" + name);
	   
	   for (int i=0; i < strList.size(); i++)
		   System.out.println("Using normal forloop : " + strList.get(i));
	   
	   strList.forEach(a->{
		  System.out.println("Using Lambda " + a);
	   });
	}
	
	
}
