package tasktimer;

/**
 * 
 * @author Benyapa Suesattabongkot
 *
 */

public class StopWatch {
	
	/**
	 * Create attributes
	 */
	private long startTime;
	private long stopTime;
	private boolean running;
	
	public void start() {
		running = true;
		startTime = System.nanoTime();
	}
	
	public void stop() {
		running = false;
		stopTime = System.nanoTime();
	}
	
	/**
	 * 
	 * @return Get used time
	 */
	public double getElapsed() {
		return (stopTime - startTime)*1.0E-9;
	}

}
