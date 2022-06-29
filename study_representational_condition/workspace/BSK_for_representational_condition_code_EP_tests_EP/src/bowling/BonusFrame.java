package bowling;

public class BonusFrame {

	public int firstThrow;
	public int secondThrow;

	public BonusFrame(int firstThrow, int secondThrow) {
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}

	public int score() {
		return firstThrow + secondThrow;
	}

}
