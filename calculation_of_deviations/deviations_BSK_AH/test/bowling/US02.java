package bowling;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class US02 {

	@Test
	public void testFrameScore() throws InvalidInput  {
		Frame f = new Frame(2,4);
		assertEquals(6, f.score());
		
		f = new Frame(0,0);
		assertEquals(0, f.score());
	}
	@Test
	public void testAllPinsFrameScore() throws InvalidInput {
		Frame f = new Frame(10,0);
		assertEquals(10, f.score());
	}
	
	// Commented by Oscar
	// Exceptions are not taught neither enforced in the experiment
	@Ignore
	@Test
	public void testExceptionMoreThan10PinsPerFrame() throws InvalidInput {
		Frame f = new Frame(12,12);
		f.score();
	}
}
