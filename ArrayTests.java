import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  //Write more tests in ArrayTests.java to demonstrate that the two methods, reverseInPlace and reversed, have bugs, and identify the bugs.

  @Test
  public void testReverseInPlace2(){
    int[] intArr = {1, 2, 3, 4 };
    ArrayExamples.reverseInPlace(intArr);
    assertArrayEquals(new int[]{4, 3, 2, 1}, intArr);
  }

  @Test
  public void testReversed2(){
    int[] intArr = {5, 3, 0, 0, 5 };
    assertArrayEquals(new int[]{5, 0, 0, 3, 5 }, ArrayExamples.reversed(intArr));
  }
}
