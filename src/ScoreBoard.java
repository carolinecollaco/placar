import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;


public class ScoreBoard extends JFrame{
	
	private JLabel fighter1Name;
	private JLabel academyF1;
	private JLabel yukoF1;
	private JLabel wazariF1;
	private JLabel ipponF1;
	private JLabel shidoF1;
	private JLabel fighter2Name;
	private JLabel academyF2;
	private JLabel yukoF2;
	private JLabel wazariF2;
	private JLabel ipponF2;
	private JLabel shidoF2;
	private JLabel time;
	private JLabel osaekomi1;
	private JLabel sponsorMessage;
	private Score fighter1;
	private Score fighter2;
	private FightTime fightTime;
	private JLabel osaekomi2;
	
	
	public void setFighter1Name(String stringFighter1Name){
		fighter1Name.setText(stringFighter1Name);
	}
	
	public void setFighter2Name(String stringFighter2Name){
		fighter2Name.setText(stringFighter2Name);		
	}
	
	public void setAcademy1(String stringAcademy1){
		academyF1.setText(stringAcademy1);		
	}
	
	public void setAcademy2(String stringAcademy2){
		academyF2.setText(stringAcademy2);		
	}
	
	public void setSponsorMessage(String stringSponsorMessage){
		sponsorMessage.setText(stringSponsorMessage);		
	}
	
	public void setTime(String stringTime){
		time.setText(stringTime);
	}
	
	public void setFighter1(Score fighter1){
		this.fighter1 = fighter1;
	}
	
	public void setFighter2(Score fighter2){
		this.fighter2 = fighter2;
	}
	
