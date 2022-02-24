
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// string declare: string literal
		//S1 and S2 will point to the same location as is contains same text
		String s1 = "sonali" ;
		String s2 = "sonali";
		
		//String declaration using new keyword
		// Here St2 and St2 will not pint to same location as we have explicitely used new keyword.
		//it will create new memory space for both of the objects
		String st = new String("Selenium");
		String st1 = new String("Selenium");
		
		//As we know String is object , so lets perform opeations on string by accessing Sting class's method 
		//using sting oject; Split
		
		String s = "Rahul Shetty Academy";
		//using space as delimeter
		//String [] Splittedstring = s.split(" ");
		
		//using "Shetty as delimeter"
		String [] Splittedstring = s.split("Shetty");
		
		//TRIM EXTRA LEFT AND RIGHT WHITE SPACE
		Splittedstring[1].trim();
		
		//print all the characters
		//for(int i=0;i<s.length();i++)
		//{
			//System.out.println(s.charAt(i));
		//}
		
		//print the string in reverse order
		for (int i= s.length()-1; i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
		
		
		//System.out.println(Splittedstring[0]);
		//System.out.println(Splittedstring[1]);
		//System.out.println(Splittedstring[2]);
		
					
		

	}

}
