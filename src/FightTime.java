
public class FightTime {
	
	private CountSeconds seconds;
	
	public FightTime() {
		seconds = new CountSeconds();
	}
	
	public void start(){
		seconds.start();
	}
	
	public String minutes(){
		long secondsPassed = seconds.getTimePassedInSeconds();
		long minutes = secondsPassed/60;
		long secondsToShow = secondsPassed%60;
		if(secondsToShow<10){
			return minutes + ":0" + secondsToShow;
		}
		return minutes + ":" + secondsToShow;
	}

}
