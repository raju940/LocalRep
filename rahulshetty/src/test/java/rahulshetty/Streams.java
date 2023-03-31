package rahulshetty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Streams {

	@Test
	public void main() {
		// TODO Auto-generated method stub

//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Raju");
//		names.add("Somarapu");
//		names.add("Rahul");
//		names.add("Ram");
//		String output = null;
//		for (int i = 0; i < names.size(); i++) {
//			String actual = names.get(i);
//			if (actual.startsWith("R")) {
//				output = actual;
//				System.out.println(output);
//			}
//		}
//		System.out.println(output.length());
	}
	@Test
	public void Raju() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Raju");
		names.add("Somarapu");
		names.add("Rahul");
		names.add("Ram");
		long count = names.stream().filter(s -> s.startsWith("R")).count();
		System.out.println(count);

		Stream.of("Raju", "Somarapu", "Rahul", "Ram").filter(s -> s.startsWith("R"))
				.forEach(s -> System.out.println(s));

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
	}
	@Test
	public void Barre() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Hello");
		name.add("Somarapu");
		name.add("kumar");
		name.add("Abhi");
		// Print names which have last letter "a" in UPPERCASE
		// Stream.of("Raja", "Mahesha", "Rahul", "Ram").filter(s ->
		// s.endsWith("a")).map(s -> s.toUpperCase())
		// .forEach(s -> System.out.println(s));
		// Print names which has first letter "R" and in sorted
		List<String> names = Arrays.asList("Raja", "Mahesha", "Rahul", "Ram");
		// names.stream().filter(s -> s.startsWith("R")).sorted().map(s ->
		// s.toUpperCase())
		// .forEach(s -> System.out.println(s));

		Stream<String> newStream = Stream.concat(name.stream(), names.stream());
 		// newStream.sorted().forEach(s->System.out.println(s));

		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Raja"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}
    @Test
	public void StreamCollect(){
    	List<String> lst = Arrays.asList("Raja", "Mahesha", "Rahul", "Ram");
		lst.stream().filter(s -> s.startsWith("R")).sorted().map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(lst.get(3));
		
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,5,2);
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
//		values.stream().distinct().sorted().collect(Collectors.toList());
//		System.out.println(values.get(3));
    }
	
}
