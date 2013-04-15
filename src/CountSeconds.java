
public class CountSeconds {

	private long start;
	private long timePassedInSeconds;

	public void start() {
		start = System.currentTimeMillis()/1000;	
	}

	public long getTimePassedInSeconds() {
		return timePassedInSeconds;
	}

	public void stop() {	
		timePassedInSeconds = System.currentTimeMillis()/1000 - start;
	}
		

}
