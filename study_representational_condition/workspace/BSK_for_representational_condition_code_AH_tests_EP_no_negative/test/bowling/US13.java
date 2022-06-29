package bowling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Test;

import org.junit.Ignore;
import org.junit.Test;

public class US13 {

	@Test 
	public void equivalencePartitioning78_US13() {
		try{
			BowlingGame game = new BowlingGame(); //Bes Score valido
			Frame frame1 = new Frame(10,0); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(10,0);
			game.addFrame(frame2);
			Frame frame3 = new Frame(10,0);
			game.addFrame(frame3);
			Frame frame4 = new Frame(10,0);
			game.addFrame(frame4);
			Frame frame5 = new Frame(10,0);
			game.addFrame(frame5);
			Frame frame6 = new Frame(10,0);
			game.addFrame(frame6);
			Frame frame7 = new Frame(10,0);
			game.addFrame(frame7);
			Frame frame8 = new Frame(10,0);
			game.addFrame(frame8);
			Frame frame9 = new Frame(10,0);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0);
			game.addFrame(frame10);
			game.setBonus(10,10);
			assertEquals(300, game.score());
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning79_US13() {
		try{
			BowlingGame game = new BowlingGame(); //Best Score INVALIDO
			Frame frame1 = new Frame(10,10); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(10,10);
			game.addFrame(frame2);
			Frame frame3 = new Frame(15,15);
			game.addFrame(frame3);
			Frame frame4 = new Frame(15,15);
			game.addFrame(frame4);
			Frame frame5 = new Frame(15,15);
			game.addFrame(frame5);
			Frame frame6 = new Frame(15,15);
			game.addFrame(frame6);
			Frame frame7 = new Frame(15,15);
			game.addFrame(frame7);
			Frame frame8 = new Frame(15,15);
			game.addFrame(frame8);
			Frame frame9 = new Frame(25,25);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0);
			game.addFrame(frame10);
			game.setBonus(10,10);
			//assertNotEquals(300, game.score());
			game.score();
			fail("Best game invalido - valores de frame incorrectos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada juego invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning80_US13() {
		try{
			BowlingGame game = new BowlingGame(); //Best Score INVALIDO
			Frame frame1 = new Frame(15,15); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(15,15);
			game.addFrame(frame2);
			Frame frame3 = new Frame(15,15);
			game.addFrame(frame3);
			Frame frame4 = new Frame(15,15);
			game.addFrame(frame4);
			Frame frame5 = new Frame(15,15);
			game.addFrame(frame5);
			Frame frame6 = new Frame(15,15);
			game.addFrame(frame6);
			Frame frame7 = new Frame(15,15);
			game.addFrame(frame7);
			Frame frame8 = new Frame(15,15);
			game.addFrame(frame8);
			Frame frame9 = new Frame(15,15);
			game.addFrame(frame9);
			Frame frame10 = new Frame(15,15);
			game.addFrame(frame10);
			//assertNotEquals(300, game.score());
			game.score();
			fail("Best game invalido - valores de frame incorrectos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada juego invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
}
