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
    	if (i <= 9) {
    		frames.add(frame);
    		i++;
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
                if (currentFrame.isStrike()) {
                    Frame nextFrame = frames.get(index + 1);
                    if (nextFrame.isStrike()) {
                        if (index < frames.size() - 2) {
                            Frame nextNextFrame = frames.get(index + 2);
                            gameScore += currentFrame.score() + nextFrame.score() + nextNextFrame.getThrow1();
                        } else {
                            gameScore += currentFrame.score() + nextFrame.score() + 10;
                        }
                    } else {
                        gameScore += currentFrame.score() + nextFrame.score();
                    }
                } else if (currentFrame.isSpare()) {
                    Frame nextFrame = frames.get(index + 1);
                    gameScore += currentFrame.score() + nextFrame.getThrow1();
                } else {
                    gameScore += currentFrame.score();
                }
            } else {
                // Last frame.
            	if(index == 9) {
            		if (currentFrame.isSpare() || currentFrame.isStrike()) {
            			gameScore += currentFrame.score() + bonus.score();
            		} else {
            			gameScore += currentFrame.score();
            		}
            	}
            	else {
            		gameScore += currentFrame.score();
            	}
            }
        }

        return gameScore;
    }

/*    public int getScore() {

        int gameScore = 0;
        for (int index = 0; index < frames.size(); index++) {
            gameScore += frames.get(index).score();
        }

        return gameScore;
    }*/

/*    public boolean isNextFrameBonus(){
        //to be implemented
        return false;
    }*/
    
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
