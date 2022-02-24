import java.util.ArrayList;

/**
 * 
 */

/**
 * <h2> Tutorial10c Class</h2>
 * <p>
 * Process for Displaying Tutorial10c
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial10c {
/**
 * <h2> main</h2>
 * <p>
 * To convert an ArrayList to an array
 * </p>
 *
 * @param args
 * @return void
 */
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Python");
	list.add("Java");
	list.add("PHP");
	list.add("Perl");
	list.add("C#");
	System.out.println(list);
	
	String[] my_array=new String[list.size()];
	list.toArray(my_array);
	for(String string : my_array) {
		System.out.println(string);
	}
	
}
}
