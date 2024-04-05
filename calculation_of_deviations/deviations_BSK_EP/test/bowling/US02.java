package bowling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Test;

public class US02 {

	@Test
	public void equivalencePartitioning12_US02() {
		
		try{
			Frame frame = new Frame(4,5);
			assertEquals(9, frame.score());
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test
	public void equivalencePartitioning13_US02() {
		
		try{
			Frame frame = new Frame(6,5);
			if(frame.score()==11){
				fail("Score de un single frame mayor que 10");
			}
		}catch(RuntimeException r){
			fail("Excepcion NO controlada");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test
	public void equivalencePartitioning14_US02() {
		
		try{
			Frame frame = new Frame(-5,12);
			if(frame.score()==7){
				fail("Score de un single frame calculado con throws invalidos");
			}
		}catch(RuntimeException r){
			fail("Excepcion NO controlada");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test
	public void equivalencePartitioning15_US02() {
		
		try{
			Frame frame = new Frame(11,-15);
			if(frame.score()==-4){
				fail("Score de un single frame menor que cero");
			}
		}catch(RuntimeException r){
			fail("Excepcion NO controlada");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test
	public void equivalencePartitioning16_US02() {
		
		try{
			Frame frame = new Frame(12,11);
			if(frame.score()==23){
				fail("Score de un single frame invalido");
			}
		}catch(RuntimeException r){
			fail("Excepcion NO controlada");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
}
