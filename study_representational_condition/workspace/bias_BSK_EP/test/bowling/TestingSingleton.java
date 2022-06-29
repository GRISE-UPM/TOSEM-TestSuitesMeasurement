package bowling;

public class TestingSingleton {
	
	public boolean[] US = {
	   false, // 0 -- does not exist
	   true,  // 1
	   true, // 2
	   true, // 3
	   true, // 4
	   true, // 5
	   true, // 6
	   true, // 7
	   true, // 8
	   true, // 9
	   true, // 10
	   true, // 11
	   true, // 12
	   true // 13
};
	
	public void assign(boolean us1,
					   boolean us2,
					   boolean us3,
					   boolean us4,
					   boolean us5,
					   boolean us6,
					   boolean us7,
					   boolean us8,
					   boolean us9,
					   boolean us10,
					   boolean us11,
					   boolean us12,
					   boolean us13) {
		US[1] = us1;
		US[2] = us2;
		US[3] = us3;
		US[4] = us4;
		US[5] = us5;
		US[6] = us6;
		US[7] = us7;
		US[8] = us8;
		US[9] = us9;
		US[10] = us10;
		US[11] = us11;
		US[12] = us12;
		US[13] = us13;
	}
	
	static TestingSingleton reference = null;
	
	public static TestingSingleton getInstance() {
		if(reference == null) {
			reference = new TestingSingleton();
		}
		return reference;
	}

}
