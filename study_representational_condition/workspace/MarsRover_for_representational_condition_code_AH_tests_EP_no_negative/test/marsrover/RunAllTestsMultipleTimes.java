package marsrover;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

class RunAllTestsMultipleTimes {
	
	static boolean listOfUS [][] = new boolean[512][9];
	static final String name = "./MR_measurements_code_AH_tests_EP_no_negative.csv";
	
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
	static final String name = "./measurements_code_AH_tests_EP_restricted_no_negative.csv";*/
	
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
		fout.println("index,totalAssertions,validAssertions,passedAssertions,PROD,maxPROD");
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
			int passed = 0;
			int total = 0;
			int valid_total = 0;
			for(int i = 1; i <= 9; i++) {
				Class<?> testClass = Class.forName("marsrover.US" + String.format("%02d", i));
				Result result = junit.run(testClass);
				passed += result.getRunCount() - result.getFailureCount();
				total += result.getRunCount();
				if(listOfUS[index][i-1])
					valid_total += result.getRunCount();
			}
			float prod = (float) passed / (float) total * 100;
			float maxProd = (float) valid_total / (float) total * 100;
			fout.println(index + "," + total + "," + valid_total + "," + passed + "," + String.format("%6.2f", prod) + "," + String.format("%6.2f", maxProd));
		}
		fout.close();
		System.out.println("Done!");
	}
}