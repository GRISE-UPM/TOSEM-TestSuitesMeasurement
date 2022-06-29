package bowling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import org.junit.Test;

public class US11 {

	@Ignore
	@Test 
	public void equivalencePartitioning57_US11() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(2,5); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(7,2);
			game.addFrame(frame2);
			Frame frame3 = new Frame(0,9);
			game.addFrame(frame3);
			Frame frame4 = new Frame(4,4);
			game.addFrame(frame4);
			Frame frame5 = new Frame(1,1);
			game.addFrame(frame5);
			Frame frame6 = new Frame(2,6);
			game.addFrame(frame6);
			Frame frame7 = new Frame(2,5);
			game.addFrame(frame7);
			Frame frame8 = new Frame(6,2);
			game.addFrame(frame8);
			Frame frame9 = new Frame(5,4);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last frame strike valido con 2 bonus throw cuando bonusThrow1 <10
			game.addFrame(frame10);
			game.setBonus(5,4);
			//assertEquals(86, game.score());
			
			if((game.getSize()==10)&&(game.findBonus()==true)
					&&(game.getBonusThrow1()+game.getBonusThrow2()<=10)){
				assertTrue(true);
			}else{
				fail("Estructura de Juego invalido");
			}
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning58_US11() {
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
			Frame frame9 = new Frame(1,8);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last frame strike valido con 2 bonus throw cuando bonusThrow1 =10
			game.addFrame(frame10);
			game.setBonus(10,9);
			//assertEquals(97, game.score());
			
			if((game.getSize()==10)&&(game.findBonus()==true)
					&&((game.getBonusThrow1()==10)&&(game.getBonusThrow2()<=10))){
				assertTrue(true);
			}else{
				fail("Estructura de Juego invalido");
			}
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning61_US11() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(2,6); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(6,2);
			game.addFrame(frame2);
			Frame frame3 = new Frame(1,8);
			game.addFrame(frame3);
			Frame frame4 = new Frame(2,5);
			game.addFrame(frame4);
			Frame frame5 = new Frame(6,2);
			game.addFrame(frame5);
			Frame frame6 = new Frame(5,4);
			game.addFrame(frame6);
			Frame frame7 = new Frame(6,2);
			game.addFrame(frame7);
			Frame frame8 = new Frame(5,4);
			game.addFrame(frame8);
			Frame frame9 = new Frame(4,0);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last Frame Strike sin  bonus throw
			game.addFrame(frame10);
			//game.setBonus(null);
			//assertNotEquals(80, game.score());
			game.score();
			//fail("Estructura de Juego invalido - faltan 2 bonus throw2 cuando last frame es strike");
					
			if((game.getSize()==10)&&(game.findBonus()==true)){
				assertTrue(true);
			}else{
				fail("Estructura de Juego invalido - faltan 2 bonus throw2 cuando last frame es strike");
			}
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada estructura de juego invalida");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	//EP62_US11 No automatizado por incompaibilidad de tipos de datos game.setBonus(10,null);
	
	@Ignore
	@Test 
	public void equivalencePartitioning63_US11() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(2,6); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(6,2);
			game.addFrame(frame2);
			Frame frame3 = new Frame(6,2);
			game.addFrame(frame3);
			Frame frame4 = new Frame(1,8);
			game.addFrame(frame4);
			Frame frame5 = new Frame(2,5);
			game.addFrame(frame5);
			Frame frame6 = new Frame(7,2);
			game.addFrame(frame6);
			Frame frame7 = new Frame(4,4);
			game.addFrame(frame7);
			Frame frame8 = new Frame(1,1);
			game.addFrame(frame8);
			Frame frame9 = new Frame(2,6);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last Frame Strike con mas de 2 BonusThrow
			game.addFrame(frame10);
			game.setBonus(10,0);
			game.setBonus(4,3);
			assertEquals(91, game.score());
			//game.score();
			//fail("Estructura de Juego invalido - exceso de bonus throw cuando last frame es strike");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada estructura de juego invalida");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test 
	public void equivalencePartitioning66_US11() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(2,5); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(7,2);
			game.addFrame(frame2);
			Frame frame3 = new Frame(0,9);
			game.addFrame(frame3);
			Frame frame4 = new Frame(4,4);
			game.addFrame(frame4);
			Frame frame5 = new Frame(1,1);
			game.addFrame(frame5);
			Frame frame6 = new Frame(2,6);
			game.addFrame(frame6);
			Frame frame7 = new Frame(2,5);
			game.addFrame(frame7);
			Frame frame8 = new Frame(6,2);
			game.addFrame(frame8);
			Frame frame9 = new Frame(5,4);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last frame strike valido con 2 bonus throw cuando bonusThrow1 <10
			game.addFrame(frame10);
			game.setBonus(5,4);
			assertEquals(86, game.score());
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test 
	public void equivalencePartitioning67_US11() {
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
			Frame frame10 = new Frame(10,0); // Last frame strike valido con 2 bonus throw spare
			game.addFrame(frame10);
			game.setBonus(0,10);
			assertEquals(87, game.score());
			
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test 
	public void equivalencePartitioning68_US11() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(2,6); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(6,2);
			game.addFrame(frame2);
			Frame frame3 = new Frame(1,8);
			game.addFrame(frame3);
			Frame frame4 = new Frame(2,5);
			game.addFrame(frame4);
			Frame frame5 = new Frame(6,2);
			game.addFrame(frame5);
			Frame frame6 = new Frame(5,4);
			game.addFrame(frame6);
			Frame frame7 = new Frame(6,2);
			game.addFrame(frame7);
			Frame frame8 = new Frame(5,4);
			game.addFrame(frame8);
			Frame frame9 = new Frame(4,0);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last Frame Strike con bonus throw strike
			game.addFrame(frame10);
			game.setBonus(10,9);
			assertEquals(99, game.score());
					
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning72_US11() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(7,2); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(0,9);
			game.addFrame(frame2);
			Frame frame3 = new Frame(5,1);
			game.addFrame(frame3);
			Frame frame4 = new Frame(1,3);
			game.addFrame(frame4);
			Frame frame5 = new Frame(1,1);
			game.addFrame(frame5);
			Frame frame6 = new Frame(5,3);
			game.addFrame(frame6);
			Frame frame7 = new Frame(4,4);
			game.addFrame(frame7);
			Frame frame8 = new Frame(1,1);
			game.addFrame(frame8);
			Frame frame9 = new Frame(2,6);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last frame strike valido con bonus throw invalido (score de last frame strike >=10 y <=20)
			game.addFrame(frame10);
			game.setBonus(-5,7);
			//assertNotEquals(68, game.score());
			game.score();
			fail("Juego invalido - valores de frame incorrectos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada juego invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning73_US11() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(2,5); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(7,2);
			game.addFrame(frame2);
			Frame frame3 = new Frame(4,4);
			game.addFrame(frame3);
			Frame frame4 = new Frame(1,1);
			game.addFrame(frame4);
			Frame frame5 = new Frame(2,6);
			game.addFrame(frame5);
			Frame frame6 = new Frame(2,6);
			game.addFrame(frame6);
			Frame frame7 = new Frame(6,2);
			game.addFrame(frame7);
			Frame frame8 = new Frame(1,8);
			game.addFrame(frame8);
			Frame frame9 = new Frame(2,5);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last frame strike valido con bonus throw invalido (score de last frame strike <10)
			game.addFrame(frame10);
			game.setBonus(-3,-3);
			//assertNotEquals(70, game.score());
			game.score();
			fail("Juego invalido - valores de frame incorrectos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada juego invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning74_US11() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(2,5); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(6,2);
			game.addFrame(frame2);
			Frame frame3 = new Frame(5,1);
			game.addFrame(frame3);
			Frame frame4 = new Frame(1,3);
			game.addFrame(frame4);
			Frame frame5 = new Frame(1,1);
			game.addFrame(frame5);
			Frame frame6 = new Frame(6,2);
			game.addFrame(frame6);
			Frame frame7 = new Frame(5,4);
			game.addFrame(frame7);
			Frame frame8 = new Frame(1,1);
			game.addFrame(frame8);
			Frame frame9 = new Frame(6,2);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last frame strike valido con bonus throw invalido (score de last frame strike >20)
			game.addFrame(frame10);
			game.setBonus(6,6);
			//assertNotEquals(76, game.score());
			game.score();
			fail("Juego invalido - valores de frame bonus incorrectos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada juego invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning75_US11() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(1,3); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(1,1);
			game.addFrame(frame2);
			Frame frame3 = new Frame(2,5);
			game.addFrame(frame3);
			Frame frame4 = new Frame(7,2);
			game.addFrame(frame4);
			Frame frame5 = new Frame(0,9);
			game.addFrame(frame5);
			Frame frame6 = new Frame(7,2);
			game.addFrame(frame6);
			Frame frame7 = new Frame(0,9);
			game.addFrame(frame7);
			Frame frame8 = new Frame(2,6);
			game.addFrame(frame8);
			Frame frame9 = new Frame(6,2);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last frame strike valido con bonus throw spare INVALID0 (score de last frame strike =20)
			game.addFrame(frame10);
			game.setBonus(-4,14);
			//assertNotEquals(85, game.score());
			game.score();
			fail("Juego invalido - valores de frame bonus incorrectos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada juego invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning76_US11() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(6,2); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(1,8);
			game.addFrame(frame2);
			Frame frame3 = new Frame(2,5);
			game.addFrame(frame3);
			Frame frame4 = new Frame(7,2);
			game.addFrame(frame4);
			Frame frame5 = new Frame(0,9);
			game.addFrame(frame5);
			Frame frame6 = new Frame(6,2);
			game.addFrame(frame6);
			Frame frame7 = new Frame(5,4);
			game.addFrame(frame7);
			Frame frame8 = new Frame(1,1);
			game.addFrame(frame8);
			Frame frame9 = new Frame(6,2);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last frame strike valido con bonus strike seguido de frame INVALID0 (score de last frame strike <20)
			game.addFrame(frame10);
			game.setBonus(10,-1);
			//assertNotEquals(88, game.score());
			game.score();
			fail("Juego invalido - valores de frame bonus incorrectos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada juego invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Ignore
	@Test 
	public void equivalencePartitioning77_US11() {
		try{
			BowlingGame game = new BowlingGame();
			Frame frame1 = new Frame(2,5); 
			game.addFrame(frame1);
			Frame frame2 = new Frame(6,2);
			game.addFrame(frame2);
			Frame frame3 = new Frame(5,4);
			game.addFrame(frame3);
			Frame frame4 = new Frame(4,0);
			game.addFrame(frame4);
			Frame frame5 = new Frame(5,1);
			game.addFrame(frame5);
			Frame frame6 = new Frame(1,3);
			game.addFrame(frame6);
			Frame frame7 = new Frame(1,1);
			game.addFrame(frame7);
			Frame frame8 = new Frame(7,2);
			game.addFrame(frame8);
			Frame frame9 = new Frame(4,4);
			game.addFrame(frame9);
			Frame frame10 = new Frame(10,0); // Last frame strike valido con bonus strike seguido de frame INVALID0 (score de last frame strike >30)
			game.addFrame(frame10);
			game.setBonus(10,12);
			//assertNotEquals(89, game.score());
			game.score();
			fail("Juego invalido - valores de frame bonus incorrectos");
			
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada juego invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
}
