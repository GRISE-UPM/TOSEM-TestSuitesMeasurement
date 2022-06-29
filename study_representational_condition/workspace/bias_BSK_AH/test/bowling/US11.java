package bowling;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class US11 {

	// Commented by Oscar
	// We are not enforcing throwing any exception on invalid input.
	// Moreover, this tests is not testing than a exception is raised
	// Wrong --> score is 65 not 75
	// FIXED (set score to 65 instead of 75)
	@Ignore
	@Test
	public void testLastStrikeForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1,5));
		game.addFrame(new Frame(2, 5)); //2
		game.addFrame(new Frame(1, 1)); //3
		game.addFrame(new Frame(4, 2)); //4
		game.addFrame(new Frame(8, 0)); //5
		game.addFrame(new Frame(2, 3)); //6
		game.addFrame(new Frame(1, 3)); //7
		game.addFrame(new Frame(1, 6)); //8
		game.addFrame(new Frame(2, 0)); //9
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(4,4));

		//game.setBonusFrame(new Frame(4,4));
	
		


		assertEquals(65,  game.score());
	}
	
	// Commented by Oscar
	// This test is wrong according to the specification because the bonus is not a frame
	// If we admit there are 2 possible ways to set the bonus, the following code
	// will be preferable
	// Additionally, the final score should be 65 not 66
	// FIXED (bonus throws can be set using either addFrame and setBonus, and the final score should be 65 instead of 66)
	@Test
	public void testLastStrikeContent() throws InvalidInput, BowlingException   {
		BowlingGame game1 = new BowlingGame();
		BowlingGame game2 = new BowlingGame();
		
		game1.addFrame(new Frame(1,5));
		game1.addFrame(new Frame(2, 5)); //2
		game1.addFrame(new Frame(1, 1)); //3
		game1.addFrame(new Frame(4, 2)); //4
		game1.addFrame(new Frame(8, 0)); //5
		game1.addFrame(new Frame(2, 3)); //6
		game1.addFrame(new Frame(1, 3)); //7
		game1.addFrame(new Frame(1, 6)); //8
		game1.addFrame(new Frame(2, 0)); //9
		game1.addFrame( new Frame(10,0));
		game1.addFrame(new Frame(4,4));

		game2.addFrame(new Frame(1,5));
		game2.addFrame(new Frame(2, 5)); //2
		game2.addFrame(new Frame(1, 1)); //3
		game2.addFrame(new Frame(4, 2)); //4
		game2.addFrame(new Frame(8, 0)); //5
		game2.addFrame(new Frame(2, 3)); //6
		game2.addFrame(new Frame(1, 3)); //7
		game2.addFrame(new Frame(1, 6)); //8
		game2.addFrame(new Frame(2, 0)); //9
		game2.addFrame( new Frame(10,0));

		game2.setBonus(4, 4);
			
		if(game1.score() == 65 || game2.score() == 65)
			assertTrue(true);
		else
			fail();
	}

	// Commented by Oscar
	// This test is wrong according to the specification because the bonus is not a frame
	// If we admit there are 2 possible ways to set the bonus, the following code
	// will be preferable
	// FIXED (bonus throws can be set using either addFrame and setBonus)
	@Test
	public void testLastStrikeZeroBonus() throws InvalidInput, BowlingException   {
		BowlingGame game1 = new BowlingGame();
		BowlingGame game2 = new BowlingGame();
		
		game1.addFrame(new Frame(1,5));
		game1.addFrame(new Frame(2, 5)); //2
		game1.addFrame(new Frame(1, 1)); //3
		game1.addFrame(new Frame(4, 2)); //4
		game1.addFrame(new Frame(8, 0)); //5
		game1.addFrame(new Frame(2, 3)); //6
		game1.addFrame(new Frame(1, 3)); //7
		game1.addFrame(new Frame(1, 6)); //8
		game1.addFrame(new Frame(2, 0)); //9
		game1.addFrame( new Frame(10,0));
		game1.addFrame(new Frame(0,0));

		game2.addFrame(new Frame(1,5));
		game2.addFrame(new Frame(2, 5)); //2
		game2.addFrame(new Frame(1, 1)); //3
		game2.addFrame(new Frame(4, 2)); //4
		game2.addFrame(new Frame(8, 0)); //5
		game2.addFrame(new Frame(2, 3)); //6
		game2.addFrame(new Frame(1, 3)); //7
		game2.addFrame(new Frame(1, 6)); //8
		game2.addFrame(new Frame(2, 0)); //9
		game2.addFrame( new Frame(10,0));
		
		game2.setBonus(0,0);
		
		if(game1.score() == 57 || game2.score() == 57)
			assertTrue(true);
		else
			fail();
	}
	
	// Commented by Oscar
	// Missing @Test here...I add the @Test
	// We are not enforcing throwing any exception on invalid input.
	// Moreover, this tests is not testing than a exception is raised
	// Wrong --> score is 57 not 66
	// FIXED (set score to 57 instead of 66)
	@Ignore
	@Test
	public void testLastStrikeZeroBonusForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1,5));
		game.addFrame(new Frame(2, 5)); //2
		game.addFrame(new Frame(1, 1)); //3
		game.addFrame(new Frame(4, 2)); //4
		game.addFrame(new Frame(8, 0)); //5
		game.addFrame(new Frame(2, 3)); //6
		game.addFrame(new Frame(1, 3)); //7
		game.addFrame(new Frame(1, 6)); //8
		game.addFrame(new Frame(2, 0)); //9
		game.addFrame( new Frame(10,0));
		game.addFrame(new Frame(0,0));

		//game.setBonusFrame(new Frame(0,0));
		
		
		assertEquals(57, game.score());
	}
}
