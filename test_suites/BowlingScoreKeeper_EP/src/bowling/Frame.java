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
        return firstThrow + secondThrow;
    }

    public int getThrow1() {
        return firstThrow;
    }

    public int getThrow2() {
        return secondThrow;
    }

    //returns whether the frame is a strike or not
    public boolean isStrike(){
        return firstThrow == 10 && secondThrow == 0;
    }

    //return whether a frame is a spare or not
    public boolean isSpare(){
        return firstThrow != 10 && firstThrow + secondThrow == 10;
    }

/*    //return whether this is the last frame of the match
    public boolean isLastFrame(){
        //to be implemented
        return false;
    }

    //bonus throws
    public int bonus(){
        //to be implemented
        return 0;
    }*/
}
