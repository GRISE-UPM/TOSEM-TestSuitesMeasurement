package marsrover;

import static marsrover.Commons.generateObstacleInPosition;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;





public class US09 {
	@Test
	public void claseEquivalencia29_Obs() {		
	
				String obstaculo1 = generateObstacleInPosition(0, 0);
				String obstaculo2 = generateObstacleInPosition(1, 1);
				String obstaculo3 = generateObstacleInPosition(2, 2);
				String obstaculo4 = generateObstacleInPosition(3, 3);
				String obstaculo5 = generateObstacleInPosition(2, 3);
				String obstaculo6 = generateObstacleInPosition(3, 2);
				
				MarsRover mr = new MarsRover(10,10,obstaculo1+obstaculo2+obstaculo3+obstaculo4+obstaculo5+obstaculo6);	
				mr.goToStart(4,4,"E");
				assertEquals("(2,1,E)(1,1)", mr.executeCommand("rffflbbbb"));
	}
	@Ignore
	@Test
	public void claseEquivalencia30_Obs() {		
		try {
			String obstaculo1 = generateObstacleInPosition(0, 0);
			String obstaculo2 = "obstaculo2";
			String obstaculo3 = generateObstacleInPosition(2, 2);
			String obstaculo4 = generateObstacleInPosition(3, 3);
			String obstaculo5 = generateObstacleInPosition(2, 3);
			String obstaculo6 = generateObstacleInPosition(3, 2);
			
			MarsRover mr = new MarsRover(10,10,obstaculo1+obstaculo2+obstaculo3+obstaculo4+obstaculo5+obstaculo6);	
			mr.goToStart(2,3,"W");
			mr.executeCommand("rffflbbbb");
			fail("Deberia lanzar una excepcion obst�culo incorrecto");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }
	}
	@Ignore
	@Test
	public void claseEquivalencia31_Obs() {	// coordenada de origen sobre un obst�culo	
		try {
			String obstaculo1 = generateObstacleInPosition(0, 0);
			String obstaculo2 = generateObstacleInPosition(1, 1);
			String obstaculo3 = generateObstacleInPosition(2, 2);
			String obstaculo4 = generateObstacleInPosition(3, 3);
			String obstaculo5 = generateObstacleInPosition(2, 3);
			String obstaculo6 = generateObstacleInPosition(3, 2);
			
			MarsRover mr = new MarsRover(10,10,obstaculo1+obstaculo2+obstaculo3+obstaculo4+obstaculo5+obstaculo6);	
			mr.goToStart(2,3,"W");
			mr.executeCommand("rffflbbbb");
			fail("Deberia lanzar una excepcion obst�culo en posici�n inicial");

		  } catch (IndexOutOfBoundsException e) {
			  assertTrue(true);
		  }
	}
	
	@Test
	public void claseEquivalencia32_Obs() {		// todo el grid lleno de obst�culos
	
				String obstaculo1 = generateObstacleInPosition(1, 0);
				String obstaculo2 = generateObstacleInPosition(2, 0);
				String obstaculo3 = generateObstacleInPosition(0, 1);
				String obstaculo4 = generateObstacleInPosition(1, 1);
				String obstaculo5 = generateObstacleInPosition(2, 1);
				String obstaculo6 = generateObstacleInPosition(0, 2);
				String obstaculo7 = generateObstacleInPosition(1,2);
				String obstaculo8 = generateObstacleInPosition(2, 2);
				
				MarsRover mr = new MarsRover(3,3,obstaculo1+obstaculo2+obstaculo3+obstaculo4+obstaculo5+obstaculo6+obstaculo7+obstaculo8);	
				mr.goToStart(0,0,"S");
				assertEquals("(0,0,S)(0,2)", mr.executeCommand("fff"));
	}
}
