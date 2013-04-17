/**
 * Na classe score temos os tipos de pontuações que podem existir em uma competição de Judô
 * Temos também o tempo de osaekomi, que pode resultar em uma pontuação proporcioanal ao tempo adquirido.
 * @author Caroline Collaço and
 * @version 2013.17.03
 */
public class Score {
	//pontuação wazari
	private int wazari;
	//pontuaçãp yuko
	private int yuko;
	//tempo de osaekomi quando é equivalente a um Ippon
	private CountSeconds osaekomiIppon;
	//tempo de osaekomi quando é equivalente a um Wazari
	private CountSeconds osaekomiWazari;
	//tempo de osaekomi quando é equivalente a um Yuko
	private CountSeconds osaekomiYuko;

	public Score() {
		osaekomiIppon = new CountSeconds();
		osaekomiWazari = new CountSeconds();
		osaekomiYuko = new CountSeconds();
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
		osaekomiYuko.start();
	}

	public long getTimeOsaekomiYuko() {
		return osaekomiYuko.getTimePassedInSeconds();
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
