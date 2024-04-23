import static org.junit.Assert.*;
import java.util.List;

import org.junit.*;

public class ListTests {
	@Test 
	public void filterTest() {
  // Returns a new list that has all the elements of the input list for which
  // the StringChecker returns true, and not the elements that return false, in
  // the same order they appeared in the input list;  
  
        List<String> list = List.of("khang", "cherry", "evan", "alex", "kalan", "kaden");
        List<String> expected = List.of("khang", "kalan", "kaden");
        
        assertEquals(expected, ListExamples.filter(list, new Sc()));

	}

    @Test 
	public void mergeTest() {
  // Takes two sorted list of strings (so "a" appears before "b" and so on),
  // and return a new list that has all the strings in both list in sorted order.
        
	}

}


