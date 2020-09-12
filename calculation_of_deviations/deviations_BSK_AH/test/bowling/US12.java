package bowling;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Ignore;
import org.junit.Test;



public class US12 {

	// Commented by Oscar
	// We are not enforcing throwing any exception on invalid input.
	// Moreover, this test is not testing than a exception is raised
	@Ignore
	@Test
	public void testBonusIsStrikeFormWhenLastIsSpareForm() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		Frame f1 = new Frame(1,5);
		Frame f2 = new Frame(2,5);
		Frame f3 = new Frame(1,1);
		Frame f4 = new Frame(4,2);
		Frame f5 = new Frame(8,0);
		Frame f6 = new Frame(2,3);
		Frame f7 = new Frame(1,3);
		Frame f8 = new Frame(1,6);
		Frame f9 = new Frame(2,0);
		Frame f10 = new Frame(5,5);
	

		game.addFrame(f1);
		game.addFrame(f2);
		game.addFrame(f3);
		game.addFrame(f4);
		game.addFrame(f5);
		game.addFrame(f6);
		game.addFrame(f7);
		game.addFrame(f8);
		game.addFrame(f9);
	
		game.addFrame(f10);
		game.addFrame(new Frame(10,0));

		//game.setBonusFrame(new Frame(10,0));


		
		assertEquals(67, game.score());
	}
	
	// Commented by Oscar
	// This test is wrong according to the specification because the bonus is not a frame
	// If we admit there are 2 possible ways to set the bonus, the following code
	// will be preferable
	// FIXED (bonus throws can be set using either addFrame and setBonus)
	@Test
	public void testBonusIsStrikeWhenLastIsSpareContent() throws InvalidInput, BowlingException   {
		BowlingGame game1 = new BowlingGame();
		BowlingGame game2 = new BowlingGame();
		
		Frame f1 = new Frame(1,5);
		Frame f2 = new Frame(2,5);
		Frame f3 = new Frame(1,1);
		Frame f4 = new Frame(4,2);
		Frame f5 = new Frame(8,0);
		Frame f6 = new Frame(2,3);
		Frame f7 = new Frame(1,3);
		Frame f8 = new Frame(1,6);
		Frame f9 = new Frame(2,0);
		Frame f10 = new Frame(4,6);
		
		game1.addFrame(f1);
		game1.addFrame(f2);
		game1.addFrame(f3);
		game1.addFrame(f4);
		game1.addFrame(f5);
		game1.addFrame(f6);
		game1.addFrame(f7);
		game1.addFrame(f8);
		game1.addFrame(f9);
		game1.addFrame(new Frame(4,6));
		game1.addFrame(new Frame(10,0));

		game2.addFrame(f1);
		game2.addFrame(f2);
		game2.addFrame(f3);
		game2.addFrame(f4);
		game2.addFrame(f5);
		game2.addFrame(f6);
		game2.addFrame(f7);
		game2.addFrame(f8);
		game2.addFrame(f9);
		game2.addFrame(new Frame(4,6));
		game2.setBonus(10, 0);

		if(game1.score() == 67 || game2.score() == 67)
			assertTrue(true);
		else
			fail();	
	}

	// Commented by Oscar
	// This test IS THE SAME than testBonusIsStrikeWhenLastIsStrikeContent
	// Wrong --> score is 67 not 77
	@Ignore
	@Test
	public void testBonusIsStrikeWhenLastIsStrike() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		
		Frame f1= new Frame(1, 5); //1
		Frame f2= new Frame(2, 5); //2
		Frame f3= new Frame(1, 1); //3
		Frame f4= new Frame(4, 2); //4
		Frame f5= new Frame(8, 0); //5
		Frame f6= new Frame(2, 3); //6
		Frame f7= new Frame(1, 3); //7
		Frame f8= new Frame(1, 6); //8
		Frame f9= new Frame(2, 0); //9
		Frame f10= new Frame(10,0);//,10,0); //10
		game.addFrame(f1);
		game.addFrame(f2);
		game.addFrame(f3);
		game.addFrame(f4);
		game.addFrame(f5);
		game.addFrame(f6);
		game.addFrame(f7);
		game.addFrame(f8);
		game.addFrame(f9);
		
	
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(10,0));

		//game.setBonusFrame(new Frame(10,0));
	
		
	
		assertEquals(67, game.score());
	}
	
	// Commented by Oscar
	// This test is wrong according to the specification because the bonus is not a frame
	// If we admit there are 2 possible ways to set the bonus, the following code
	// will be preferable
	// Wrong --> score is 67 not 77
	// FIXED (bonus throws can be set using either addFrame and setBonus and score is set to 67 instead of 77)
	@Test
	public void testBonusIsStrikeWhenLastIsStrikeContent() throws InvalidInput, BowlingException   {
		
		BowlingGame game1 = new BowlingGame();
		BowlingGame game2 = new BowlingGame();
		
		Frame f1 = new Frame(1, 5); //1
		Frame f2 = new Frame(2, 5); //2
		Frame f3 = new Frame(1, 1); //3
		Frame f4 = new Frame(4, 2); //4
		Frame f5 = new Frame(8, 0); //5
		Frame f6 = new Frame(2, 3); //6
		Frame f7 = new Frame(1, 3); //7
		Frame f8 = new Frame(1, 6); //8
		Frame f9 = new Frame(2, 0); //9
		Frame f10 = new Frame(10,0);//,10,0); //10
		game1.addFrame(f1);
		game1.addFrame(f2);
		game1.addFrame(f3);
		game1.addFrame(f4);
		game1.addFrame(f5);
		game1.addFrame(f6);
		game1.addFrame(f7);
		game1.addFrame(f8);
		game1.addFrame(f9);
		game1.addFrame(new Frame(10,0));
		game1.addFrame(new Frame(10,0));
		
		game2.addFrame(f1);
		game2.addFrame(f2);
		game2.addFrame(f3);
		game2.addFrame(f4);
		game2.addFrame(f5);
		game2.addFrame(f6);
		game2.addFrame(f7);
		game2.addFrame(f8);
		game2.addFrame(f9);
		game2.addFrame(new Frame(10,0));
		game2.setBonus(10, 0);
	
		if(game1.score() == 67 || game2.score() == 67)
			assertTrue(true);
		else
			fail();	
	}
	
	// Commented by Oscar
	// We are not enforcing throwing any exception on invalid input.
	// Moreover, this tests is not testing than a exception is raised
	//
	// However, this is a good test in the sense that checks if the subject's code considers the 11th frame part of the 
	// game or an additional throw. The 1st case is wrong, but the 2nd is correct.
	//
	// The test case could be 
	@Test
	public void testBonusIsStrikeWhenLastIsStrike_PlusAdditionalFrame_WithoutBonusThrows() throws InvalidInput, BowlingException   {
		BowlingGame game = new BowlingGame();
		Frame f1 = new Frame(1, 5); //1
		Frame f2 = new Frame(2, 5); //2
		Frame f3 = new Frame(1, 1); //3
		Frame f4 = new Frame(4, 2); //4
		Frame f5 = new Frame(8, 0); //5
		Frame f6 = new Frame(2, 3); //6
		Frame f7 = new Frame(1, 3); //7
		Frame f8 = new Frame(1, 6); //8
		Frame f9 = new Frame(2, 0); //9
		Frame f10 = new Frame(10,0);//,10,0); //10
		game.addFrame(f1);
		game.addFrame(f2);
		game.addFrame(f3);
		game.addFrame(f4);
		game.addFrame(f5);
		game.addFrame(f6);
		game.addFrame(f7);
		game.addFrame(f8);
		game.addFrame(f9);


		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(10,0));
				
		assertThat(game.score(), anyOf(equalTo(57), equalTo(67))); 
	}
}
