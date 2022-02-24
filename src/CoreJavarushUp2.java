import java.util.ArrayList;

public class CoreJavarushUp2 {

	public static void main(String[] args) {
		int[] arr2 = {2,3,4,6,12,24,56,67,8};
		for (int i=0;i<arr2.length;i++)
		{
			if (arr2[i] %2==0)
			{
				System.out.println(arr2[i] + "is multiply of 2");
				break;  //it will exit the loop once it find atleast one value which is multiply by 2
			}
			else
			{
				
				System.out.println(arr2[i] + "is not multiply of 2");
			}
			
		}
		
		//Arreylist
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sonali");
		a.add("Vilas");
		a.add("kadam");
		a.add("selenium");
		a.add("course");
		a.remove(1);
		
	System.out.println(a.get(0));
	System.out.println(a.get(1));
	System.out.println(a.get(1));
	System.out.println(a.get(2));
	System.out.println(a.get(3));
	

	}

}
