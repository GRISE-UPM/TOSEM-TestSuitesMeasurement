package bowling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Test;

import org.junit.Ignore;
import org.junit.Test;

public class US03 {

	@Test 
	public void equivalencePartitioning25_US03() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(0,0);
			game.addFrame(frame1);
			Frame frame2 = new Frame(4,5);
			game.addFrame(frame2);
			Frame frame3 = new Frame(0,9);
			game.addFrame(frame3);
			Frame frame4 = new Frame(7,2);
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
			assertEquals(game.getSize(),10);
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test 
	public void equivalencePartitioning26_US03() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(4,4);
			game.addFrame(frame1);
			Frame frame2 = new Frame(9,0);
			game.addFrame(frame2);
			Frame frame3 = new Frame(7,2);
			game.addFrame(frame3);
			Frame frame4 = new Frame(0,9);
			game.addFrame(frame4);
			Frame frame5 = new Frame(2,7);
			game.addFrame(frame5);
			Frame frame6 = new Frame(3,3);
			game.addFrame(frame6);
			Frame frame7 = new Frame(5,1);
			game.addFrame(frame7);
			Frame frame8 = new Frame(1,3);
			game.addFrame(frame8);
			Frame frame9 = new Frame(1,1);
			game.addFrame(frame9);
			Frame frame10 = new Frame(6,2);
			game.addFrame(frame10);
			game.setBonus(5,0);
			
			if((game.getSize()==10)&&(game.findBonus()==false)){
				assertTrue(true);
			}else{
				fail("Estructura de Juego invalido");
			}
		}catch(RuntimeException r){
			System.out.println(r.getClass().toString());
			fail("Deberia lanzar una excepcion controlada estructura de game invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning27_US03() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(20,20);
			game.addFrame(frame1);
			Frame frame2 = new Frame(10,10);
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
			fail("Juego incluye frames invalidos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada game invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning28_US03() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(0,0);
			game.addFrame(frame1);
			Frame frame2 = new Frame(0,9);
			game.addFrame(frame2);
			Frame frame3 = new Frame(-1,11);
			game.addFrame(frame3);
			Frame frame4 = new Frame(2,7);
			game.addFrame(frame4);
			Frame frame5 = new Frame(3,6);
			game.addFrame(frame5);
			Frame frame6 = new Frame(4,5);
			game.addFrame(frame6);
			Frame frame7 = new Frame(-5,4);
			game.addFrame(frame7);
			Frame frame8 = new Frame(6,3);
			game.addFrame(frame8);
			Frame frame9 = new Frame(7,2);
			game.addFrame(frame9);
			Frame frame10 = new Frame(8,8);
			game.addFrame(frame10);
			fail("Juego incluye frames invalidos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada game invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning29_US03() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(0,0);
			game.addFrame(frame1);
			Frame frame2 = new Frame(0,9);
			game.addFrame(frame2);
			Frame frame3 = new Frame(1,8);
			game.addFrame(frame3);
			Frame frame4 = new Frame(2,7);
			game.addFrame(frame4);
			Frame frame5 = new Frame(3,6);
			game.addFrame(frame5);
			Frame frame6 = new Frame(4,5);
			game.addFrame(frame6);
			Frame frame7 = new Frame(5,4);
			game.addFrame(frame7);
			Frame frame8 = new Frame(6,3);
			game.addFrame(frame8);
			Frame frame9 = new Frame(7,2);
			game.addFrame(frame9);
			Frame frame10 = new Frame(8,1);
			game.addFrame(frame10);
			Frame frame11 = new Frame(9,0);
			game.addFrame(frame11);
			Frame frame12 = new Frame(1,1);
			game.addFrame(frame12);
			assertEquals(game.getSize(),10);// Un juego con sÛlo ordinary frames nunca debe tener m·s de 10 frames
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada game invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning30_US03()  {
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
				fail("Estructura de Juego invalido");
				
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada game invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning31_US03()  {
		try {
			BowlingGame game = null;
			game.score();
			fail("Juego invalido");
				
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada game invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
}
