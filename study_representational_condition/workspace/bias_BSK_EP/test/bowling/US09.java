package bowling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Test;

public class US09 {

	@Test 
	public void equivalencePartitioning38_US09() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(6,2);
			game.addFrame(frame1);
			Frame frame2 = new Frame(1,8);
			game.addFrame(frame2);
			Frame frame3 = new Frame(2,5);
			game.addFrame(frame3);
			Frame frame4 = new Frame(5,5);//Spare valido seguido de Spare valido
			game.addFrame(frame4);
			Frame frame5 = new Frame(9,1);
			game.addFrame(frame5);
			Frame frame6 = new Frame(0,5);
			game.addFrame(frame6);
			Frame frame7 = new Frame(6,3);
			game.addFrame(frame7);
			Frame frame8 = new Frame(0,0);
			game.addFrame(frame8);
			Frame frame9 = new Frame(0,9);
			game.addFrame(frame9);
			Frame frame10 = new Frame(7,2);
			game.addFrame(frame10);
			assertEquals(85, game.score());
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test 
	public void equivalencePartitioning42_US09() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(11,-1);// Spare INVALIDO seguido de spare valido
			game.addFrame(frame1);
			Frame frame2 = new Frame(3,7);
			game.addFrame(frame2);
			Frame frame3 = new Frame(3,6);
			game.addFrame(frame3);
			Frame frame4 = new Frame(7,2);
			game.addFrame(frame4);
			Frame frame5 = new Frame(3,6); 
			game.addFrame(frame5);
			Frame frame6 = new Frame(4,4);
			game.addFrame(frame6);
			Frame frame7 = new Frame(5,3);
			game.addFrame(frame7);
			Frame frame8 = new Frame(3,3);
			game.addFrame(frame8);
			Frame frame9 = new Frame(4,5); 
			game.addFrame(frame9);
			Frame frame10 = new Frame(8,1);
			game.addFrame(frame10);
			//assertNotEquals(93, game.score());
			game.score();
			fail("Juego invalido y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning43_US09() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(0,0); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(3,6);
			game.addFrame(frame2);
			Frame frame3 = new Frame(2,2);
			game.addFrame(frame3);
			Frame frame4 = new Frame(2,7);
			game.addFrame(frame4);
			Frame frame5 = new Frame(6,2); 
			game.addFrame(frame5);
			Frame frame6 = new Frame(1,1);
			game.addFrame(frame6);
			Frame frame7 = new Frame(6,4);// Spare valido seguido de spare INVALIDO tal que score de Spare1 <10
			game.addFrame(frame7);
			Frame frame8 = new Frame(-5,15);
			game.addFrame(frame8);
			Frame frame9 = new Frame(4,0); 
			game.addFrame(frame9);
			Frame frame10 = new Frame(6,1);
			game.addFrame(frame10);
			//assertNotEquals(62, game.score());
			game.score();
			fail("Juego invalido y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning44_US09() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(5,4); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(2,4);
			game.addFrame(frame2);
			Frame frame3 = new Frame(4,3);
			game.addFrame(frame3);
			Frame frame4 = new Frame(9,0);
			game.addFrame(frame4);
			Frame frame5 = new Frame(8,2); // Spare valido seguido de spare INVALIDO tal que score de Spare1 >20
			game.addFrame(frame5);
			Frame frame6 = new Frame(17,-7);
			game.addFrame(frame6);
			Frame frame7 = new Frame(3,3);
			game.addFrame(frame7);
			Frame frame8 = new Frame(0,0);
			game.addFrame(frame8);
			Frame frame9 = new Frame(2,6); 
			game.addFrame(frame9);
			Frame frame10 = new Frame(1,1);
			game.addFrame(frame10);
			//assertNotEquals(87, game.score());
			game.score();
			fail("Juego invalido y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
}
