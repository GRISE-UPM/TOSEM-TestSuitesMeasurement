package bowling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Test;

public class US10 {

	@Test 
	public void equivalencePartitioning56_US10() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(6,2); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(1,8);
			game.addFrame(frame2);
			Frame frame3 = new Frame(2,5);
			game.addFrame(frame3);
			Frame frame4 = new Frame(6,2);
			game.addFrame(frame4);
			Frame frame5 = new Frame(1,3);
			game.addFrame(frame5);
			Frame frame6 = new Frame(1,1);
			game.addFrame(frame6);
			Frame frame7 = new Frame(2,5);
			game.addFrame(frame7);
			Frame frame8 = new Frame(7,2);
			game.addFrame(frame8);
			Frame frame9 = new Frame(0,9);
			game.addFrame(frame9);
			Frame frame10 = new Frame(7,3); // Last frame spare valido con 1 bonus throw
			game.addFrame(frame10);
			game.setBonus(8,0);
			//assertEquals(81, game.score());
			
			//Cuando last frame es spare siempre throw2 es igual a cero){
			if((game.getSize()==10)&&(game.findBonus()==true)
					&&(game.getBonusThrow1()<=10 && game.getBonusThrow2()==0)){
				assertTrue(true);
			}else{
				fail("Estructura de Juego invalido");
			}
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test 
	public void equivalencePartitioning59_US10() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(2,5); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(7,2);
			game.addFrame(frame2);
			Frame frame3 = new Frame(0,9);
			game.addFrame(frame3);
			Frame frame4 = new Frame(2,6);
			game.addFrame(frame4);
			Frame frame5 = new Frame(6,2);
			game.addFrame(frame5);
			Frame frame6 = new Frame(6,2);
			game.addFrame(frame6);
			Frame frame7 = new Frame(1,8);
			game.addFrame(frame7);
			Frame frame8 = new Frame(2,5);
			game.addFrame(frame8);
			Frame frame9 = new Frame(7,2);
			game.addFrame(frame9);
			Frame frame10 = new Frame(5,5); // Last frame spare valido sin bonus
			game.addFrame(frame10);
			//game.setBonus(null);
			//assertNotEquals(84, game.score());
			game.score();
			
			if((game.getSize()==10)&&(game.findBonus()==true)){
				assertTrue(true);
			}else{
				fail("Estructura de Juego invalido y falta bonus throw1");
			}
			//fail("Estructura de Juego invalido y falta bonus throw1");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada estructura de juego invalida");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning60_US10() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(2,5); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(6,2);
			game.addFrame(frame2);
			Frame frame3 = new Frame(5,4);
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
			Frame frame10 = new Frame(0,10); // Last frame spare valido con 2 bonus throw
			game.addFrame(frame10);
			game.setBonus(7,2);
			//assertNotEquals(87, game.score());
			//game.score();
			//fail("Estructura de Juego invalido - No debe admitir valores en bonus throw2 cuando last frame es spare");
			
			//Cuando last frame es spare siempre throw2 debe ser igual a cero){
			if((game.getSize()==10)&&(game.findBonus()==true)
					&&(game.getBonusThrow1()<=10 && game.getBonusThrow2()==0)){
				assertTrue(true);
			}else{
				fail("Estructura de Juego invalido - No debe admitir valores en bonus throw2 cuando last frame es spare");
			}
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada estructura de juego invalida");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning64_US10() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(6,2); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(1,8);
			game.addFrame(frame2);
			Frame frame3 = new Frame(2,5);
			game.addFrame(frame3);
			Frame frame4 = new Frame(6,2);
			game.addFrame(frame4);
			Frame frame5 = new Frame(1,3);
			game.addFrame(frame5);
			Frame frame6 = new Frame(1,1);
			game.addFrame(frame6);
			Frame frame7 = new Frame(2,5);
			game.addFrame(frame7);
			Frame frame8 = new Frame(7,2);
			game.addFrame(frame8);
			Frame frame9 = new Frame(0,9);
			game.addFrame(frame9);
			Frame frame10 = new Frame(7,3); // Last frame spare valido con 1 bonus throw
			game.addFrame(frame10);
			game.setBonus(8,0);
			assertEquals(81, game.score());
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test 
	public void equivalencePartitioning69_US10() {
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
			Frame frame10 = new Frame(11,-1); // Last frame spare INVALIDO con bonus throw valido
			game.addFrame(frame10);
			game.setBonus(9,0);
			//assertNotEquals(86, game.score());
			game.score();
			fail("Juego invalido - valores de frame incorrectos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada juego invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning70_US10() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(7,2); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(0,9);
			game.addFrame(frame2);
			Frame frame3 = new Frame(2,6);
			game.addFrame(frame3);
			Frame frame4 = new Frame(6,2);
			game.addFrame(frame4);
			Frame frame5 = new Frame(6,2);
			game.addFrame(frame5);
			Frame frame6 = new Frame(1,8);
			game.addFrame(frame6);
			Frame frame7 = new Frame(2,5);
			game.addFrame(frame7);
			Frame frame8 = new Frame(1,1);
			game.addFrame(frame8);
			Frame frame9 = new Frame(6,2);
			game.addFrame(frame9);
			Frame frame10 = new Frame(2,8); // Last frame spare valido con bonus throw invalido (negativo)
			game.addFrame(frame10);
			game.setBonus(-1,0);
			//assertNotEquals(77, game.score());
			game.score();
			fail("Juego invalido - valores de bonus incorrectos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada juego invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning71_US10() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(6,2); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(5,4);
			game.addFrame(frame2);
			Frame frame3 = new Frame(1,1);
			game.addFrame(frame3);
			Frame frame4 = new Frame(6,2);
			game.addFrame(frame4);
			Frame frame5 = new Frame(1,8);
			game.addFrame(frame5);
			Frame frame6 = new Frame(2,5);
			game.addFrame(frame6);
			Frame frame7 = new Frame(7,2);
			game.addFrame(frame7);
			Frame frame8 = new Frame(2,6);
			game.addFrame(frame8);
			Frame frame9 = new Frame(6,2);
			game.addFrame(frame9);
			Frame frame10 = new Frame(9,1); // Last frame spare valido con bonus throw invalido (>10)
			game.addFrame(frame10);
			game.setBonus(11,0);
			//assertNotEquals(89, game.score());
			game.score();
			fail("Juego invalido - valores de frame incorrectos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada juego invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
}
