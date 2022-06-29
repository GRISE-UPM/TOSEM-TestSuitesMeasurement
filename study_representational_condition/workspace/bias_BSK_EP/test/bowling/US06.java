package bowling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Test;

import org.junit.Test;

public class US06 {

	@Test
	public void equivalencePartitioning17_US06() {
		
		try{
			Frame frame = new Frame(0,10);
			assertTrue(frame.isSpare());
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test
	public void equivalencePartitioning18_US06() {
		
		try{
			Frame frame = new Frame(9,0);
			assertFalse(frame.isSpare());
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test
	public void equivalencePartitioning19_US06() {
		
		try{
			Frame frame = new Frame(20,-10);
			assertFalse(frame.isSpare());
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada frame invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
		
	}

	@Test 
	public void equivalencePartitioning37_US06() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(3,3);
			game.addFrame(frame1);
			Frame frame2 = new Frame(0,0);
			game.addFrame(frame2);
			Frame frame3 = new Frame(0,9);
			game.addFrame(frame3);
			Frame frame4 = new Frame(7,2);
			game.addFrame(frame4);
			Frame frame5 = new Frame(9,0);
			game.addFrame(frame5);
			Frame frame6 = new Frame(5,5);//Spare valido seguido de ordinary frame valido
			game.addFrame(frame6);
			Frame frame7 = new Frame(6,2);
			game.addFrame(frame7);
			Frame frame8 = new Frame(1,8);
			game.addFrame(frame8);
			Frame frame9 = new Frame(2,5);
			game.addFrame(frame9);
			Frame frame10 = new Frame(1,1);
			game.addFrame(frame10);
			assertEquals(75, game.score());
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}

	@Test 
	public void equivalencePartitioning39_US06() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(6,2);
			game.addFrame(frame1);
			Frame frame2 = new Frame(1,8);
			game.addFrame(frame2);
			Frame frame3 = new Frame(2,5);
			game.addFrame(frame3);
			Frame frame4 = new Frame(0,5);
			game.addFrame(frame4);
			Frame frame5 = new Frame(-9,19);  // Spare invalido seguido de ordinary frame v√°lido
			game.addFrame(frame5);
			Frame frame6 = new Frame(2,5);
			game.addFrame(frame6);
			Frame frame7 = new Frame(6,3);
			game.addFrame(frame7);
			Frame frame8 = new Frame(0,0);
			game.addFrame(frame8);
			Frame frame9 = new Frame(0,9);
			game.addFrame(frame9);
			Frame frame10 = new Frame(7,2);
			game.addFrame(frame10);
			//assertNotEquals(75, game.score());
			game.score();
			fail("Juego invalido  y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning40_US06() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(1,1);
			game.addFrame(frame1);
			Frame frame2 = new Frame(3,6);
			game.addFrame(frame2);
			Frame frame3 = new Frame(0,10);// Spare valido seguido de frame invalido tal  que score de frame Spare >20
			game.addFrame(frame3);
			Frame frame4 = new Frame(20,0);
			game.addFrame(frame4);
			Frame frame5 = new Frame(3,3); 
			game.addFrame(frame5);
			Frame frame6 = new Frame(7,0);
			game.addFrame(frame6);
			Frame frame7 = new Frame(3,6);
			game.addFrame(frame7);
			Frame frame8 = new Frame(8,1);
			game.addFrame(frame8);
			Frame frame9 = new Frame(7,1);
			game.addFrame(frame9);
			Frame frame10 = new Frame(3,2);
			game.addFrame(frame10);
			//assertNotEquals(105, game.score());
			game.score();
			fail("Juego invalido  y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning41_US06() {
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
			Frame frame5 = new Frame(5,1); 
			game.addFrame(frame5);
			Frame frame6 = new Frame(3,4);
			game.addFrame(frame6);
			Frame frame7 = new Frame(7,2);
			game.addFrame(frame7);
			Frame frame8 = new Frame(0,8);
			game.addFrame(frame8);
			Frame frame9 = new Frame(0,10); // Spare valido seguido de frame invalido tal que score de frame Spare <10
			game.addFrame(frame9);
			Frame frame10 = new Frame(-9,1);
			game.addFrame(frame10);
			//assertNotEquals(49, game.score());
			game.score();
			fail("Juego invalido y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}

}