	public ScoreBoard() {
		setResizable(false);
		getContentPane().setEnabled(false);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setForeground(Color.GRAY);
		getContentPane().setForeground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		academyF1 = new JLabel("Academy 1");
		academyF1.setForeground(Color.WHITE);
		academyF1.setBounds(400, 62, 104, 28);
		getContentPane().add(academyF1);
		
		yukoF1 = new JLabel("0");
		yukoF1.setForeground(Color.WHITE);
		yukoF1.setFont(new Font("Dialog", Font.BOLD, 53));
		yukoF1.setBounds(424, 136, 47, 57);
		getContentPane().add(yukoF1);
		
		wazariF1 = new JLabel("0");
		wazariF1.setForeground(Color.WHITE);
		wazariF1.setFont(new Font("Dialog", Font.BOLD, 53));
		wazariF1.setBounds(525, 136, 47, 57);
		getContentPane().add(wazariF1);
		
		ipponF1 = new JLabel("0");
		ipponF1.setForeground(Color.WHITE);
		ipponF1.setFont(new Font("Dialog", Font.BOLD, 53));
		ipponF1.setBounds(626, 136, 47, 57);
		getContentPane().add(ipponF1);
		
		shidoF1 = new JLabel("0");
		shidoF1.setBounds(732, 133, 37, 63);
		getContentPane().add(shidoF1);
		shidoF1.setForeground(Color.RED);
		shidoF1.setFont(new Font("Dialog", Font.BOLD, 53));
		
		JLabel yukoLabelF1 = new JLabel("Yuko");
		yukoLabelF1.setForeground(Color.WHITE);
		yukoLabelF1.setBounds(412, 109, 70, 15);
		getContentPane().add(yukoLabelF1);
		
		JLabel wazariLabelF1 = new JLabel("Wazari");
		wazariLabelF1.setForeground(Color.WHITE);
		wazariLabelF1.setBounds(513, 109, 70, 15);
		getContentPane().add(wazariLabelF1);
		
		JLabel ipponLabelF1 = new JLabel("Ippon");
		ipponLabelF1.setForeground(Color.WHITE);
		ipponLabelF1.setBounds(614, 109, 70, 15);
		getContentPane().add(ipponLabelF1);
		
		JLabel shidoLabelF1 = new JLabel("Shido");
		shidoLabelF1.setForeground(Color.RED);
		shidoLabelF1.setBounds(715, 109, 70, 15);
		getContentPane().add(shidoLabelF1);
		
		academyF2 = new JLabel("Academy 2");
		academyF2.setForeground(Color.BLACK);
		academyF2.setBounds(0, 62, 104, 28);
		getContentPane().add(academyF2);
		
		yukoF2 = new JLabel("0");
		yukoF2.setForeground(Color.BLACK);
		yukoF2.setFont(new Font("Dialog", Font.BOLD, 53));
		yukoF2.setBounds(10, 136, 47, 57);
		getContentPane().add(yukoF2);
		
		wazariF2 = new JLabel("0");
		wazariF2.setForeground(Color.BLACK);
		wazariF2.setFont(new Font("Dialog", Font.BOLD, 53));
		wazariF2.setBounds(108, 136, 47, 57);
		getContentPane().add(wazariF2);
		
		ipponF2 = new JLabel("0");
		ipponF2.setForeground(Color.BLACK);
		ipponF2.setFont(new Font("Dialog", Font.BOLD, 53));
		ipponF2.setBounds(206, 136, 47, 57);
		getContentPane().add(ipponF2);
		
		shidoF2 = new JLabel("0");
		shidoF2.setForeground(Color.RED);
		shidoF2.setFont(new Font("Dialog", Font.BOLD, 53));
		shidoF2.setBounds(304, 133, 37, 63);
		getContentPane().add(shidoF2);
		
		JLabel yukoF2Label = new JLabel("Yuko");
		yukoF2Label.setForeground(Color.BLACK);
		yukoF2Label.setBounds(10, 109, 47, 15);
		getContentPane().add(yukoF2Label);
		
		JLabel wazariF2Label = new JLabel("Wazari");
		wazariF2Label.setForeground(Color.BLACK);
		wazariF2Label.setBounds(96, 109, 70, 15);
		getContentPane().add(wazariF2Label);
		
		JLabel ipponF2Label = new JLabel("Ippon");
		ipponF2Label.setForeground(Color.BLACK);
		ipponF2Label.setBounds(194, 109, 70, 15);
		getContentPane().add(ipponF2Label);
		
		JLabel shidoF2Label = new JLabel("Shido");
		shidoF2Label.setForeground(Color.RED);
		shidoF2Label.setBounds(287, 109, 70, 15);
		getContentPane().add(shidoF2Label);
		
		time = new JLabel("5:00");
		time.setFont(new Font("Dialog", Font.BOLD, 77));
		time.setBounds(308, 367, 202, 83);
		getContentPane().add(time);
		
		osaekomi1 = new JLabel("00");
		osaekomi1.setForeground(Color.WHITE);
		osaekomi1.setFont(new Font("Dialog", Font.BOLD, 75));
		osaekomi1.setBounds(508, 281, 129, 90);
		getContentPane().add(osaekomi1);
		
		JLabel lblOsaekomi1 = new JLabel("Osaekomi");
		lblOsaekomi1.setForeground(Color.WHITE);
		lblOsaekomi1.setFont(new Font("Dialog", Font.BOLD, 34));
		lblOsaekomi1.setBounds(479, 229, 197, 40);
		getContentPane().add(lblOsaekomi1);
		
		sponsorMessage = new JLabel("Hello, drink montain dew!!!");
		sponsorMessage.setBackground(Color.WHITE);
		sponsorMessage.setFont(new Font("Dialog", Font.BOLD, 36));
		sponsorMessage.setVerticalAlignment(SwingConstants.TOP);
		sponsorMessage.setBounds(117, 443, 585, 57);
		getContentPane().add(sponsorMessage);
		
		fighter2Name = new JLabel("Bob Bar");
		fighter2Name.setBounds(0, 0, 234, 63);
		getContentPane().add(fighter2Name);
		fighter2Name.setForeground(Color.BLACK);
		fighter2Name.setFont(new Font("Dialog", Font.BOLD, 53));
		
		osaekomi2 = new JLabel("00");
		osaekomi2.setForeground(Color.BLACK);
		osaekomi2.setFont(new Font("Dialog", Font.BOLD, 75));
		osaekomi2.setBounds(180, 266, 148, 105);
		getContentPane().add(osaekomi2);
		
		fighter1Name = new JLabel("Jhonny Foo");
		fighter1Name.setBounds(400, 0, 335, 63);
		getContentPane().add(fighter1Name);
		fighter1Name.setForeground(Color.WHITE);
		fighter1Name.setFont(new Font("Dialog", Font.BOLD, 53));
		
		JLabel lblOsaekomi2 = new JLabel("Osaekomi");
		lblOsaekomi2.setForeground(Color.BLACK);
		lblOsaekomi2.setFont(new Font("Dialog", Font.BOLD, 34));
		lblOsaekomi2.setBounds(141, 229, 197, 40);
		getContentPane().add(lblOsaekomi2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(375, -63, 444, 431);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(-79, -63, 461, 431);
		getContentPane().add(panel_1);
		
		addKeyListener(new KeyListener() {
		    public void keyPressed(KeyEvent e) {}

		    public void keyReleased(KeyEvent e) {}

		    public void keyTyped(KeyEvent e) {
		    	switch (e.getKeyChar()) {
				case 'q':					
					fighter1.addYuko();
					break;
				case 'w':					
					fighter1.addWazari(); 
					break;
				case 'e':					
					fighter1.setIppon(); 
					break;
				case 'r':					
					fighter1.addShido(); 
					break;
				case 't':					
					fighter1.startOsaekomi(); 
					fightTime.stop();
					break;
				case 'y':					
					fighter1.stopOsaekomi(); 
					fightTime.start();
					break;
				case 'a':					
					fighter2.addYuko();
					break;
				case 's':					
					fighter2.addWazari(); 
					break;
				case 'd':					
					fighter2.setIppon(); 
					break;
				case 'f':					
					fighter2.addShido(); 
					break;
				case 'g':					
					fighter2.startOsaekomi(); 
					fightTime.stop();
					break;
				case 'h':					
					fighter2.stopOsaekomi(); 
					fightTime.start();
					break;
				case '1':
					fightTime.start();
					break;
				}
		    }
		});
	}

	public void setYukkoFighter1(int yukko) {
		yukoF1.setText(yukko + "");		
	}

	public void setYukkoFighter2(int yukko) {
		yukoF2.setText(yukko + "");		
	}

	public void setShidoFighter1(int shido) {
		shidoF1.setText(shido + "");		
	}
	
	public void setShidoFighter2(int shido) {
		shidoF2.setText(shido + "");		
	}

	public void setWazariFighter1(int wazari) {
		wazariF1.setText(wazari + "");		
	}
	
	public void setWazariFighter2(int wazari) {
		wazariF2.setText(wazari + "");		
	}

	public void setYpponFighter1(boolean ippon) {
		if(ippon)
			ipponF1.setText("1");		
	}
	
	public void setYpponFighter2(boolean ippon) {
		if(ippon)
			ipponF2.setText("1");			
	}

	public void setOsaekomiFighter1(long osaekomiFighter1) {
		osaekomi1.setText(osaekomiFighter1 + "");
	}
	
	public void setOsaekomiFighter2(long osaekomiFighter2) {
		osaekomi2.setText(osaekomiFighter2 + "");
	}

	public void setFightTime(FightTime fightTime) {
		this.fightTime = fightTime;
		
	}
}
