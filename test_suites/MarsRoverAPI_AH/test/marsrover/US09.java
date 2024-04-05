package marsrover;

import static marsrover.Commons.generateObstacleInPosition;
import static marsrover.Commons.goToBottomRightCornerFromNorth;
import static marsrover.Commons.goToBottomRightCornerFromNorthBackwards;
import static marsrover.Commons.goToBottomRightCornerFromWest;
import static marsrover.Commons.goToBottomRightCornerFromWestBackwards;
import static marsrover.Commons.goToMiddleBottomBorderFromEast;
import static marsrover.Commons.goToMiddleBottomBorderFromEastBackwards;
import static marsrover.Commons.goToMiddleBottomBorderFromNorth;
import static marsrover.Commons.goToMiddleBottomBorderFromNorthBackwards;
import static marsrover.Commons.goToMiddleBottomBorderFromWest;
import static marsrover.Commons.goToMiddleBottomBorderFromWestBackwards;
import static marsrover.Commons.goToMiddleOfPlanetFromEastBackwards;
import static marsrover.Commons.goToMiddleOfPlanetFromNorthBackwards;
import static marsrover.Commons.goToMiddleOfPlanetFromSouthBackwards;
import static marsrover.Commons.goToMiddleOfPlanetFromWestBackwards;
import static marsrover.Commons.goToMiddleRightBorderFromNorth;
import static marsrover.Commons.goToMiddleRightBorderFromNorthBackwards;
import static marsrover.Commons.goToMiddleRightBorderFromSouth;
import static marsrover.Commons.goToMiddleRightBorderFromSouthBackwards;
import static marsrover.Commons.goToMiddleRightBorderFromWest;
import static marsrover.Commons.goToMiddleRightBorderFromWestBackwards;
import static marsrover.Commons.goToMiddleTopBorderFromEast;
import static marsrover.Commons.goToMiddleTopBorderFromEastBackwards;
import static marsrover.Commons.goToMiddleTopBorderFromSouth;
import static marsrover.Commons.goToMiddleTopBorderFromSouthBackwards;
import static marsrover.Commons.goToMiddleTopBorderFromWest;
import static marsrover.Commons.goToMiddleTopBorderFromWestBackwards;
import static marsrover.Commons.goToTopLeftCornerFromEast;
import static marsrover.Commons.goToTopLeftCornerFromSouth;
import static marsrover.Commons.goToTopRightCornerFromSouth;
import static marsrover.Commons.goToTopRightCornerFromSouthBackwards;
import static marsrover.Commons.goToTopRightCornerFromWest;
import static marsrover.Commons.goToTopRightCornerFromWestBackwards;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anyOf;
import static org.junit.Assert.*;

import org.junit.Test;

import marsrover.MarsRover;





public class US09 {

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
	
//	@Test
//	public void theRoverEncountersAnObstacleOnTheCornersOfThePlanetWhileMovingForwardLeft(){
//		String topRightCornerObstacle = generateObstacleInPosition(99, 99);
//		MarsRover roverR = new MarsRover(100, 100, topRightCornerObstacle);
//		assertThat("(98,99,E)(99,99)", is(equalToIgnoringCase( roverR.executeCommand(goToTopRightCornerFromWest()))));
//	
//
//		String bottomRightCornerObstacle = generateObstacleInPosition(99, 0);
//		MarsRover roverT = new MarsRover(100, 100, bottomRightCornerObstacle);
//		assertThat("(98,0,E)(99,0)", is(equalToIgnoringCase( roverT.executeCommand(goToBottomRightCornerFromWest()))));
//
//	}
	
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
//	@Test
//	public void theRoverEncountersAnObstacleInTheMiddleOfThePlanetWhileMovingBackward(){
//		String middleObstacle = generateObstacleInPosition(50, 50);
//		MarsRover rover = new MarsRover(100, 100, middleObstacle);
//
//		assertThat("(49,50,W)(50,50)", is(equalToIgnoringCase( rover.executeCommand(goToMiddleOfPlanetFromWestBackwards()))));
//		
//	}
	

}
