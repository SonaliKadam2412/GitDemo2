
public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo d1 = new MethodsDemo();
		d1.getData();
		MethodsDemo2 d2 =new MethodsDemo2();
		d2.UserData();
		String s1=MethodsDemo.m1();
		System.out.println(s1);
		

	}
	public void getData()
	{
		System.out.println("This getData method");
	}
	
	public static String m1()
	{
		return "This is  Statis method";
		
	}

}
