package marsrover;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;





public class US04 {
	@Test
	public void claseEquivalencia1() {
		
		MarsRover mr = new MarsRover(10,10,"");	
		mr.goToStart(0, 0, "N");
		assertEquals("(0,9,N)", mr.executeCommand("b"));
	}

	@Test
	public void claseEquivalencia1_1() {
		
		MarsRover mr = new MarsRover(10,10,"");	
		mr.goToStart(0, 0, "n");
		assertEquals("(0,9,N)", mr.executeCommand("b"));
	}
	
	@Test
	public void claseEquivalencia3() {
		
		MarsRover mr = new MarsRover(10,10,"");		
		mr.goToStart(9, 9, "E");
		assertEquals("(0,9,E)", mr.executeCommand("f"));
	}
	
	@Test
	public void claseEquivalencia3_1() {
		
		MarsRover mr = new MarsRover(10,10,"");		
		mr.goToStart(9, 9, "e");
		assertEquals("(0,9,E)", mr.executeCommand("f"));
	}

}
