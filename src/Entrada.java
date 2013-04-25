import javax.swing.JOptionPane;


public class Entrada {

	public static void main(String[] args) throws InterruptedException {
		ScoreBoard scoreBoard = new ScoreBoard();
		scoreBoard.setSize(800, 600);
		String fighter1Name = JOptionPane.showInputDialog("Nome do primeiro competidor");
		String academyF1 = JOptionPane.showInputDialog("Academia do primeiro competidor");
		String fighter2Name = JOptionPane.showInputDialog("Nome do segundo competidor");
		String academyF2 = JOptionPane.showInputDialog("Academia do segundo competidor");
		String sponsorMessage = JOptionPane.showInputDialog("Mensagem do patrocinador ou avisos");
		
		scoreBoard.setFighter1Name(fighter1Name);
		scoreBoard.setAcademy1(academyF1);
		scoreBoard.setFighter2Name(fighter2Name);		
		scoreBoard.setAcademy2(academyF2);
		scoreBoard.setSponsorMessage(sponsorMessage);
		scoreBoard.setVisible(true);
		
		Score scoreFighter1 = new Score();
		Score scoreFighter2 = new Score();
		
		scoreFighter1.setOponent(scoreFighter2);
		scoreFighter2.setOponent(scoreFighter1);
		scoreBoard.setFighter1(scoreFighter1);
		scoreBoard.setFighter2(scoreFighter2);
				
		FightTime fightTime = new FightTime();
		scoreBoard.setFightTime(fightTime);
		while(true){
			scoreBoard.setTime(fightTime.minutes());
			scoreBoard.setOsaekomiFighter1(scoreFighter1.getOsaekomi());
			scoreBoard.setOsaekomiFighter2(scoreFighter2.getOsaekomi());
			scoreBoard.setYukkoFighter1(scoreFighter1.getYukko());
			scoreBoard.setYukkoFighter2(scoreFighter2.getYukko());
			scoreBoard.setWazariFighter1(scoreFighter1.getWazari());
			scoreBoard.setWazariFighter2(scoreFighter2.getWazari());
			scoreBoard.setYpponFighter1(scoreFighter1.isIppon());
			scoreBoard.setYpponFighter2(scoreFighter2.isIppon());			
			scoreBoard.setShidoFighter1(scoreFighter1.getShido());
			scoreBoard.setShidoFighter2(scoreFighter2.getShido());
			
			Thread.sleep(200); //espera 200 milisegundos para continua executando
		}
	}

}
