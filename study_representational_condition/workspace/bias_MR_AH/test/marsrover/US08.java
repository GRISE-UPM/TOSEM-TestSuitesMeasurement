package marsrover;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anyOf;








import org.junit.Test;









import static marsrover.Commons.*;
public class US08 {
	@Test
	public void roverEncountersAnObstacleWhenTriesToSpawnNorthWhileGoingForward(){
		MarsRover rover = new MarsRover(100, 100, "(0,99)");

		assertThat("(0,0,S)(0,99)", is(equalToIgnoringCase(( rover.executeCommand("llf")))));
	}
	@Test
	public void roverEncountersAnObstacleWhenTriesToSpawnSouthWhileGoingForward(){
		MarsRover rover = new MarsRover(100, 100, "(1,0)");
		rover.executeCommand(goToTopLeftCornerFromSouth());
		rover.executeCommand("rfl");
		assertThat("(1,99,N)(1,0)", is(equalToIgnoringCase(( rover.executeCommand("f")))));

	}
	
	@Test
	public void roverEncountersAnObstacleWhenTriesToSpawnNorthWhileGoingBackward(){
		MarsRover rover = new MarsRover(100, 100, "(0,99)");
		assertThat("(0,0,N)(0,99)", is(equalToIgnoringCase(( rover.executeCommand("b")))));
	}
	@Test
	public void roverEncountersAnObstacleWhenTriesToSpawnSouthWhileGoingBackward(){
		MarsRover rover = new MarsRover(100, 100, "(1,0)");
		rover.executeCommand(goToTopLeftCornerFromSouth());
		rover.executeCommand("rfl");
		assertThat("(1,99,S)(1,0)", is(equalToIgnoringCase(( rover.executeCommand("llb")))));
	}
	@Test
	public void roverEncountersAnObstacleWhenTriesToSpawnWestGoingForward(){
		MarsRover rover = new MarsRover(100, 100, "(0,30)");
		rover.executeCommand("r");
		rover.executeCommand(generateCommand(99, "f"));
		rover.executeCommand("l");
		rover.executeCommand(generateCommand(30, "f"));
		rover.executeCommand("r");
		assertThat("(99,30,E)(0,30)", is(equalToIgnoringCase(( rover.executeCommand("f")))));
		//assertThat("(99,30,W)(0,30)()", is(equalToIgnoringCase(( rover.executeCommand("llb")))));

	}
	
	@Test
	public void roverEncountersAnObstacleWhenTriesToSpawnWestGoingBackward(){
		MarsRover rover = new MarsRover(100, 100, "(0,30)");
		rover.executeCommand("r");
		rover.executeCommand(generateCommand(99, "f"));
		rover.executeCommand("l");
		rover.executeCommand(generateCommand(30, "f"));
		rover.executeCommand("r");
		assertThat("(99,30,W)(0,30)", is(equalToIgnoringCase(( rover.executeCommand("llb")))));
	}
	@Test
	public void roverEncountersAnObstacleWhenTriesToSpawnEastGoingForward(){
		MarsRover rover = new MarsRover(100, 100, "(99,30)");
		rover.executeCommand(generateCommand(30, "f"));
		rover.executeCommand("l");
		assertThat("(0,30,W)(99,30)", is(equalToIgnoringCase( rover.executeCommand("f"))));

	}
	@Test
	public void roverEncountersAnObstacleWhenTriesToSpawnEastGoingBackward(){
		MarsRover rover = new MarsRover(100, 100, "(99,30)");
		rover.executeCommand(generateCommand(30, "f"));
		rover.executeCommand("l");
		assertThat("(0,30,E)(99,30)", is(equalToIgnoringCase( rover.executeCommand("llb"))));
	}
	
	@Test
	public void theRoverEncountersAnObstacleOnTheCornersOfThePlanetWhileMovingBackwardsLeft(){
		String topLeftCornerObstacle = generateObstacleInPosition(0, 99);
		MarsRover roverL = new MarsRover(100, 100, topLeftCornerObstacle);
		assertThat("(0,98,S)(0,99)", is(equalToIgnoringCase( roverL.executeCommand(goToTopLeftCornerFromSouthBackwards()))));
		MarsRover roverR = new MarsRover(100, 100, topLeftCornerObstacle);
		assertThat("(1,99,E)(0,99)",is( roverR.executeCommand(goToTopRightCornerFromSouth()+"r" + generateCommand(99, "b"))));
	}
	

