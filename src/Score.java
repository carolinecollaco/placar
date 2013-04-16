
public class Score {

	private int wazari;
	private int yuko;
	private CountSeconds osaekomi;
	
	public Score() {
		osaekomi = new CountSeconds();
	}
	
	public void addWazari() {
		wazari += 1;
	}

	public int getWazari() {
		return wazari;
	}
	
	public void addYuko() {
		yuko += 1;		
		if(yuko==2){
			wazari += 1;
			yuko= 0;
		}
	}
	
	public int getYukko() {		
		return yuko;
	}

	public boolean isIppon() {
		if(wazari == 2)
			return true;
		if(getOsaekomiTime()>=25)
			return true;
		else return false;
	
	}

	public void startOsaekomi() {
		osaekomi.start();
	}

	public void stopOsaekomi() {
		osaekomi.stop();		
	}

	public long getOsaekomiTime() {
		long time = osaekomi.getTimePassedInSeconds();
		return time;
	}

	
	
}
