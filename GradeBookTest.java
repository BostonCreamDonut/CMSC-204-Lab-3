import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTest
{
	private GradeBook one;
	private GradeBook two;
@BeforeEach
	void setUp() throws Exception
	{
		one=new GradeBook(5);
		one.addScore(1);
		one.addScore(2);
		one.addScore(3);
		one.addScore(4);
		one.addScore(5);
		two=new GradeBook(5);
		two.addScore(2.3);
		two.addScore(0);
		two.addScore(7);
		two.addScore(8);
		two.addScore(10.1);
	}
	@AfterEach
	void tearDown() throws Exception
	{
		one=null;
		two=null;
	}
	@Test
	void testAddScore()
	{
		assertEquals(one.getScoreSize(),5);
		assertEquals(two.getScoreSize(),5);
	}
	@Test
	void testToString()
	{
		assertTrue(one.toString().equals("1.0 2.0 3.0 4.0 5.0 "));
	}
	@Test
	void testSum()
	{
		assertEquals(one.sum(),15);
		assertEquals(two.sum(),27.4);
	}
	@Test
	void testMinimum()
	{
		assertEquals(one.minimum(),1);
		assertEquals(two.minimum(),0);
	}
	@Test
	void testFinalScore()
	{
		assertEquals(one.finalScore(),14);
		assertEquals(two.finalScore(),27.4);
	}
}