	@Test
	public void theRoverEncountersAnObstacleOnTheEdgesOfThePlanetWhileMovingBackwardRighTop(){
		String topEdgeObstacle = generateObstacleInPosition(50, 99);
		MarsRover roverT = new MarsRover(100, 100, topEdgeObstacle);
		//assertThat("(49,99,W)(50,99)", is(equalToIgnoringCase( roverT.executeCommand(goToMiddleTopBorderFromWestBackwards()))));
		//assertThat("(51,99,E)(50,99)", is(equalToIgnoringCase( roverT.executeCommand(goToMiddleTopBorderFromEastBackwards()))));
		assertThat("(50,98,S)(50,99)", is(equalToIgnoringCase( roverT.executeCommand(goToMiddleTopBorderFromSouthBackwards()))));

		String bottomEdgeObstacle = generateObstacleInPosition(50, 0);
		MarsRover roverB = new MarsRover(100, 100, bottomEdgeObstacle);
		//assertThat("(49,0,W)(50,0)", is(equalToIgnoringCase( roverB.executeCommand(goToMiddleBottomBorderFromWestBackwards()))));
		//assertThat("(51,0,E)(50,0)", is(equalToIgnoringCase( roverB.executeCommand(goToMiddleBottomBorderFromEastBackwards()))));
		assertThat("(50,1,N)(50,0)", is(equalToIgnoringCase( roverB.executeCommand(goToMiddleBottomBorderFromNorthBackwards()))));
	}
	// Changed by Oscar
	// Why is this test case now uncommented??
	//
	// Was wrong --> In the 2nd assertion, the rover did not roll back to (0,0,N) before moving
	@Test
	public void theRoverEncountersAnObstacleInTheMiddleOfThePlanetWhileMovingBackward(){
		String middleObstacle = generateObstacleInPosition(50, 50);
		MarsRover rover1 = new MarsRover(100, 100, middleObstacle);
		MarsRover rover2 = new MarsRover(100, 100, middleObstacle);

		//assertThat("(49,50,W)(50,50)", is(equalToIgnoringCase( rover.executeCommand(goToMiddleOfPlanetFromWestBackwards()))));
		assertThat("(50,51,N)(50,50)", is(equalToIgnoringCase( rover1.executeCommand(goToMiddleOfPlanetFromNorthBackwards()))));
		//assertThat("(51,50,E)(50,50)", is(equalToIgnoringCase( rover.executeCommand(goToMiddleOfPlanetFromEastBackwards()))));
		assertThat("(50,49,S)(50,50)", is(equalToIgnoringCase( rover2.executeCommand(goToMiddleOfPlanetFromSouthBackwards()))));
	}

	// Changed by Oscar
	@Test
	public void theRoverEncountersAnObstacleOnTheEdgesOfThePlanetWhileMovingForwardRight(){
		String rightEdgeObstacle = generateObstacleInPosition(99, 50);
		MarsRover roverR = new MarsRover(100, 100, rightEdgeObstacle);
		assertThat(roverR.executeCommand(goToMiddleRightBorderFromWest()), anyOf(equalToIgnoringCase("(98,50,N)(99,50)"), equalToIgnoringCase("(98,50,E)(99,50)")));
	
		String topEdgeObstacle = generateObstacleInPosition(50, 99);
		MarsRover roverT = new MarsRover(100, 100, topEdgeObstacle);
		assertThat(roverT.executeCommand(goToMiddleTopBorderFromWest()), anyOf(equalToIgnoringCase("(49,99,N)(50,99)"), equalToIgnoringCase("(49,99,E)(50,99)")));

	
		String bottomEdgeObstacle = generateObstacleInPosition(50, 0);
		MarsRover roverB = new MarsRover(100, 100, bottomEdgeObstacle);
		assertThat(roverB.executeCommand(goToMiddleBottomBorderFromWest()), anyOf(equalToIgnoringCase("(49,0,N)(50,0)"), equalToIgnoringCase("(49,0,E)(50,0)")));
	}
	
	@Test
	public void theRoverEncountersAnObstacleOnTheCornersOfThePlanetWhileMovingBackwardsRight(){
		String topRightCornerObstacle = generateObstacleInPosition(99, 99);
		String bottomRightCornerObstacle = generateObstacleInPosition(99, 0);

		MarsRover roverR = new MarsRover(100, 100, topRightCornerObstacle);
		assertThat("(98,99,W)(99,99)", is(equalToIgnoringCase( roverR.executeCommand(goToTopRightCornerFromWestBackwards()))));

		MarsRover roverT = new MarsRover(100, 100, bottomRightCornerObstacle);
		assertThat("(98,0,W)(99,0)", is(equalToIgnoringCase( roverT.executeCommand(goToBottomRightCornerFromWestBackwards()))));

	}
	
