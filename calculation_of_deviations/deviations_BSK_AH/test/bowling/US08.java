package bowling;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;



public class US08 {

	@Test
	public void testStartWithAMultipleStrikesForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(10,0)); //1
		game.addFrame(new Frame(10,0)); //2
		game.addFrame(new Frame(0,0)); //3
		game.addFrame(new Frame(4,2)); //4
		game.addFrame(new Frame(8,0)); //5
		game.addFrame(new Frame(2,3)); //6
		game.addFrame(new Frame(1,3)); //7
		game.addFrame(new Frame(1,6)); //8
		game.addFrame(new Frame(2,0)); //9
		game.addFrame(new Frame(5,1)); //10
		assertEquals(68	,game.score());
	}
	
	// Commented by Oscar
	// FIXED (the score was 74 instead of the correct 75)
	@Test
	public void testStartWithAMultipleStrikesContent() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(10,0)); //1
		game.addFrame(new Frame(10,0)); //2
		game.addFrame(new Frame(1,2)); //3
		game.addFrame(new Frame(4,2)); //4
		game.addFrame(new Frame(8,0)); //5
		game.addFrame(new Frame(2,3)); //6
		game.addFrame(new Frame(1,3)); //7
		game.addFrame(new Frame(1,6)); //8
		game.addFrame(new Frame(2,0)); //9
		game.addFrame(new Frame(5,1)); //10
		
		assertEquals(75, game.score());
	}
	@Test
	public void testMultipleStrikesInTheMiddleForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(4,5)); //1
		game.addFrame(new Frame(2,4)); //2
		game.addFrame(new Frame(10,0)); //3
		game.addFrame(new Frame(10,0)); //4
		game.addFrame(new Frame(10,0)); //5
		game.addFrame(new Frame(2,3)); //6
		game.addFrame(new Frame(1,3)); //7
		game.addFrame(new Frame(1,6)); //8
		game.addFrame(new Frame(2,0)); //9
		game.addFrame(new Frame(5,1)); //10
	
		assertEquals(106, game.score());
	}
	@Test
	public void testMultipleStrikeInTheMiddleContent() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(5,1)); //1
		game.addFrame(new Frame(7,2)); //2
		game.addFrame(new Frame(10,0)); //3
		game.addFrame(new Frame(10,0)); //4
		game.addFrame(new Frame(10,0)); //5
		game.addFrame(new Frame(2,3)); //6
		game.addFrame(new Frame(1,3)); //7
		game.addFrame(new Frame(1,6)); //8
		game.addFrame(new Frame(2,0)); //9
		game.addFrame(new Frame(5,1)); //10
		assertEquals(106, game.score());
	}
	@Test
	public void testMultipleStrikeInTheMiddleZeroBoniForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1,5)); //1
		game.addFrame(new Frame(1,4)); //2
		game.addFrame(new Frame(10,0)); //3
		game.addFrame(new Frame(10,0)); //4
		game.addFrame(new Frame(10,0)); //5
		game.addFrame(new Frame(0,0)); //6
		game.addFrame(new Frame(1,3)); //7
		game.addFrame(new Frame(1,6)); //8
		game.addFrame(new Frame(2,0)); //9
		game.addFrame(new Frame(5,1)); //10
		
		assertEquals(90, game.score()); //80
	}

	

}
