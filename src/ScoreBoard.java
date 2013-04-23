import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;


public class ScoreBoard extends JFrame{
	
	public static void main(String[] args) throws InterruptedException {
		ScoreBoard scoreBoard = new ScoreBoard();
		scoreBoard.setSize(800, 600);
		scoreBoard.setVisible(true);
		String inputResult = JOptionPane.showInputDialog("Nome do primeiro lutador");
		scoreBoard.setFighter1Name(inputResult);
		
		
		FightTime fightTime = new FightTime();
		fightTime.start();
		while(true){
			scoreBoard.setTime(fightTime.minutes());
			Thread.sleep(200);
		}
	}
	
	private JLabel fighter1Name;
	private JLabel academyF1;
	private JLabel yukoF1;
	private JLabel wazariF1;
	private JLabel ipponF1;
	private JLabel shidoF1;
	private JLabel fighterF2Name;
	private JLabel academyF2;
	private JLabel yukoF2;
	private JLabel wazariF2;
	private JLabel ipponF2;
	private JLabel shidoF2;
	private JLabel time;
	private JLabel osaekomi;
	private JLabel sponsorMessage;
	
	public void setFighter1Name(String stringFighter1Name){
		fighter1Name.setText(stringFighter1Name);
	}
	
	public void setTime(String stringTime){
		time.setText(stringTime);
	}
	
