
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		int MyNum = 5;
		String WebSite = "Rahul Shetty Academy";
		char Letter = 'R';
		double  dec = 5.6;		
		boolean MyCard = true;
		
		//System.out.println( MyNum + ": is the value stored in MyNum variable");
		
		//Arrays 1st way of declaring by allocatng memory first
		int[] arr = new int[5];
		arr[0]= 1;
		arr[1]= 2;
		arr[2]= 3;
		arr[3] = 4;
		arr[4] = 4;
		
		//System.out.println(arr[5]);
		//System.out.println("Length of arr:" + arr.length);
		//for(int i = 0;i<arr.length;i++)
		//{
		//	System.out.println(arr[i]);
		//}
		
		 // arryas - direct declaring by assining the values with allocating the memory forst
		//int[] arr2 = {45,67,54,33,45};
		//System.out.println(arr2[4]);
		//for(int i = 0;i<arr2.length;i++)
		//{
		//	System.out.println(arr2[i]);
		//}
		
		//Arrey of string
		
		String[] Namelist= {"xyz","ABC","PQR","HJC"};
		//for(int i=0;i<Namelist.length ;i++)
		//{
			//System.out.println(Namelist[i]);
			
		//}
		//ENHANCED LOOP
		for( String s: Namelist)
		{
			System.out.println(s);
		}

	}

}
