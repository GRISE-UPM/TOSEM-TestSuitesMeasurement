package bowling;

import static org.junit.Assert.*;

import org.junit.Test;


public class US01 {

	@Test
	public void testEmptyFrameIsCreated() {
		Frame f = new Frame();
		assertNotNull(f);
	}

	@Test
	public void testFrameWithScoreIsCreated() throws InvalidInput, BowlingException {
		Frame f = new Frame(1,2);
		assertNotNull(f);
	}
	
	@Test
	public void testFrameIsCreatedWithCorrectName(){
		Frame f  = new Frame();
		assertEquals("Frame", f.getClass().getSimpleName());
	}
}
