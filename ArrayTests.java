import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 6, 7, 8 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 8, 7, 6 }, input1);
	}
  
 
  @Test
  public void testReversed() {
    int[] input1 = { 6, 7, 8 };
    assertArrayEquals(new int[]{ 8, 7, 6 }, ArrayExamples.reversed(input1));
  }

  /* 
  @Test
  public void averageWithoutLowest(){
    double[] input1 = { 3, 15, 18, 3 };

  }
  */
  
}
