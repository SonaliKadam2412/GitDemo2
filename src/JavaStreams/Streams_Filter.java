package JavaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streams_Filter {

	public static void main(String[] args) {
		
		//Normanl way
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("Don");
		names.add("Johnathan");
		names.add("Andy");
		names.add("Anne");
		
		/*int count=0;
		for(int i=0;i<names.size();i++)
		{
			String Actual= names.get(i);
			if (Actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count); */
		
		//Using Stream
		//There is not life for intermediate opr.(filter()) w/o terminal opr (count())
		//terminal opr will execute only if intermediate opr retruns true
		//how to use filter in stream API
		long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		//we can create steam direct 
		long d= Stream.of("Abhishek","Don","John","Andy","Anne","Ramanand").filter(s->s.startsWith("A")).count();
		//not working in below way
		/*{
			s.startsWith("D");
			return true;
		}).count();*/
		System.out.println(d);
		
		//few more examples of different terminal operations
		//print all the name of arraylist (for which lenthe >4)
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//will print only 1 result
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

	}

}
