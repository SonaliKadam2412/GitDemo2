package JavaStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Collect {

	public static void main(String[] args) {
		// Stream collecte:takelist-->convert to stream-->perform opr.-->convert back to list
		//-->send further to  perorm more opr.
		List<String> List = Stream.of("Abhishek","Don","Johna","Andy","Anna","Ramanand").filter(s->s.endsWith("a"))
		.map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(List.get(0));
		
		java.util.List<Integer> values = Arrays.asList(1,2,3,4,5);
		//print uniue numer from this array
		//values.stream().distinct().forEach(s->System.out.println(s));
		
		//sort the array and print 3rd index
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));

	}

}
