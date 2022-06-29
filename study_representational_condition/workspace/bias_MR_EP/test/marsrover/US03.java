package marsrover;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;




public class US03 {
	@Test
	public void claseEquivalencia2() {// este caso falla con  min�sculas 
		
		MarsRover mr = new MarsRover(10,10,"");		
		mr.goToStart(9, 0, "S");
		assertEquals("(9,0,W)", mr.executeCommand("r"));
	}
	
	@Test
	public void claseEquivalencia2_1() {// Igual que la clase 2 con min�sculas 
		
		MarsRover mr = new MarsRover(10,10,"");		
		mr.goToStart(9, 0, "s");
		assertEquals("(9,0,W)", mr.executeCommand("r"));
	}

}
