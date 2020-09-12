package marsrover;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class US03 {
	
	MarsRover rover;
	@Before
	public void setUp(){
		rover = new MarsRover(100, 100, "");
	}
	
	@Test
	public void theRoverShouldChangeFacingTWhenGivenATurnCommandAfterLanding_1(){
		assertThat("(0,0,W)", is(equalToIgnoringCase( this.rover.executeCommand("l"))));
	}

}
