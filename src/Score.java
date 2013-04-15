
public class Score {

	private int wazari;
	private int yuko;
	
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
		return wazari == 2;
	}

	
	
}
