package marsrover;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class US05 {
	
	MarsRover rover;
	@Before
	public void setUp(){
		rover = new MarsRover(100, 100, "");
	}
	
	@Test
	public void theRoverShouldChangeFacingTWhenGivenATurnCommandAfterLanding_2(){
		assertThat("(0,0,E)", is(equalToIgnoringCase( this.rover.executeCommand("rr"))));
	}
	
	
	@Test
	public void theRoverFacesSouthAfterLandingAndExecutingATurnCommandToTimesInARow(){
		assertThat("(0,0,S)", is(equalToIgnoringCase( this.rover.executeCommand("rr"))));
		assertThat("(0,0,N)", is(equalToIgnoringCase( this.rover.executeCommand("ll"))));
	}
	
	@Test
	public void theRoverFacesWestAfterLandingAndExecutingALeftCommandThreeTimesInARow(){
		assertThat("(0,0,E)", is(equalToIgnoringCase(this.rover.executeCommand("lll"))));	
	}
	
	@Test
	public void theRoverFacesEastAfterLandingAndExecutingARightCommandThreeTimesInARow(){
		assertThat("(0,0,W)", is(equalToIgnoringCase(this.rover.executeCommand("rrr"))));	
	}
	
	@Test
	public void theRoverIsFacingTheSameDirectionAfterExecutingFourTimesTheSameTurnCommand(){
		assertThat("(0,0,N)", is(equalToIgnoringCase(this.rover.executeCommand("llll"))));
		assertThat("(0,0,N)", is(equalToIgnoringCase(this.rover.executeCommand("rrrr"))));
	}
	
	@Test
	public void theRoverMovesForwardSouthBoundedOnceLanding() {
		String command = generateCommand(10, "f");
		 this.rover.executeCommand(command);
		 this.rover.executeCommand("ll");
		 assertThat("(0,5,S)", is(equalToIgnoringCase( this.rover.executeCommand("fffff"))));
		 assertThat("(0,4,S)", is(equalToIgnoringCase( this.rover.executeCommand("f"))));
	}
	
	@Test
	public void theRoverMovesForwardWestBoundedOnceLanding() {
		String command = generateCommand(10, "f");
		 this.rover.executeCommand(command);
		 this.rover.executeCommand("r");
		 this.rover.executeCommand("fffff");
		 this.rover.executeCommand("ll");
		 //this.rover.executeCommand("ff");
		 assertThat("(3,10,W)", is(equalToIgnoringCase( this.rover.executeCommand("ff"))));
		 assertThat("(2,10,W)", is(equalToIgnoringCase( this.rover.executeCommand("f"))));
	}
	
	@Test
	public void theRoverMovesForwardEastBoundedOnceLanding() {
		String command = generateCommand(10, "f");
		 this.rover.executeCommand(command);
		 this.rover.executeCommand("r");
		this.rover.executeCommand("fffff");
		 assertThat("(10,10,E)", is(equalToIgnoringCase( this.rover.executeCommand("fffff"))));
		 assertThat("(11,10,E)", is(equalToIgnoringCase( this.rover.executeCommand("f"))));
	}
	
	@Test
	public void theRoverMovesBackwardNorthBoundedOnceLanding() {
		String command = generateCommand(10, "f");
		this.rover.executeCommand(command);
		this.rover.executeCommand("b");
		assertThat("(0,6,N)", is(equalToIgnoringCase( this.rover.executeCommand("bbb"))));
		assertThat("(0,5,N)", is(equalToIgnoringCase( this.rover.executeCommand("b"))));
	}
	
	@Test
	public void theRoverMovesBackwardSouthBoundedOnceLanding() {
		String command = generateCommand(10, "f");
		 this.rover.executeCommand(command);
		 this.rover.executeCommand("ll");
		 assertThat("(0,15,S)", is(equalToIgnoringCase( this.rover.executeCommand("bbbbb"))));
		 assertThat("(0,16,S)", is(equalToIgnoringCase( this.rover.executeCommand("b"))));
	}
	
	@Test
	public void theRoverMovesBackwardWestBoundedOnceLanding() {
		String command = generateCommand(10, "f");
		 this.rover.executeCommand(command);
		 this.rover.executeCommand("l");
		 assertThat("(3,10,W)", is(equalToIgnoringCase( this.rover.executeCommand("bbb"))));
	}
	
	@Test
	public void theRoverMovesBackwardEastBoundedOnceLanding() {
		String command = generateCommand(10, "f");
		 this.rover.executeCommand(command);
		 this.rover.executeCommand("r");
		 this.rover.executeCommand("fffff");
		 assertThat("(2,10,E)", is(equalToIgnoringCase( this.rover.executeCommand("bbb"))));
		 assertThat("(1,10,E)", is(equalToIgnoringCase( this.rover.executeCommand("b"))));
	}
	
	@Test
	public void moveLeftInsideGridOnClearPathNorthBounded() {
		this.rover.executeCommand("fffffrffffffffff");
		this.rover.executeCommand("ll");
		assertThat("(9,5,W)", is(equalToIgnoringCase( this.rover.executeCommand("f"))));
		assertThat("(10,5,W)", is(equalToIgnoringCase( this.rover.executeCommand("b"))));	
	}
	@Test
	public void moveLeftInsideGridOnClearPathSouthBounded() {
		this.rover.executeCommand("fffffrffffffffff");
		this.rover.executeCommand("rr");
		assertThat("(9,5,W)", is(equalToIgnoringCase( this.rover.executeCommand("f"))));
		assertThat("(10,5,W)", is(equalToIgnoringCase( this.rover.executeCommand("b"))));	
	}
	
	@Test
	public void moveRightInsideGridOnClearPathNorthBounded() {
		this.rover.executeCommand("fffffr");
		assertThat("(5,5,E)", is(equalToIgnoringCase( this.rover.executeCommand("fffff"))));
		assertThat("(4,5,E)", is(equalToIgnoringCase( this.rover.executeCommand("b"))));	
	}
	@Test
	public void moveRightInsideGridOnClearPathSouthBounded() {
		this.rover.executeCommand("fffffrffffffffff");
		this.rover.executeCommand("rf");
		this.rover.executeCommand("l");
		assertThat("(11,4,E)", is(equalToIgnoringCase( this.rover.executeCommand("f"))));
		assertThat("(10,4,E)", is(equalToIgnoringCase( this.rover.executeCommand("b"))));	
	}

	
	private String generateCommand(int times,String symbol) {
		String command  = "";
		for (int i = 0; i < times; i++) {
			 command += symbol;
		}
		return command;
	}

}
