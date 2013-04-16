
public class Score {

	private int wazari;
	private int yuko;
	private CountSeconds osaekomiIppon;
	private CountSeconds osaekomiWazari;
	
	public Score() {
		osaekomiIppon = new CountSeconds();
		osaekomiWazari = new CountSeconds();
	}
	
	public void addWazariAndStartOsaekomi() {
		wazari += 1;
		osaekomiWazari.start();
	}

	public long getTimeOsaekomiWazari() {
		return osaekomiWazari.getTimePassedInSeconds();
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
		if(getOsaekomiIppon()>=25)
			return true;
		else return false;
	
	}

	public void startOsaekomiIppon() {
		osaekomiIppon.start();
	}

	public void stopOsaekomi() {
		osaekomiIppon.stop();	
		osaekomiWazari.stop();
	}

	public long getOsaekomiIppon() {
		long time = osaekomiIppon.getTimePassedInSeconds();
		return time;
	}

	
	
}
