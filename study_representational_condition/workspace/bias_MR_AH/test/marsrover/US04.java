package marsrover;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class US04 {
	
	MarsRover rover;
	@Before
	public void setUp(){
		rover = new MarsRover(100, 100, "");
	}
	
	@Test
	public void theRoverMovesForwardOnceLanding() {
		assertThat("(0,1,N)", is(equalToIgnoringCase(this.rover.executeCommand("f"))));
		assertThat("(0,2,N)", is(equalToIgnoringCase(this.rover.executeCommand("f"))));
	}
	
	@Test
	public void theRoverMovesBackwardsnceLanding() {
		this.rover.executeCommand("f");
		assertThat("(0,0,N)", is(equalToIgnoringCase(this.rover.executeCommand("b"))));
	}
	
	@Test
	public void theRoverMovesForwardNorthBoundedOnceLanding() {
		String command = generateCommand(10, "f");
		assertThat("(0,10,N)", is(equalToIgnoringCase(this.rover.executeCommand(command))));
		assertThat("(0,11,N)", is(equalToIgnoringCase(this.rover.executeCommand("f"))));
	}
	
	private String generateCommand(int times,String symbol) {
		String command  = "";
		for (int i = 0; i < times; i++) {
			 command += symbol;
		}
		return command;
	}

}
