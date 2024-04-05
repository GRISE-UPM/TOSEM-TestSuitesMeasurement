package marsrover;

import static marsrover.Commons.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anyOf;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;






public class US07 {
	@Test
	public void claseEquivalencia25_Obs() {		
			try {
				String obstaculo = generateObstacleInPosition(11, 9);
				MarsRover mr = new MarsRover(10,10,obstaculo);	
				fail("Deberia lanzar una excepcion obst�culo fuera del grid");

			  } catch (IndexOutOfBoundsException e) {
				  assertTrue(true);
			  }
	}
	
	@Test
	public void claseEquivalencia26_Obs() {		
			try {
				String obstaculo = generateObstacleInPosition(-3, 0);
				MarsRover mr = new MarsRover(10,10,obstaculo);	
				fail("Deberia lanzar una excepcion obst�culo fuera del grid");

			  } catch (IndexOutOfBoundsException e) {
				  assertTrue(true);
			  }
	}
	
	@Test
	public void claseEquivalencia27_Obs() {		
			try {
				String obstaculo = generateObstacleInPosition(0, 10);
				MarsRover mr = new MarsRover(10,10,obstaculo);	
				fail("Deberia lanzar una excepcion obst�culo fuera del grid");

			  } catch (IndexOutOfBoundsException e) {
				  assertTrue(true);
			  }
	}
	
	@Test
	public void claseEquivalencia28_Obs() {		
			try {
				String obstaculo = generateObstacleInPosition(9, -1);
				MarsRover mr = new MarsRover(10,10,obstaculo);	
				fail("Deberia lanzar una excepcion obst�culo fuera del grid");

			  } catch (IndexOutOfBoundsException e) {
				  assertTrue(true);
			  }
	}
}
