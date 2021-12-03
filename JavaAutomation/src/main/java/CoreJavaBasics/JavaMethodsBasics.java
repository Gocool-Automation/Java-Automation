package CoreJavaBasics;

public class JavaMethodsBasics {
	
	public static void main(String[] args) {
		
		JavaMethodsBasics obj1 = new JavaMethodsBasics();
		JavaMethods2 obj2 = new JavaMethods2();
		obj1.getData();
		String result = obj1.getData2();
		System.out.println(result);
		getData3();
		
		obj2.getData();
		
	
	}
	
	public void getData()
	{
		System.out.println("Calling getData method within same class using base class object");
	}
	
	public String getData2()
	{
		System.out.println("Calling getData2 method within same class using class object with return statement");
		return "Call Successful within class";
	}
	
	public static void getData3()
	{
		System.out.println("Calling getData3 method within same class but without class object bcoz it is a Static method");
	}

}
