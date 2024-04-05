package marsrover;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;





public class US06 {

	@Test
	public void testGrid03() { // probando todos los movimientos del rover en un grid 1x1 sin obst�culos
			
			MarsRover mr = new MarsRover(1,1,"");	
			mr.goToStart(0, 0, "N");
			assertEquals("(0,0,N)", mr.executeCommand("rrrrffffffffffllllbbbbbbbbbb"));
	}
			
			@Test
			public void claseEquivalencia4_2() {//probando wrapping pasando 20 veces x el mismo punto
				
				MarsRover mr = new MarsRover(0,3,"");		
				mr.goToStart(0, 2, "W");
				assertEquals("(0,1,N)", mr.executeCommand("bbbbbbbbbbbbbbbbbbbbrffffffffffffffffffff"));
			}
			
			@Test
			public void claseEquivalencia4_3() {//probando wrapping con todos los comandos y en todos los extremos del grid
				
				MarsRover mr = new MarsRover(2,2,"");		
				//mr.goToStart(0, 0, "W");
				//assertEquals("(0,0,N)", mr.executeCommand("flllbrflf"));
				mr.goToStart(1, 1, "E");// esta opci�n prueba el wrapping en una esquina
				assertEquals("(1,1,S)", mr.executeCommand("flfrbrf"));
			}
	}
	
