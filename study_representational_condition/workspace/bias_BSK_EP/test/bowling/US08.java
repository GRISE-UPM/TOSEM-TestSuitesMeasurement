package bowling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Test;

public class US08 {

	@Test 
	public void equivalencePartitioning53_US08() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(10,0); //Strikes validos consecutivos seguidos de ordinary frame valido
			game.addFrame(frame1);
			Frame frame2 = new Frame(10,0);
			game.addFrame(frame2);
			Frame frame3 = new Frame(1,3);
			game.addFrame(frame3);
			Frame frame4 = new Frame(1,1);
			game.addFrame(frame4);
			Frame frame5 = new Frame(6,2);
			game.addFrame(frame5);
			Frame frame6 = new Frame(1,8);
			game.addFrame(frame6);
			Frame frame7 = new Frame(2,5);
			game.addFrame(frame7);
			Frame frame8 = new Frame(7,2);
			game.addFrame(frame8);
			Frame frame9 = new Frame(0,9);
			game.addFrame(frame9);
			Frame frame10 = new Frame(2,7);
			game.addFrame(frame10);
			assertEquals(92, game.score());
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test 
	public void equivalencePartitioning54_US08() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame (5,3); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(4,4); 
			game.addFrame(frame2);
			Frame frame3 = new Frame(1,1);
			game.addFrame(frame3);
			Frame frame4 = new Frame(10,0);//Strikes validos consecutivos seguido de frame INVALIDO tal que score strike1>30
			game.addFrame(frame4);
			Frame frame5 = new Frame(10,0); 
			game.addFrame(frame5);
			Frame frame6 = new Frame(13,-7);
			game.addFrame(frame6);
			Frame frame7 = new Frame(1,8);
			game.addFrame(frame7);
			Frame frame8 = new Frame(2,5);
			game.addFrame(frame8);
			Frame frame9 = new Frame(7,2); 
			game.addFrame(frame9);
			Frame frame10 = new Frame(4,0);
			game.addFrame(frame10);
			//assertNotEquals(102, game.score());
			game.score();
			fail("Juego invalido y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning55_US08() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame (6,2); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(1,8); 
			game.addFrame(frame2);
			Frame frame3 = new Frame(2,5);
			game.addFrame(frame3);
			Frame frame4 = new Frame(7,2);
			game.addFrame(frame4);
			Frame frame5 = new Frame(1,1); 
			game.addFrame(frame5);
			Frame frame6 = new Frame(10,0);//Strikes validos consecutivos seguido de frame INVALIDO tal que score strike1<20
			game.addFrame(frame6);
			Frame frame7 = new Frame(10,0);
			game.addFrame(frame7);
			Frame frame8 = new Frame(-5,8);
			game.addFrame(frame8);
			Frame frame9 = new Frame(6,2); 
			game.addFrame(frame9);
			Frame frame10 = new Frame(7,2);
			game.addFrame(frame10);
			//assertNotEquals(83, game.score());
			game.score();
			fail("Juego invalido y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
}
