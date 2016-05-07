package tasktimer;

import static java.lang.System.out;

import java.util.Scanner;

public class Task1 implements Runnable {

	private Scanner in;
	
	/**
	 * Initialize 
	 */
	public Task1() {
		in =  new Scanner(Dictionary.getWordsAsStream());
	}
	
	/**
	 * For run the task
	 */
	@Override
	public void run() {
		// perform the task
		int count = 0;
		long totalsize = 0;
		while(in.hasNext()) {
			String word = in.next();
			totalsize += word.length();
			count++;
		}
		double averageLength = ((double)totalsize)/(count>0 ? count : 1);
		out.printf("Average length of %,d words is %.2f\n", count, averageLength);
	}

	/**
	 * 
	 * @return String
	 */
	public String toString() {
		return "read words using Scanner and a while loop" ;
	}

}