	@Test
	public void theRoverEncountersAnObstacleOnTheEdgesOfThePlanetWhileMovingBackwardRight(){
		String rightEdgeObstacle = generateObstacleInPosition(99, 50);

		MarsRover roverR = new MarsRover(100, 100, rightEdgeObstacle);
		assertThat("(98,50,W)(99,50)", is(equalToIgnoringCase( roverR.executeCommand(goToMiddleRightBorderFromWestBackwards()))));

		String topEdgeObstacle = generateObstacleInPosition(50, 99);
		MarsRover roverT = new MarsRover(100, 100, topEdgeObstacle);
		assertThat("(49,99,W)(50,99)", is(equalToIgnoringCase( roverT.executeCommand(goToMiddleTopBorderFromWestBackwards()))));


		String bottomEdgeObstacle = generateObstacleInPosition(50, 0);
		MarsRover roverB = new MarsRover(100, 100, bottomEdgeObstacle);
		assertThat("(49,0,W)(50,0)", is(equalToIgnoringCase( roverB.executeCommand(goToMiddleBottomBorderFromWestBackwards()))));

	}
	
	// Changed by Oscar
	@Test
	public void theRoverEncountersAnObstacleOnTheEdgesOfThePlanetWhileMovingForwardLeft(){
		String leftEdgeObstacle = generateObstacleInPosition(0, 50);
		MarsRover roverL = new MarsRover(100, 100, leftEdgeObstacle);
		assertThat(roverL.executeCommand(goToMiddleLeftBorderCommandFromEast()), anyOf(equalToIgnoringCase("(1,50,N)(0,50)"), equalToIgnoringCase("(1,50,W)(0,50)")));
		
		String topEdgeObstacle = generateObstacleInPosition(50, 99);
		MarsRover roverT = new MarsRover(100, 100, topEdgeObstacle);
		assertThat(roverT.executeCommand(goToMiddleTopBorderFromEast()), anyOf(equalToIgnoringCase("(51,99,N)(50,99)"), equalToIgnoringCase("(51,99,W)(50,99)")));

		String bottomEdgeObstacle = generateObstacleInPosition(50, 0);
		MarsRover roverB = new MarsRover(100, 100, bottomEdgeObstacle);
		assertThat(roverB.executeCommand(goToMiddleBottomBorderFromEast()), anyOf(equalToIgnoringCase("(51,0,N)(50,0)"), equalToIgnoringCase("(51,0,W)(50,0)")));
	}
	
	@Test
	public void theRoverEncountersAnObstacleOnTheCornersOfThePlanetWhileMovingForwardLeft(){
		String topLeftCornerObstacle = generateObstacleInPosition(0, 99);
		
		MarsRover roverL = new MarsRover(100, 100, topLeftCornerObstacle);
		assertThat("(1,99,W)(0,99)", is(equalToIgnoringCase( roverL.executeCommand(goToTopLeftCornerFromEast()))));

	}
	
	@Test
	public void theRoverEncountersAnObstacleOnTheEdgesOfThePlanetWhileMovingBackwardLeft(){
		String leftEdgeObstacle = generateObstacleInPosition(0, 50);
		MarsRover roverL = new MarsRover(100, 100, leftEdgeObstacle);
		assertThat("(1,50,E)(0,50)", is(equalToIgnoringCase( roverL.executeCommand(goToMiddleLeftBorderCommandFromEastBackwards()))));

		String topEdgeObstacle = generateObstacleInPosition(50, 99);
		MarsRover roverT = new MarsRover(100, 100, topEdgeObstacle);
		assertThat("(51,99,E)(50,99)", is(equalToIgnoringCase( roverT.executeCommand(goToTopRightCornerFromSouth() +"r" + generateCommand(50, "b")))));

		String bottomEdgeObstacle = generateObstacleInPosition(50, 0);
		MarsRover roverB = new MarsRover(100, 100, bottomEdgeObstacle);
		assertThat("(51,0,E)(50,0)", is(equalToIgnoringCase( roverB.executeCommand(goToMiddleBottomBorderFromEastBackwards()))));

	}
	
