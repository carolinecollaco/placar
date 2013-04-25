
public class FightTime {
	
	private long startTimeMiliseconds;
	
	private long timePassedInMiliseconds;

	private boolean stopped = true;
	
	public void start() {
		stopped = false;
		startTimeMiliseconds = System.currentTimeMillis()-timePassedInMiliseconds;
	}
	
	public long getTimePassedInSeconds() {
		if(startTimeMiliseconds==0)
			return 0;
		if(stopped)
			return timePassedInMiliseconds/1000;		
		return (System.currentTimeMillis() - startTimeMiliseconds)/1000;
	}
	
	public void stop() {	
		stopped = true;
		timePassedInMiliseconds = System.currentTimeMillis() - startTimeMiliseconds;
	}

	
	public String minutes(){
		long secondsPassed = getTimePassedInSeconds();
		long minutes = secondsPassed/60;
		long secondsToShow = secondsPassed%60;
		if(secondsToShow<10){
			return minutes + ":0" + secondsToShow;
		}
		return minutes + ":" + secondsToShow;
	}

}
