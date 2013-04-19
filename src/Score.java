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

    private CountSeconds osaekomi;


    public Score() {
        osaekomi = new CountSeconds();      
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
    
    public void addWazari() {
        wazari += 1;
                
    }

    public int getWazari() {
        return wazari;
    }
    

    public boolean isIppon() {
        if(wazari == 2)
            return true;
        if(getOsaekomi()>=25)
            return true;
        else return false;    
    }

    public void startOsaekomi() {
        osaekomi.start();   
    }
    
    public void stopOsaekomi() {
        osaekomi.stop();    
         if(getOsaekomi() >= 15 && getOsaekomi() < 20){
             yuko += 1; 
        }    
        if(getOsaekomi() >= 20 && getOsaekomi() < 25){
            wazari += 1;
        }       
    }

    public long getOsaekomi() {
        return osaekomi.getTimePassedInSeconds();
    }   
    
}
