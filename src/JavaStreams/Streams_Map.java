package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

import com.google.common.collect.Streams;

public class Streams_Map {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Sonali");
		name.add("Ksdam");
		
		//1.print the names which have last letter as A with uppercase(need covert/map to uppercases)
		//map() method cn be used for this manipulation
		Stream.of("Abhishek","Don","Johna","Andy","Anna","Ramanand").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//create arrey and convert it to arrylist
		List<String> names1 = Arrays.asList("Azhishek","Don","Johna","Adam","Anna","Ramanand");
		//2.print the names which has first letter as a with UPPERCASE and sorted
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//3.merging two different lists
		Stream<String> newstream =Streams.concat(name.stream(),names1.stream());
		//newstream.sorted().forEach(s->System.out.println(s));
		
		//4.check whether particular element is  present ot not in the list(Anymatch()-return boolean)
		boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}

}
