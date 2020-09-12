package bowling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Test;


public class US01 {

	@Test
	public void equivalencePartitioning01_US01() {
		
		try{
			Frame frame = new Frame(9,0);
			int throw1=frame.getThrow1();
			int throw2=frame.getThrow2();
			if(throw1==9 && throw2==0){
				assertTrue(true);
			}else{
				fail("El frame no ha almacenado los valores correctos");
			}
		}catch(Exception e){
			fail("Excepcion inesperada");
		}
	}
	
	@Test
	public void equivalencePartitioning02_US01() {
		
		try{
			Frame frame = new Frame(-1,7);
			int throw1=frame.getThrow1();
			int throw2=frame.getThrow2();
			if(throw1==-1){
				fail("El frame recibe Throw 1 invalido menor que cero");
			}
		}catch(RuntimeException r){
			fail("Excepcion NO controlada");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test
	public void equivalencePartitioning03_US01() {
		
		try{
			Frame frame = new Frame(11,0);
			int throw1=frame.getThrow1();
			int throw2=frame.getThrow2();
			if(throw1==11){
				fail("El frame recibe Throw 1 invalido mayor que 10");
			}
		}catch(RuntimeException r){
			fail("Excepcion NO controlada");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	// EP04_US01, EP05_US01 y EP06_US01 No automatizada por incompatibilidad de tipos de datos
	
	@Test
	public void equivalencePartitioning07_US01() {
		
		try{
			Frame frame = new Frame(1,-9);
			int throw1=frame.getThrow1();
			int throw2=frame.getThrow2();
			if(throw2==-9){
				fail("El frame recibe Throw 2 invalido menor que cero");
			}
		}catch(RuntimeException r){
			fail("Excepcion NO controlada");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test
	public void equivalencePartitioning08_US01() {
		
		try{
			Frame frame = new Frame(0,20);
			int throw1=frame.getThrow1();
			int throw2=frame.getThrow2();
			if(throw2==20){
				fail("El frame recibe Throw 2 invalido mayor que 10");
			}
		}catch(RuntimeException r){
			fail("Excepcion NO controlada");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
	
	@Test
	public void equivalencePartitioning24_US01() {
		
		try{
			Frame frame = null;
			int score= frame.score();
		}catch(RuntimeException r){
			fail("Deberia lanzar una excepcion controlada score frame invalido");
		}catch(Exception e){
			assertTrue("Excepcion controlada por el sujeto",true);
		}
	}
}
