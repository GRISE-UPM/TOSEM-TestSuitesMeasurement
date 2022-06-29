package marsrover;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

class RunAllTestsMultipleTimes {
	
	static boolean listOfUS [][] = new boolean[512][9];
	static final String name = "../../bias_MR_EP.csv";
	
/*	static boolean listOfUS [][] = {
			{false, false, false, false, false, false, false, false, false},
			{true, false, false, false, false, false, false, false, false},
			{true, true, false, false, false, false, false, false, false},
			{true, true, true, false, false, false, false, false, false},
			{true, true, true, true, false, false, false, false, false},
			{true, true, true, true, true, false, false, false, false},
			{true, true, true, true, true, true, false, false, false},
			{true, true, true, true, true, true, true, false, false},
			{true, true, true, true, true, true, true, true, false},
			{true, true, true, true, true, true, true, true, true}
	};
	static final String name = "./measurements_code_AH_tests_AH_restricted.csv";*/
	
	static boolean sum [][] = {
			{false, false, false, false, false},
			{false, true, false, true, false},
			{true, false, false, true, false},
			{true, true, false, false, true},
			{false, false, true, true, false},
			{false, true, true, false, true},
			{true, false, true, false, true},
			{true, true, true, true, true},
	};
	
	static void generate() {
		setFirstFalse(listOfUS[0]);
		for(int i = 1; i < 512; i++) {
			listOfUS[i] = addOne(listOfUS[i-1]);
		}	
	}
	
	private static boolean[] addOne(boolean[] bs) {
		boolean result[] = new boolean[11];
		boolean carry = false;
		for(int i = 0; i < 9; i++) {
			if(i == 0){
				result[i] = addOneBit(bs[i], true, carry);
				carry = addOneCarry(bs[i], true, carry);
			} else {
				result[i] = addOneBit(bs[i], false, carry);
				carry = addOneCarry(bs[i], false, carry);
			}

		}
		return result;
	}

	private static boolean addOneCarry(boolean b, boolean value, boolean carry) {
		boolean result = false;
		for(int i = 0; i < 9; i++)
			if((sum[i][0] == b) && (sum[i][1] == value) && (sum[i][2] == carry)) {
				result = sum[i][4];
				break;
			}
		return result;
	}

	private static boolean addOneBit(boolean b, boolean value, boolean carry) {
		boolean result = false;
		for(int i = 0; i < 9; i++)
			if((sum[i][0] == b) && (sum[i][1] == value) && (sum[i][2] == carry)) {
				result = sum[i][3];
				break;
			}
		return result;
	}

	private static void setFirstFalse(boolean[] bs) {
		for (int i = 0; i < 9; i++)
			bs[i] = false;
	}

	
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {

		PrintWriter fout = new PrintWriter(new FileOutputStream(name));
		fout.println("index,totalAssertions,validAssertions,passedAssertions,totalAssertionsforQLTY,measuredPROD,referencePROD, measuredUS, referenceUS, measuredQLTY, referenceQLTY");
		generate();
		
		for(int index = 0; index < listOfUS.length; index++) {
			TestingSingleton.getInstance().assign(listOfUS[index][0], 
					listOfUS[index][1],
					listOfUS[index][2],
					listOfUS[index][3],
					listOfUS[index][4],
					listOfUS[index][5],
					listOfUS[index][6],
					listOfUS[index][7],
					listOfUS[index][8]);
			JUnitCore junit = new JUnitCore();
			int passedAssertions = 0;
			int totalAssertions = 0;
			int totalAssertionsforQLTY = 0;
			int validAssertions = 0;
			int referenceUS = 0;
			int measuredUS = 0;
			for(int i = 1; i <= 9; i++) {
				Class<?> testClass = Class.forName("marsrover.US" + String.format("%02d", i));
				Result result = junit.run(testClass);
				passedAssertions += result.getRunCount() - result.getFailureCount();
				totalAssertions += result.getRunCount();
				if(result.getRunCount() - result.getFailureCount() > 0) {
					measuredUS++;
					totalAssertionsforQLTY += result.getRunCount();
				}
				if(listOfUS[index][i-1]) {
					validAssertions += result.getRunCount();
					referenceUS++;
				}
			}
			float measuredPROD = (float) passedAssertions / (float) totalAssertions * 100;
			float referencePROD = (float) validAssertions / (float) totalAssertions * 100;
			float measuredQLTY = totalAssertionsforQLTY == 0 ? (float) 0 : (float) passedAssertions / (float) totalAssertionsforQLTY * 100;
			float referenceQLTY = referenceUS == 0 ? (float) 0 : (float) 100;
			
			fout.println(index + "," + totalAssertions + "," + validAssertions + "," + passedAssertions + "," + totalAssertionsforQLTY + "," + 
			             String.format("%6.2f", measuredPROD) + "," + String.format("%6.2f", referencePROD) + "," +
			             measuredUS + "," + referenceUS + "," +
			             String.format("%6.2f", measuredQLTY) + "," + String.format("%6.2f", referenceQLTY));
		}
		fout.close();
		System.out.println("Done!");
	}
}