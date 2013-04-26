/**
 * Na classe score temos os tipos de pontuações que podem existir em uma competição de Judô
 * Temos também o tempo de osaekomi, que pode resultar em uma pontuação proporcional ao tempo adquirido.
 * @author Caroline Collaço and Francisco Fadel Peniche
 * @version 2013.17.03
 */
public class Score {
    //Declaração das pontuações e contador de tempo
    private int wazari;
    
    private int yuko;

    private CountSeconds osaekomi;
    
    private int shido;
    
    private Score oponentScore;
    
    private boolean ippon = false;

    //classe construtora
    public Score() {
        osaekomi = new CountSeconds();      
    }
    //passagem the parametros para uma instancia da classe
    public void setOponent(Score oponentScore){
        this.oponentScore = oponentScore;
    }
    //incrementos e verificação de pontuação
    public void addYuko() {
        yuko += 1;       
    }
        
    public int getYukko() {     
        return yuko;
    }
    
    public void addWazari() {
        wazari += 1;
        if (wazari >= 2){
            isIppon();
        }
    }

    public int getWazari() {
        return wazari;
    }
    

    public boolean isIppon() {
        if(ippon)
            return true;
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
        if(getOsaekomi() >= 25){
            isIppon();
        }
    }

    public long getOsaekomi() {
        return osaekomi.getTimePassedInSeconds();
    }   
    //incrementos de penalidades
    public void addShido() {
        shido += 1;      
        if(shido==2)
            oponentScore.addYuko();
        if(shido==3)
            oponentScore.addWazari();
        if(shido==4){
            oponentScore.addWazari();
            oponentScore.isIppon();
        }
        if(shido==5){
            oponentScore.addWazari();    
            oponentScore.addWazari();
        }
    } 
    
    public int getShido(){
        return shido;
    }

    public void setIppon() {
        ippon = true;
        
    }
}