	// Changed by Oscar
	@Test
	public void theRoverEncountersAnObstacleOnTheEdgesOfThePlanetWhileMovingForward(){
		String topEdgeObstacle = generateObstacleInPosition(50, 99);

		MarsRover roverT = new MarsRover(100, 100, topEdgeObstacle);
		//assertThat("(49,99,N)(50,99)", is(equalToIgnoringCase( roverT.executeCommand(goToMiddleTopBorderFromWest()))));
		//assertThat("(51,99,N)(50,99)", is(equalToIgnoringCase( roverT.executeCommand(goToMiddleTopBorderFromEast()))));
		assertThat("(50,98,N)(50,99)", is(equalToIgnoringCase( roverT.executeCommand(goToMiddleTopBorderFromSouth()))));

		String bottomEdgeObstacle = generateObstacleInPosition(50, 0);
		MarsRover roverB = new MarsRover(100, 100, bottomEdgeObstacle);
		//assertThat("(49,0,N)(50,0)", is(equalToIgnoringCase( roverB.executeCommand(goToMiddleBottomBorderFromWest()))));
		//assertThat("(51,0,N)(50,0)", is(equalToIgnoringCase( roverB.executeCommand(goToMiddleBottomBorderFromEast()))));
		assertThat(roverB.executeCommand(goToMiddleBottomBorderFromNorth()), anyOf(equalToIgnoringCase("(50,1,N)(50,0)"), equalToIgnoringCase("(50,1,S)(50,0)")));
	}
	
	
	@Test
	public void theRoverEncountersAnObstacleOnTheCornersOfThePlanetWhileMovingForward(){
		String topLeftCornerObstacle = generateObstacleInPosition(0, 99);

		MarsRover roverL = new MarsRover(100, 100, topLeftCornerObstacle);
		assertThat("(0,98,N)(0,99)", is(equalToIgnoringCase( roverL.executeCommand(goToTopLeftCornerFromSouth()))));
		//assertThat("(1,99,W)(0,99)", is(equalToIgnoringCase( roverL.executeCommand(goToTopLeftCornerFromEast()))));

		String topRightCornerObstacle = generateObstacleInPosition(99, 99);
		MarsRover roverR = new MarsRover(100, 100, topRightCornerObstacle);
		//assertThat("(98,99,E)(99,99)", is(equalToIgnoringCase( roverR.executeCommand(goToTopRightCornerFromWest()))));
		assertThat("(99,98,N)(99,99)", is(equalToIgnoringCase( roverR.executeCommand(goToTopRightCornerFromSouth()))));

		String bottomRightCornerObstacle = generateObstacleInPosition(99, 0);
		MarsRover roverT = new MarsRover(100, 100, bottomRightCornerObstacle);
		//assertThat("(98,0,E)(99,0)", is(equalToIgnoringCase( roverT.executeCommand(goToBottomRightCornerFromWest()))));
		assertThat("(99,1,S)(99,0)", is(equalToIgnoringCase( roverT.executeCommand(goToBottomRightCornerFromNorth()))));

	}
	
	@Test
	public void theRoverEncountersAnObstacleInTheMiddleOfThePlanetWhileMovingForward(){
		String middleObstacle = generateObstacleInPosition(50, 50);
		MarsRover rover = new MarsRover(100, 100, middleObstacle);
		MarsRover rover2 = new MarsRover(100, 100, middleObstacle);
		MarsRover rover3 = new MarsRover(100, 100, middleObstacle);
		MarsRover rover4 = new MarsRover(100, 100, middleObstacle);
		assertThat("(49,50,E)(50,50)", is(equalToIgnoringCase( rover.executeCommand(goToMiddleOfPlanetFromWest()))));
		assertThat("(50,51,S)(50,50)", is(equalToIgnoringCase( rover2.executeCommand(goToMiddleOfPlanetFromNorth()))));
		assertThat("(51,50,W)(50,50)", is(equalToIgnoringCase( rover3.executeCommand(goToMiddleOfPlanetFromEast()))));
		assertThat("(50,49,N)(50,50)", is(equalToIgnoringCase( rover4.executeCommand(goToMiddleOfPlanetFromSouth()))));
	}
	// Changed by Oscar
	@Test 
	public void theRoverEncounters2ObstaclesInARowFromLanding(){
		String firstObstacle = generateObstacleInPosition(0, 1);
		String secondObstacle = generateObstacleInPosition(1,0);

		MarsRover rover = new MarsRover(100, 100, firstObstacle+secondObstacle);
		assertThat(rover.executeCommand("frfl"), anyOf(equalToIgnoringCase("(0,0,N)(0,1)(1,0)"), equalToIgnoringCase("(0,0,N)(0,1)")));
	}

}
