package bowling;

import static org.junit.Assert.*;

import org.junit.Test;




public class US07 {

	@Test
	public void testSpareAfterStrikeAtTheBeginningForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(2,8));
		game.addFrame(new Frame(1,0));
		game.addFrame(new Frame(4,2));
		game.addFrame(new Frame(8,0));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
	
		assertEquals(70, game.score());
	}
	@Test
	public void testSpareAfterStrikeAtTheBeginningContent() throws InvalidInput, BowlingException  {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(0,10));
		game.addFrame(new Frame(1,2));
		game.addFrame(new Frame(4,2));
		game.addFrame(new Frame(8,0));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(72, game.score());
	}
	@Test
	public void testSpareAfterStrikeInTheMiddleForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(4,5));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(1,9));
		game.addFrame(new Frame(3,7));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(99, game.score());
	}
	@Test
	public void testSpareAfterStrikeInTheMiddleContent() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(3,5));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(1,9));
		game.addFrame(new Frame(2,5));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(92, game.score());
	}
	@Test
	public void testSpareAfterStrikeInTheMiddleZeroBoniForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1,5));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(2,8));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));

		assertEquals(55, game.score());
	}
	@Test
	public void testSpareAfterStrikeInTheMiddleZeroBoniContent() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1,5));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(1,9));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(1,4));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(60, game.score());
	}
	@Test
	public void testSpareAfterStrikeAtTheBeginningZeroBoniContent() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(2,8));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(4,2));
		game.addFrame(new Frame(8,0));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(68, game.score());
	}

	@Test
	public void testDoubleStrikeDoubleSpareForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(0,10));
		game.addFrame(new Frame(2,8));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(91, game.score());
	}
	
	public void testStrikeAfterSpareAtTheBeginningForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(2,8));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(1,0));
		game.addFrame(new Frame(4,2));
		game.addFrame(new Frame(8,0));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(70, game.score());
	}

	public void testStrikeAfterSpareAtTheBeginningContent() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(0,10));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(1,2));
		game.addFrame(new Frame(4,2));
		game.addFrame(new Frame(8,0));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(74, game.score());
	}
	
	public void testStrikeAfterSpareInTheMiddleForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(4,5));
		game.addFrame(new Frame(2,4));
		game.addFrame(new Frame(3,7));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(2,6));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(85, game.score());
	}
	
	public void testStrikeAfterSpareInTheMiddleContent() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(5,1));
		game.addFrame(new Frame(7,2));
		game.addFrame(new Frame(1,7));
		game.addFrame(new Frame(1,9));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(82, game.score());
	}

	public void testStrikeAfterSpareAtTheBeginningZeroBoniContent() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(2,8));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(4,2));
		game.addFrame(new Frame(8,0));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(68, game.score());
	}

	public void testStrikeAfterSpareAtTheBeginningZeroBoniForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1,9));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(4,2));
		game.addFrame(new Frame(8,0));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(68, game.score());
		
	}
	
	public void testDoubleSpareDoubleStrikeForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1,9));
		game.addFrame(new Frame(2,8));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(1,0));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(89, game.score());
	}

	public void testDoubleSpareDoubleStrikeContent() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1,9));
		game.addFrame(new Frame(2,8));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(2,3));
		game.addFrame(new Frame(1,3));
		game.addFrame(new Frame(1,6));
		game.addFrame(new Frame(2,0));
		game.addFrame(new Frame(5,1));
		
		assertEquals(95, game.score());
	}


}
