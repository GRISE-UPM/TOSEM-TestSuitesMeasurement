package bowling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Test;

import org.junit.Test;

public class US05 {

	@Test
	public void equivalencePartitioning20_US05() {
		
		try{
			Frame frame = new Frame(10,0);
			assertTrue(frame.isStrike());
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test
	public void equivalencePartitioning21_US05() {
		
		try{
			Frame frame = new Frame(7,0);
			assertFalse(frame.isStrike());
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test
	public void equivalencePartitioning22_US05() {
		
		try{
			Frame frame = new Frame(10,1);
			assertFalse(frame.isStrike());
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score frame invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}

	@Test 
	public void equivalencePartitioning45_US05() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(3,6); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(4,5);
			game.addFrame(frame2);
			Frame frame3 = new Frame(10,0);//Strike valido seguido de ordinary frame
			game.addFrame(frame3);
			Frame frame4 = new Frame(2,1);
			game.addFrame(frame4);
			Frame frame5 = new Frame(6,3); 
			game.addFrame(frame5);
			Frame frame6 = new Frame(5,0);
			game.addFrame(frame6);
			Frame frame7 = new Frame(1,8);
			game.addFrame(frame7);
			Frame frame8 = new Frame(1,6);
			game.addFrame(frame8);
			Frame frame9 = new Frame(0,0); 
			game.addFrame(frame9);
			Frame frame10 = new Frame(2,2);
			game.addFrame(frame10);
			assertEquals(68, game.score());
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning46_US05() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame (2,5); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(10,0);// Strike valido seguido de frame invalido tal que score de strike >10 y <20
			game.addFrame(frame2);
			Frame frame3 = new Frame(-5,7);
			game.addFrame(frame3);
			Frame frame4 = new Frame(1,8);
			game.addFrame(frame4);
			Frame frame5 = new Frame(7,2); 
			game.addFrame(frame5);
			Frame frame6 = new Frame(5,4);
			game.addFrame(frame6);
			Frame frame7 = new Frame(4,4);
			game.addFrame(frame7);
			Frame frame8 = new Frame(1,3);
			game.addFrame(frame8);
			Frame frame9 = new Frame(4,0); 
			game.addFrame(frame9);
			Frame frame10 = new Frame(8,1);
			game.addFrame(frame10);
			//assertNotEquals(73, game.score());
			game.score();
			fail("Juego invalido y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning47_US05() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame (0,0); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(3,6);
			game.addFrame(frame2);
			Frame frame3 = new Frame(2,2);
			game.addFrame(frame3);
			Frame frame4 = new Frame(2,7);
			game.addFrame(frame4);
			Frame frame5 = new Frame(3,2); 
			game.addFrame(frame5);
			Frame frame6 = new Frame(10,0);// Strike valido seguido de frame invalido tal que score de strike >20
			game.addFrame(frame6);
			Frame frame7 = new Frame(7,5);
			game.addFrame(frame7);
			Frame frame8 = new Frame(1,8);
			game.addFrame(frame8);
			Frame frame9 = new Frame(4,4); 
			game.addFrame(frame9);
			Frame frame10 = new Frame(1,3);
			game.addFrame(frame10);
			//assertNotEquals(82, game.score());
			game.score();
			fail("Juego invalido y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning48_US05() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame (10,0); // Strike valido seguido de frame invalido tal que score de strike <10
			game.addFrame(frame1);
			Frame frame2 = new Frame(4,-5);
			game.addFrame(frame2);
			Frame frame3 = new Frame(0,9);
			game.addFrame(frame3);
			Frame frame4 = new Frame(2,7);
			game.addFrame(frame4);
			Frame frame5 = new Frame(8,1); 
			game.addFrame(frame5);
			Frame frame6 = new Frame(2,3);
			game.addFrame(frame6);
			Frame frame7 = new Frame(6,2);
			game.addFrame(frame7);
			Frame frame8 = new Frame(5,4);
			game.addFrame(frame8);
			Frame frame9 = new Frame(4,0); 
			game.addFrame(frame9);
			Frame frame10 = new Frame(3,5);
			game.addFrame(frame10);
			//assertNotEquals(69, game.score());
			game.score();
			fail("Juego invalido y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}

}
