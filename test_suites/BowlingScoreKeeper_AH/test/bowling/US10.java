package bowling;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import bowling.BowlingException;
import bowling.BowlingGame;
import bowling.Frame;
import bowling.InvalidInput;



public class US10 {

	// Commented by Oscar
	// This test is wrong according to the specification because the bonus is not a frame
	// If we admit there are 2 possible ways to set the bonus, the following code
	// will be preferable
	// FIXED (bonus throws can be set using either addFrame and setBonus)
	@Test
	public void testLastSpareForm() throws InvalidInput, BowlingException   {
		BowlingGame game1 = new BowlingGame();
		BowlingGame game2 = new BowlingGame();
		
		game1.addFrame(new Frame(1, 5)); //1
		game1.addFrame(new Frame(2, 5)); //2
		game1.addFrame(new Frame(1, 1)); //3
		game1.addFrame(new Frame(4, 2)); //4
		game1.addFrame(new Frame(8, 0)); //5
		game1.addFrame(new Frame(2, 3)); //6
		game1.addFrame(new Frame(1, 3)); //7
		game1.addFrame(new Frame(1, 6)); //8
		game1.addFrame(new Frame(2, 0)); //9
		game1.addFrame(new Frame(5,5));
		game1.addFrame(new Frame(4,0));
		
		game2.addFrame(new Frame(1, 5)); //1
		game2.addFrame(new Frame(2, 5)); //2
		game2.addFrame(new Frame(1, 1)); //3
		game2.addFrame(new Frame(4, 2)); //4
		game2.addFrame(new Frame(8, 0)); //5
		game2.addFrame(new Frame(2, 3)); //6
		game2.addFrame(new Frame(1, 3)); //7
		game2.addFrame(new Frame(1, 6)); //8
		game2.addFrame(new Frame(2, 0)); //9
		game2.addFrame(new Frame(5,5));
		
		game2.setBonus(4,0);
		
		if(game1.score() == 61 || game2.score() == 61)
			assertTrue(true);
		else
			fail();
	}
	
	// Commented by Oscar
	// We are not enforcing throwing any exception on invalid input.
	// Moreover, this tests is not testing than a exception is raised
	@Ignore
	@Test
	public void testLastSpareBonusForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1, 5)); //1
		game.addFrame(new Frame(2, 5)); //2
		game.addFrame(new Frame(1, 1)); //3
		game.addFrame(new Frame(4, 2)); //4
		game.addFrame(new Frame(8, 0)); //5
		game.addFrame(new Frame(2, 3)); //6
		game.addFrame(new Frame(1, 3)); //7
		game.addFrame(new Frame(1, 6)); //8
		game.addFrame(new Frame(2, 0)); //9
		game.addFrame(new Frame(5,5));
		game.addFrame(new Frame(4,4));
		//game.setBonusFrame(new Frame(4,4));
		
		

		assertEquals(61, game.score());
	}
	
	// Commented by Oscar
	// This test does the same than testLastSpareBonusForm or testLastSpareBonusContent, 
	// depending on the interpretation
	@Ignore
	@Test
	public void testLastSpareZeroBonus() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1, 5)); //1
		game.addFrame(new Frame(2, 5)); //2
		game.addFrame(new Frame(1, 1)); //3
		game.addFrame(new Frame(4, 2)); //4
		game.addFrame(new Frame(8, 0)); //5
		game.addFrame(new Frame(2, 3)); //6
		game.addFrame(new Frame(1, 3)); //7
		game.addFrame(new Frame(1, 6)); //8
		game.addFrame(new Frame(2, 0)); //9
		game.addFrame(new Frame(5,5));
		game.addFrame(new Frame(0,0));

		//game.setBonusFrame(new Frame(0,0));

	
		assertEquals(57, game.score());
	}
	
	// Commented by Oscar
	// This test is wrong according to the specification because the bonus is not a frame
	// If we admit there are 2 possible ways to set the bonus, the following code
	// will be preferable
	// FIXED (bonus throws can be set using either addFrame and setBonus)
	@Test
	public void testLastSpareZeroBonusContent() throws InvalidInput, BowlingException   {
		BowlingGame game1 = new BowlingGame();
		BowlingGame game2 = new BowlingGame();
		
		game1.addFrame(new Frame(1, 5)); //1
		game1.addFrame(new Frame(2, 5)); //2
		game1.addFrame(new Frame(1, 1)); //3
		game1.addFrame(new Frame(4, 2)); //4
		game1.addFrame(new Frame(8, 0)); //5
		game1.addFrame(new Frame(2, 3)); //6
		game1.addFrame(new Frame(1, 3)); //7
		game1.addFrame(new Frame(1, 6)); //8
		game1.addFrame(new Frame(2, 0)); //9
		game1.addFrame( new Frame(4,6));
		game1.addFrame(new Frame(0,0));
		
		game2.addFrame(new Frame(1, 5)); //1
		game2.addFrame(new Frame(2, 5)); //2
		game2.addFrame(new Frame(1, 1)); //3
		game2.addFrame(new Frame(4, 2)); //4
		game2.addFrame(new Frame(8, 0)); //5
		game2.addFrame(new Frame(2, 3)); //6
		game2.addFrame(new Frame(1, 3)); //7
		game2.addFrame(new Frame(1, 6)); //8
		game2.addFrame(new Frame(2, 0)); //9
		game2.addFrame( new Frame(4,6));

		game2.setBonus(0,0);

		if(game1.score() == 57 || game2.score() == 57)
			assertTrue(true);
		else
			fail();
	}
	
	// Commented by Oscar
	// We are not enforcing throwing any exception on invalid input.
	// Moreover, this tests is not testing than a exception is raised
	@Ignore
	@Test
	public void testLastSpareZeroBonusForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1, 5)); //1
		game.addFrame(new Frame(2, 5)); //2
		game.addFrame(new Frame(1, 1)); //3
		game.addFrame(new Frame(4, 2)); //4
		game.addFrame(new Frame(8, 0)); //5
		game.addFrame(new Frame(2, 3)); //6
		game.addFrame(new Frame(1, 3)); //7
		game.addFrame(new Frame(1, 6)); //8
		game.addFrame(new Frame(2, 0)); //9
		game.addFrame( new Frame(3,7));
		game.addFrame(new Frame(0,0));

		//game.setBonusFrame(new Frame(0,0));


		assertEquals(57, game.score());
	}

}
