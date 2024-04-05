package bowling;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Test;

public class US12 {

	@Test 
	public void equivalencePartitioning65_US12() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(5,3); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(4,4);
			game.addFrame(frame2);
			Frame frame3 = new Frame(1,1);
			game.addFrame(frame3);
			Frame frame4 = new Frame(2,6);
			game.addFrame(frame4);
			Frame frame5 = new Frame(6,2);
			game.addFrame(frame5);
			Frame frame6 = new Frame(1,8);
			game.addFrame(frame6);
			Frame frame7 = new Frame(2,5);
			game.addFrame(frame7);
			Frame frame8 = new Frame(6,2);
			game.addFrame(frame8);
			Frame frame9 = new Frame(5,4);
			game.addFrame(frame9);
			Frame frame10 = new Frame(8,2); // Last frame spare valido con 1 bonus throw strike
			game.addFrame(frame10);
			game.setBonus(10,0);
			assertEquals(87, game.score());
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
}
