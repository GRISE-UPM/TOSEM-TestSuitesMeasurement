package marsrover;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

public class US01 {
	@Ignore
	@Test
	public void testGrid01() throws Exception {//probando crear un grid de tama�o cero
	try {
			MarsRover mr = new MarsRover(0,0,"");		
			mr.goToStart(0,0,"S");
		    fail("Deberia lanzar una excepcion grid inv�lido");
		    
		  } catch (IndexOutOfBoundsException e) {
			  fail("Esta excepci�n implica que no se ha controlado el error");
		  } catch (Exception e) {
			  assertTrue("No ocurre una IndexOutOfBoundsException", true);
		  }
	}
	
	@Ignore
	@Test
	public void testGrid02() {// probando crear un grid de tama�o negativo
	try {
			MarsRover mr = new MarsRover(-3,-2,"");		
			mr.goToStart(0,0,"S");
		    fail("Deberia lanzar una excepcion grid inv�lido");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }
	}
	
	@Ignore
	@Test
	public void claseEquivalencia6() {
	try {
			MarsRover mr = new MarsRover(10,10,"");		
			mr.goToStart(-9,5,"S");
		    fail("Deberia lanzar una excepcion coordX negativa");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }
	}
	
	@Ignore
	@Test
	public void claseEquivalencia7() {
	try {
			MarsRover mr = new MarsRover(10,10,"");		
			mr.goToStart(10,9,"E");
		    fail("Deberia lanzar una excepcion coordX mayor que el grid");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }
	}
	
	@Ignore
	@Test
	public void claseEquivalencia10() {
		try {
			MarsRover mr = new MarsRover(10,10,"");		
			mr.goToStart(5,-5,"S");
		    fail("Deberia lanzar una excepcion coordY negativa");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }
	}
	
	@Ignore
	@Test
	public void claseEquivalencia11() {
	try {
			MarsRover mr = new MarsRover(10,10,"");		
			mr.goToStart(1,100,"N");
		    fail("Deberia lanzar una excepcion coordY mayor que el grid");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }	
	}
	
	@Ignore
	@Test
	public void claseEquivalencia17() { 
	try {
			MarsRover mr = new MarsRover(10,10,"");		
			mr.goToStart(0,0,"X");
		    fail("Deberia lanzar una excepcion facing incorrecto");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }	
	}
	
	@Ignore
	@Test
	public void claseEquivalencia18() { 
	try {
			MarsRover mr = new MarsRover(10,10,"");		
			mr.goToStart(9,9,"EW");
		    fail("Deberia lanzar una excepcion");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }		
	}

}
