package bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus = new Frame();
	private int i = 0;

	public BowlingGame(){}

	public void addFrame(Frame frame) throws InvalidInput{
		if(TestingSingleton.getInstance().US[3]) {
			if (i <= 9) {
				frames.add(frame);
				i++;
			}
		}    		
	}

	public void setBonus(int firstThrow, int secondThrow) {
		bonus = new Frame(firstThrow, secondThrow);
	}

	public int score() throws BowlingException{

		int gameScore = 0;

		for(int index = 0; index < frames.size(); index ++) {
			Frame currentFrame = frames.get(index);

			if (index < frames.size() - 1) {
				if (currentFrame.isStrike() && (TestingSingleton.getInstance().US[5])) {
					Frame nextFrame = frames.get(index + 1);
					if (nextFrame.isStrike() && (TestingSingleton.getInstance().US[8])) {
						if (index < frames.size() - 2) {
							Frame nextNextFrame = frames.get(index + 2);
							gameScore += currentFrame.score() + nextFrame.score() + nextNextFrame.getThrow1();
						} else {
							gameScore += currentFrame.score() + nextFrame.score() + 10;
						}
					} else {
						if(nextFrame.isSpare() && (TestingSingleton.getInstance().US[7]))
							gameScore += currentFrame.score() + nextFrame.score();
						else
							gameScore += currentFrame.score() + nextFrame.score();
					}
				} else if (currentFrame.isSpare() && (TestingSingleton.getInstance().US[6])) {
					Frame nextFrame = frames.get(index + 1);
					if(currentFrame.isSpare() && (TestingSingleton.getInstance().US[9]))
						gameScore += currentFrame.score() + nextFrame.getThrow1();
					else
						gameScore += currentFrame.score() + nextFrame.getThrow1();
				} else {
					gameScore += currentFrame.score();
				}
			} else {
				// Last frame.
				if(index == 9) {
					if (currentFrame.isSpare() && (TestingSingleton.getInstance().US[10]))
						gameScore += currentFrame.score() + bonus.score();
					else 
						if (currentFrame.isStrike() && (TestingSingleton.getInstance().US[11] || TestingSingleton.getInstance().US[12])) 
							gameScore += currentFrame.score() + bonus.score();
						else
							gameScore += currentFrame.score();
				} else
					gameScore += currentFrame.score();
			}
		}

		if(TestingSingleton.getInstance().US[4])
			return gameScore;
		else
			return 0;
	}
	
	public int getSize() {
		return frames.size();
	}
	
	public boolean findBonus() {
		return (getSize() == 10 && (frames.get(9).isSpare() || frames.get(9).isStrike()));
	}

	public int getBonusThrow1() throws BowlingException {
		if(findBonus())
			return bonus.firstThrow;
		else
			throw new BowlingException();
	}

	public int getBonusThrow2() throws BowlingException {
		if(findBonus())
			return bonus.secondThrow;
		else
			throw new BowlingException();
	}
}
