package marsrover;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;





public class US05 {
		
	@Test
	public void claseEquivalencia4() {// probando el comando left dando vueltas en circulos
		
		MarsRover mr = new MarsRover(0,10,"");		
		mr.goToStart(0, 9, "W");
		assertEquals("(0,9,S)", mr.executeCommand("lllllllllllll"));
	}
	
	@Test
	public void claseEquivalencia4_1() {// igual que la clse 4 con minusculas
		
		MarsRover mr = new MarsRover(0,10,"");		
		mr.goToStart(0, 9, "w");
		assertEquals("(0,9,S)", mr.executeCommand("lllllllllllll"));
	}
	
	
	@Test
	public void claseEquivalencia5() {// entradas correctas alternando may�sculas y min�sculas
		
		MarsRover mr = new MarsRover(10,10,"");		
		mr.goToStart(1,1,"n");
		assertEquals("(8,8,N)", mr.executeCommand("LFRBblffRB"));
	}
	
	@Test
	public void claseEquivalencia20() {
		
		//MarsRover mr = new MarsRover(10,10,"");		
		//mr.goToStart(8,8,"N");
		//assertEquals("(8,8,N)", mr.executeCommand("mama"));
		try {
			MarsRover mr = new MarsRover(10,10,"");		
			mr.goToStart(8,8,"N");
			mr.executeCommand("mama");
		    fail("Deberia lanzar una excepcion comando inv�lido");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }	
	}
	
	@Test
	public void claseEquivalencia22() {// que ser�a lo correcto... no mover el rover,  moverlo hasta donde se puede o lanzaar la excepci�n.
		
		//MarsRover mr = new MarsRover(10,10,"");		
		//mr.goToStart(3,3,"E");
		//assertEquals("(3,3,E)", mr.executeCommand("rffffirfffrff"));
		try {
			MarsRover mr = new MarsRover(10,10,"");		
			mr.goToStart(3,3,"E");
			mr.executeCommand("rffffirfffrff");
		    fail("Deberia lanzar una excepcion comando inv�lido");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }
		
	}
	
	@Test
	public void claseEquivalencia23() {
		try {
			MarsRover mr = new MarsRover(10,10,"");		
			mr.goToStart(4,6,"W");
			mr.executeCommand(null);// o acaso seria mejor probar simplemente que no se haya movido de su posisci�n inicial?
		    fail("Deberia lanzar una excepcion comando inv�lido");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }
	}
}
