package bowling;

public class Frame {

    int firstThrow;
    int secondThrow;

    public Frame() {
        this.firstThrow = 0;
        this.secondThrow = 0;
    }

    public Frame(int firstThrow, int secondThrow) {
        this.firstThrow = firstThrow;
        this.secondThrow = secondThrow;
    }

    //the score of a single frame
    public int score(){
    	if(TestingSingleton.getInstance().US[2])
    		return firstThrow + secondThrow;
    	else
    		return 0;
    }

    public int getThrow1() {
    	if(TestingSingleton.getInstance().US[1])
    		return firstThrow;
    	else
    		return 0;
    }

    public int getThrow2() {
    	if(TestingSingleton.getInstance().US[1])
            return secondThrow;
    	else
    		return 0;
    }

    //returns whether the frame is a strike or not
    public boolean isStrike(){
    	if(TestingSingleton.getInstance().US[5])
    		return firstThrow == 10 && secondThrow == 0;
    	else
    		return false;
    }

    //return whether a frame is a spare or not
    public boolean isSpare(){
    	if(TestingSingleton.getInstance().US[6])
    		return firstThrow != 10 && firstThrow + secondThrow == 10;
    	else
    		return false;
    }
}
