package bowling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Test;

import org.junit.Ignore;
import org.junit.Test;

public class US04 {

	@Test 
	public void equivalencePartitioning32_US04() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(2,7);
			game.addFrame(frame1);
			Frame frame2 = new Frame(3,6);
			game.addFrame(frame2);
			Frame frame3 = new Frame(4,5);
			game.addFrame(frame3);
			Frame frame4 = new Frame(5,4);
			game.addFrame(frame4);
			Frame frame5 = new Frame(6,3);
			game.addFrame(frame5);
			Frame frame6 = new Frame(7,2);
			game.addFrame(frame6);
			Frame frame7 = new Frame(8,1);
			game.addFrame(frame7);
			Frame frame8 = new Frame(9,0);
			game.addFrame(frame8);
			Frame frame9 = new Frame(1,1);
			game.addFrame(frame9);
			Frame frame10 = new Frame(0,9);
			game.addFrame(frame10);
			assertEquals(83, game.score());
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning33_US04() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(20,20);
			game.addFrame(frame1);
			Frame frame2 = new Frame(-10,-10);
			game.addFrame(frame2);
			Frame frame3 = new Frame(-2,-2);
			game.addFrame(frame3);
			Frame frame4 = new Frame(-3,-3);
			game.addFrame(frame4);
			Frame frame5 = new Frame(-4,-4);
			game.addFrame(frame5);
			Frame frame6 = new Frame(-5,5);
			game.addFrame(frame6);
			Frame frame7 = new Frame(6,6);
			game.addFrame(frame7);
			Frame frame8 = new Frame(7,7);
			game.addFrame(frame8);
			Frame frame9 = new Frame(8,8);
			game.addFrame(frame9);
			Frame frame10 = new Frame(9,9);
			game.addFrame(frame10);
			//assertNotEquals(62, game.score());
			fail("Estructura de Juego invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada Score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning34_US04() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(0,0);
			game.addFrame(frame1);
			Frame frame2 = new Frame(0,9);
			game.addFrame(frame2);
			Frame frame3 = new Frame(9,0);
			game.addFrame(frame3);
			Frame frame4 = new Frame(2,7);
			game.addFrame(frame4);
			Frame frame5 = new Frame(3,6);
			game.addFrame(frame5);
			Frame frame6 = new Frame(4,5);
			game.addFrame(frame6);
			Frame frame7 = new Frame(-5,41);
			game.addFrame(frame7);
			Frame frame8 = new Frame(6,3);
			game.addFrame(frame8);
			Frame frame9 = new Frame(7,2);
			game.addFrame(frame9);
			Frame frame10 = new Frame(8,1);
			game.addFrame(frame10);
			//assertNotEquals(108, game.score());
			fail("Estructura de Juego invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada Score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning35_US04() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(8,0);
			game.addFrame(frame1);
			Frame frame2 = new Frame(7,1);
			game.addFrame(frame2);
			Frame frame3 = new Frame(2,2);
			game.addFrame(frame3);
			Frame frame4 = new Frame(1,1);
			game.addFrame(frame4);
			Frame frame5 = new Frame(2,3);
			game.addFrame(frame5);
			Frame frame6 = new Frame(4,3);
			game.addFrame(frame6);
			Frame frame7 = new Frame(3,0);
			game.addFrame(frame7);
			Frame frame8 = new Frame(6,6);
			game.addFrame(frame8);
			Frame frame9 = new Frame(-4,4);
			game.addFrame(frame9);
			Frame frame10 = new Frame(-25,-25);
			game.addFrame(frame10);
			//assertNotEquals(-1, game.score());
			game.score();
			fail("Juego invalido y score invalido");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada Score invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning36_US04()  {
		try {
			BowlingGame game = new BowlingGame();

				Frame frame1 = null;
				game.addFrame(frame1);
				Frame frame2 = null;
				game.addFrame(frame2);
				Frame frame3 = null;
				game.addFrame(frame3);
				Frame frame4 = null;
				game.addFrame(frame4);
				Frame frame5 = null;
				game.addFrame(frame5);
				Frame frame6 = null;
				game.addFrame(frame6);
				Frame frame7 = null;
				game.addFrame(frame7);
				Frame frame8 = null;
				game.addFrame(frame8);
				Frame frame9 = null;
				game.addFrame(frame9);
				Frame frame10 = null;
				game.addFrame(frame10);
				game.score();
				fail("Deberia lanzar una excepcion controlada Juego invalido  y score imposible");
				
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada game invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	} 

}
