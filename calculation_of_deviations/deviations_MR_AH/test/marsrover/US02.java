package marsrover;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;





public class US02 {
	
	MarsRover rover;
/*	String goToMiddleOfGridCommand;
	String goToMiddleLeftBorderCommand;
	String goToTopLeftCornerCommand;
	String goToMiddleTopBorderCommand;
	String goToTopRightCornerCommand;
	String goToMiddleRightBorderCommand;
	String goToBottomRightCornerCommand;
	String goToMiddleBottomBorderCommand;*/

	@Before
	public void setup(){
		this.rover = new MarsRover(100, 100, "");
	/*	this.goToMiddleOfGridCommand = goToTheMiddleOfTheGridCommand();
		this.goToMiddleLeftBorderCommand = goToMiddleLeftBorderCommand();
		this.goToTopLeftCornerCommand = goToTopLeftCorner();
		this.goToMiddleTopBorderCommand = goToMiddleTopBorder();
		this.goToTopRightCornerCommand = goToTopRightCorner();
		this.goToMiddleRightBorderCommand = goToMiddleRightBorder();
		this.goToBottomRightCornerCommand = goToBottomRightCorner();
		this.goToMiddleBottomBorderCommand = goToMiddleBottomBorder();*/
	}
	
	

	@Test
	public void theRoverStaysAtOriginOnceLandedAndExecutedAnEmptyCommand() {
		assertThat("(0,0,N)", is(equalToIgnoringCase(this.rover.executeCommand(""))));
		
	}
	
}
