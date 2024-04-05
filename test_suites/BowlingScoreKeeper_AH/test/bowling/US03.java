package bowling;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import bowling.BowlingGame;
import bowling.Frame;
import bowling.InvalidInput;

public class US03 {

	@Test
	public void testGameWithFramesIsCreated() throws InvalidInput{
		BowlingGame game = new BowlingGame();
		for (int i = 1; i < 11; i++) {
			game.addFrame(new Frame(i,i));
		}
		
		assertNotNull(game);
	}
	
	@Test
	public void testEmptyGameIsCreated(){
		BowlingGame game = new BowlingGame();
		assertNotNull(game);
	}
	
	// Commented by Oscar
	// Class name is irrelevant in the context of our experiment
	@Ignore
	@Test 
	public void testGameObjectIsCreated(){
		BowlingGame game = new BowlingGame();
		assertEquals("BowlingGame", game.getClass().getSimpleName());
	
	}
}
