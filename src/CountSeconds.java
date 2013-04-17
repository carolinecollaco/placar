
public class CountSeconds {

	private long start;
	private long timePassedInSeconds;

	public void start() {
		start = System.currentTimeMillis()/1000;
		timePassedInSeconds = 0;
	}

	public long getTimePassedInSeconds() {
		if(timePassedInSeconds==0)
			return System.currentTimeMillis()/1000 - start;
		else
			return timePassedInSeconds;		
	}

	public void stop() {	
		timePassedInSeconds = System.currentTimeMillis()/1000 - start;
	}
		

}
