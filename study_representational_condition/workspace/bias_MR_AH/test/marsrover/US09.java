package marsrover;

import static marsrover.Commons.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anyOf;
import static org.junit.Assert.*;

import org.junit.Test;





public class US09 {


	

	// Changed by Oscar
	@Test
	public void theRoverEncountersSevenObstaclesOnATourAroundThePlanet(){
		String obstacle1 = generateObstacleInPosition(0, 50);
		String obstacle2 = generateObstacleInPosition(0, 99);
		String obstacle3 = generateObstacleInPosition(50,99);
		String obstacle4 = generateObstacleInPosition(99, 99);
		String obstacle5 = generateObstacleInPosition(99, 50);
		String obstacle6 = generateObstacleInPosition(99, 0);
		String obstacle7 = generateObstacleInPosition(50, 0);
		MarsRover rover3 = new MarsRover(100, 100, obstacle1+obstacle2+obstacle3+obstacle4+obstacle5+obstacle6+obstacle7);
		assertThat(rover3.executeCommand(
				goToMiddleLeftBorderCommandFromSouthBackwards() + "rblbblbr" + generateCommand(50, "b") +
				"rblbr" + generateCommand(50, "b") + "rblbblbr" + generateCommand(50, "b") + "rblbr" + generateCommand(50, "b") +
				"rblbblbr" + generateCommand(50, "b") + "rblbr" + generateCommand(50, "b") + "rblbblbr" + generateCommand(50, "b") + "l"),
				anyOf(equalToIgnoringCase("(0,0,N)(0,50)(0,99)(50,99)(99,99)(99,50)(99,0)(50,0)"), equalToIgnoringCase("(0,49,S)(0,50)")));
//		String obstacle1 = generateObstacleInPosition(0, 50);
//		String obstacle2 = generateObstacleInPosition(0, 99);
//		String obstacle3 = generateObstacleInPosition(50,99);
//		String obstacle4 = generateObstacleInPosition(99, 99);
//		String obstacle5 = generateObstacleInPosition(99, 50);
//		String obstacle6 = generateObstacleInPosition(99, 0);
//		String obstacle7 = generateObstacleInPosition(50, 0);
		MarsRover rover4 = new MarsRover(100, 100, obstacle7+obstacle6+obstacle5+obstacle4+obstacle3+obstacle2+obstacle1);
		assertThat(rover4.executeCommand(goToMiddleBottomBorderFromWestBackwards() + "lbrbbrbl" + generateCommand(50, "b") +
				"lbrbl" + generateCommand(50, "b") + "lbrbbrbl" + generateCommand(50, "b") + "lbrbl" + generateCommand(50, "b") +
				"lbrbbrbl" + generateCommand(50, "b") + "lbrbl" + generateCommand(50, "b") + "lbrbbrbl" + generateCommand(50, "b")),
				anyOf(equalToIgnoringCase("(0,0,N)(50,0)(99,0)(99,50)(99,99)(50,99)(0,99)(0,50)"), equalToIgnoringCase("(49,0,W)(50,0)")));
	}
	
	// Changed by Oscar
	@Test
	public void theRoverEncounters2ObstaclesInARow(){
		String firstHorizontalObstacle = generateObstacleInPosition(1, 1);
		String secondHorizontalObstacle = generateObstacleInPosition(3, 1);
		String firstVerticalObstacle = generateObstacleInPosition(1, 0);
		String secondVerticalObstacle = generateObstacleInPosition(1, 2);

		MarsRover roverH = new MarsRover(100, 100, firstHorizontalObstacle+secondHorizontalObstacle);
		assertThat(roverH.executeCommand("rflfrflfrflf"), anyOf(equalToIgnoringCase("(2,2,N)(1,1)(3,1)"), equalToIgnoringCase("(1,0,N)(1,1)")));

		MarsRover roverV = new MarsRover(100, 100, firstVerticalObstacle+secondVerticalObstacle);
		assertThat(roverV.executeCommand("rflfrflfrfl"), anyOf(equalToIgnoringCase("(2,1,N)(1,0)(1,2)"), equalToIgnoringCase("(0,0,E)(1,0)")));
	}

	// Changed by Oscar
	@Test
	public void theRoverEncounters3ObstaclesInARow(){
		String obstacle11 = Commons.generateObstacleInPosition(1, 1);
		String obstacle22 = Commons.generateObstacleInPosition(2, 2);
		String obstacle31 = Commons.generateObstacleInPosition(3, 1);
		String obstacle20 = Commons.generateObstacleInPosition(2, 0);

		MarsRover rover1 = new MarsRover(100, 100, obstacle11+obstacle22 + obstacle31);
		assertThat(rover1.executeCommand("rfflfrflflfr"), anyOf(equalToIgnoringCase("(2,1,N)(3,1)(2,2)(1,1)"), equalToIgnoringCase("(2,1,E)(3,1)")));

		MarsRover rover2 = new MarsRover(100, 100, obstacle20+obstacle22 + obstacle31);
		assertThat(rover2.executeCommand("rflfrfrflflf"), anyOf(equalToIgnoringCase("(2,1,N)(2,0)(3,1)(2,2)"), equalToIgnoringCase("(2,1,S)(2,0)")));

		MarsRover rover3 = new MarsRover(100, 100, obstacle11+obstacle20 + obstacle31);
		assertThat(rover3.executeCommand("ffrffrfrflflfl"), anyOf(equalToIgnoringCase("(2,1,N)(1,1)(2,0)(3,1)"), equalToIgnoringCase("(2,1,W)(1,1)")));
	}




}
