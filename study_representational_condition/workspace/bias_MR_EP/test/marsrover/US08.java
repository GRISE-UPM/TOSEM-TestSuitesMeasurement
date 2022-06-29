package marsrover;

import static marsrover.Commons.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anyOf;






import static org.junit.Assert.assertEquals;

import org.junit.Test;






public class US08 {
	@Test
	public void claseEquivalencia24_Obs() {
			String obstaculo = generateObstacleInPosition(0, 9);
			MarsRover mr = new MarsRover(10,10,obstaculo);			
			mr.goToStart(1, 7, "S");
			assertEquals("(0,8,N)(0,9)", mr.executeCommand("rfrfff"));
	}
}
