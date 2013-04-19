/**
 * Na classe CountSeconds, temos um crônometro que nos dá o tempo em segundos.
 * Ela é utilizada para contar o tempo de osaekomi na classe score.
 * @author Caroline Collaço and
 * @version 2013.17.03
 */
public class CountSeconds {
	//momento que o cronômetro foi acionado
	private long start;
	//tempo que se passou em segundos
	private long timePassedInSeconds;
	/**
	 * Nos retorna um valor quando o crônometro é acionado 
	 * usando o método System.currentTimeMillis().Esse método nos da quantos
	 * milisegundos se passou desde 1 de janeiro de 1970 até hoje.
	 * Dividimos o valor que temos como resultado por 1000 para termos o tempo em segundos.
	 */
	public void start() {
		start = System.currentTimeMillis()/1000;
		timePassedInSeconds = 0;
	}
	/**
	 * Nos dá quanto tempo se passou desde que o crônometro foi acionado.
	 */
	public long getTimePassedInSeconds() {
		if(timePassedInSeconds==0)
			return System.currentTimeMillis()/1000 - start;
		else
			return timePassedInSeconds;		
	}
	/**
	 * Nos dá quanto tempo se passou desde que o crônometro foi acionado até que é dado o stop.
	 */
	public void stop() {	
		timePassedInSeconds = System.currentTimeMillis()/1000 - start;
	}
		

}
