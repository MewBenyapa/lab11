package tasktimer;

import static java.lang.System.out;
 // hack, using AtomicInteger as accumulator

/**
 * Time how long it takes to perform some tasks
 * using different programming constructs.
 * 
 * TODO Improve this code by restructuring it to eliminate duplicate code.
 */
public class TaskTimer {

	public static void execAndPrint(Runnable task) {
		System.out.println("Starting Task: " + task.toString());
		StopWatch watch = new StopWatch();
		watch.start();
		task.run();
		watch.stop();
		out.printf("Elapsed time is %f sec\n",watch.getElapsed());
	}


	/** Run all the tasks. */
	public static void main(String [] args) {
		
		Task1 task1 = new Task1();
		execAndPrint(task1);
		
		Task2 task2 = new Task2();
		execAndPrint(task2);
		
		Task3 task3 = new Task3();
		execAndPrint(task3);
		
		Task4 task4 = new Task4();
		execAndPrint(task4);
		
		Task5 task5 = new Task5();
		execAndPrint(task5);
		
		Task6 task6 = new Task6();
		execAndPrint(task6);
	}

}