	public ScoreBoard() {
		setForeground(Color.GRAY);
		getContentPane().setForeground(Color.BLUE);
		getContentPane().setLayout(null);
		
		fighter1Name = new JLabel("Jhonny Foo");
		fighter1Name.setBounds(10, 0, 331, 63);
		getContentPane().add(fighter1Name);
		fighter1Name.setForeground(Color.WHITE);
		fighter1Name.setFont(new Font("Dialog", Font.BOLD, 53));
		
		academyF1 = new JLabel("Academy 1");
		academyF1.setForeground(Color.WHITE);
		academyF1.setBounds(10, 80, 104, 28);
		getContentPane().add(academyF1);
		
		yukoF1 = new JLabel("0");
		yukoF1.setForeground(Color.WHITE);
		yukoF1.setFont(new Font("Dialog", Font.BOLD, 53));
		yukoF1.setBounds(258, 66, 47, 57);
		getContentPane().add(yukoF1);
		
		wazariF1 = new JLabel("0");
		wazariF1.setForeground(Color.WHITE);
		wazariF1.setFont(new Font("Dialog", Font.BOLD, 53));
		wazariF1.setBounds(358, 66, 47, 57);
		getContentPane().add(wazariF1);
		
		ipponF1 = new JLabel("0");
		ipponF1.setForeground(Color.WHITE);
		ipponF1.setFont(new Font("Dialog", Font.BOLD, 53));
		ipponF1.setBounds(458, 66, 47, 57);
		getContentPane().add(ipponF1);
		
		shidoF1 = new JLabel("0");
		shidoF1.setBounds(558, 63, 37, 63);
		getContentPane().add(shidoF1);
		shidoF1.setForeground(Color.WHITE);
		shidoF1.setFont(new Font("Dialog", Font.BOLD, 53));
		
		JLabel yukoLabelF1 = new JLabel("Yuko");
		yukoLabelF1.setForeground(Color.WHITE);
		yukoLabelF1.setBounds(216, 87, 70, 15);
		getContentPane().add(yukoLabelF1);
		
		JLabel wazariLabelF1 = new JLabel("Wazari");
		wazariLabelF1.setForeground(Color.WHITE);
		wazariLabelF1.setBounds(305, 87, 70, 15);
		getContentPane().add(wazariLabelF1);
		
		JLabel ipponLabelF1 = new JLabel("Ippon");
		ipponLabelF1.setForeground(Color.WHITE);
		ipponLabelF1.setBounds(415, 87, 70, 15);
		getContentPane().add(ipponLabelF1);
		
		JLabel shidoLabelF1 = new JLabel("Shido");
		shidoLabelF1.setForeground(Color.WHITE);
		shidoLabelF1.setBounds(515, 87, 70, 15);
		getContentPane().add(shidoLabelF1);
		
		fighterF2Name = new JLabel("Bob Bar");
		fighterF2Name.setForeground(Color.BLACK);
		fighterF2Name.setFont(new Font("Dialog", Font.BOLD, 53));
		fighterF2Name.setBounds(10, 120, 331, 63);
		getContentPane().add(fighterF2Name);
		
		academyF2 = new JLabel("Academy 2");
		academyF2.setForeground(Color.BLACK);
		academyF2.setBounds(10, 199, 104, 28);
		getContentPane().add(academyF2);
		
		yukoF2 = new JLabel("0");
		yukoF2.setForeground(Color.BLACK);
		yukoF2.setFont(new Font("Dialog", Font.BOLD, 53));
		yukoF2.setBounds(258, 185, 47, 57);
		getContentPane().add(yukoF2);
		
		wazariF2 = new JLabel("0");
		wazariF2.setForeground(Color.BLACK);
		wazariF2.setFont(new Font("Dialog", Font.BOLD, 53));
		wazariF2.setBounds(358, 185, 47, 57);
		getContentPane().add(wazariF2);
		
		ipponF2 = new JLabel("0");
		ipponF2.setForeground(Color.BLACK);
		ipponF2.setFont(new Font("Dialog", Font.BOLD, 53));
		ipponF2.setBounds(458, 185, 47, 57);
		getContentPane().add(ipponF2);
		
		shidoF2 = new JLabel("0");
		shidoF2.setForeground(Color.BLACK);
		shidoF2.setFont(new Font("Dialog", Font.BOLD, 53));
		shidoF2.setBounds(558, 182, 37, 63);
		getContentPane().add(shidoF2);
		
		JLabel yukoF2Label = new JLabel("Yuko");
		yukoF2Label.setForeground(Color.BLACK);
		yukoF2Label.setBounds(216, 206, 70, 15);
		getContentPane().add(yukoF2Label);
		
		JLabel wazariF2Label = new JLabel("Wazari");
		wazariF2Label.setForeground(Color.BLACK);
		wazariF2Label.setBounds(305, 206, 70, 15);
		getContentPane().add(wazariF2Label);
		
		JLabel ipponF2Label = new JLabel("Ippon");
		ipponF2Label.setForeground(Color.BLACK);
		ipponF2Label.setBounds(415, 206, 70, 15);
		getContentPane().add(ipponF2Label);
		
		JLabel shidoF2Label = new JLabel("Shido");
		shidoF2Label.setForeground(Color.BLACK);
		shidoF2Label.setBounds(515, 206, 70, 15);
		getContentPane().add(shidoF2Label);
		
		time = new JLabel("5:00");
		time.setFont(new Font("Dialog", Font.BOLD, 77));
		time.setBounds(12, 258, 202, 83);
		getContentPane().add(time);
		
		osaekomi = new JLabel("00");
		osaekomi.setFont(new Font("Dialog", Font.BOLD, 75));
		osaekomi.setBounds(483, 254, 112, 89);
		getContentPane().add(osaekomi);
		
		JLabel lblOsaekomi = new JLabel("Osaekomi");
		lblOsaekomi.setFont(new Font("Dialog", Font.BOLD, 34));
		lblOsaekomi.setBounds(268, 254, 197, 40);
		getContentPane().add(lblOsaekomi);
		
		sponsorMessage = new JLabel("Hello, drink montain dew!!!");
		sponsorMessage.setBackground(Color.WHITE);
		sponsorMessage.setFont(new Font("Dialog", Font.BOLD, 36));
		sponsorMessage.setVerticalAlignment(SwingConstants.TOP);
		sponsorMessage.setBounds(10, 362, 585, 57);
		getContentPane().add(sponsorMessage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 130, 608, 126);
		getContentPane().add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 608, 126);
		getContentPane().add(panel);
	}
}
