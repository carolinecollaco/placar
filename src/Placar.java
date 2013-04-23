import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;


public class Placar extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private final JTextPane txtpnIpponAzul = new JTextPane();
	private final JTextPane txtpnWazariAzul = new JTextPane();
	private final JTextPane txtpnYukoAzul = new JTextPane();
	private final JTextPane textPane = new JTextPane();
	private final JTextPane textPane_1 = new JTextPane();
	private final JTextPane textPane_2 = new JTextPane();
	private final JButton btnNewButton_3 = new JButton("Start");
	private final JButton btnNewButton_4 = new JButton("Stop");
	private final JTextPane textPaneOsaekomi = new JTextPane();
	private final JPanel panel_1 = new JPanel();
	private final JTextPane textPaneIpponBranco = new JTextPane();
	private final JTextPane textPaneWazariBranco = new JTextPane();
	private final JTextPane textPaneYukoBranco = new JTextPane();
	private final JTextPane textPane_7 = new JTextPane();
	private final JTextPane textPane_8 = new JTextPane();
	private final JTextPane textPane_9 = new JTextPane();
	private final JButton button_3 = new JButton("Start");
	private final JButton button_4 = new JButton("Stop");
	private final JTextPane textPane_10 = new JTextPane();
	private final JTextPane txtpnOsaekomi = new JTextPane();
	private final JTextPane textPaneShidoAzul = new JTextPane();
	private final JTextPane textPane_11 = new JTextPane();
	private final JTextPane textPaneShidoBranco = new JTextPane();
	private final JTextPane textPane_5 = new JTextPane();
	private final JTextPane textPaneTempoDaLuta = new JTextPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Placar frame = new Placar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Placar() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(Color.BLUE);
		panel.setBounds(12, 0, 392, 561);
		
		contentPane.add(panel);
		panel.setLayout(null);
		txtpnIpponAzul.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtpnIpponAzul.setBackground(Color.BLUE);
		txtpnIpponAzul.setText("Ippon");
		txtpnIpponAzul.setBounds(20, 170, 89, 26);
		
		panel.add(txtpnIpponAzul);
		txtpnWazariAzul.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtpnWazariAzul.setBackground(Color.BLUE);
		txtpnWazariAzul.setText("Wazari");
		txtpnWazariAzul.setBounds(154, 170, 89, 26);
		
		panel.add(txtpnWazariAzul);
		txtpnYukoAzul.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtpnYukoAzul.setBackground(Color.BLUE);
		txtpnYukoAzul.setText("Yuko");
		txtpnYukoAzul.setBounds(293, 170, 89, 26);
		
		panel.add(txtpnYukoAzul);
		textPane.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setText("0");
		textPane.setBounds(20, 200, 89, 26);
		
		panel.add(textPane);
		textPane_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setText("0");
		textPane_1.setBounds(154, 200, 89, 26);
		
		panel.add(textPane_1);
		textPane_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPane_2.setBackground(Color.LIGHT_GRAY);
		textPane_2.setText("0");
		textPane_2.setBounds(293, 200, 89, 26);
		
		panel.add(textPane_2);
		btnNewButton_3.setBounds(154, 527, 89, 23);
		
		panel.add(btnNewButton_3);
		btnNewButton_4.setBounds(253, 527, 89, 23);
		
		panel.add(btnNewButton_4);
		textPaneOsaekomi.setBackground(Color.LIGHT_GRAY);
		textPaneOsaekomi.setBounds(195, 493, 89, 26);
		
		panel.add(textPaneOsaekomi);
		txtpnOsaekomi.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtpnOsaekomi.setBackground(Color.BLUE);
		txtpnOsaekomi.setForeground(Color.BLACK);
		txtpnOsaekomi.setText("Osaekomi");
		txtpnOsaekomi.setBounds(190, 459, 150, 23);
		
		panel.add(txtpnOsaekomi);
		textPaneShidoAzul.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPaneShidoAzul.setBackground(Color.BLUE);
		textPaneShidoAzul.setText("Shido");
		textPaneShidoAzul.setBounds(20, 250, 89, 26);
		
		panel.add(textPaneShidoAzul);
		textPane_11.setText("0");
		textPane_11.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPane_11.setBackground(Color.LIGHT_GRAY);
		textPane_11.setBounds(20, 280, 89, 26);
		
		panel.add(textPane_11);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(392, 0, 392, 561);
		
		contentPane.add(panel_1);
		textPaneIpponBranco.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPaneIpponBranco.setBackground(Color.WHITE);
		textPaneIpponBranco.setText("Ippon");
		textPaneIpponBranco.setBounds(20, 170, 89, 26);
		
		panel_1.add(textPaneIpponBranco);
		textPaneWazariBranco.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPaneWazariBranco.setBackground(Color.WHITE);
		textPaneWazariBranco.setText("Wazari");
		textPaneWazariBranco.setBounds(154, 170, 89, 26);
		
		panel_1.add(textPaneWazariBranco);
		textPaneYukoBranco.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPaneYukoBranco.setBackground(Color.WHITE);
		textPaneYukoBranco.setText("Yuko");
		textPaneYukoBranco.setBounds(293, 170, 89, 26);
		
		panel_1.add(textPaneYukoBranco);
		textPane_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPane_7.setBackground(Color.LIGHT_GRAY);
		textPane_7.setText("0");
		textPane_7.setBounds(20, 200, 89, 26);
		
		panel_1.add(textPane_7);
		textPane_8.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPane_8.setBackground(Color.LIGHT_GRAY);
		textPane_8.setText("0");
		textPane_8.setBounds(154, 200, 89, 26);
		
		panel_1.add(textPane_8);
		textPane_9.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPane_9.setBackground(Color.LIGHT_GRAY);
		textPane_9.setText("0");
		textPane_9.setBounds(293, 200, 89, 26);
		
		panel_1.add(textPane_9);
		button_3.setBounds(154, 527, 89, 23);
		
		panel_1.add(button_3);
		button_4.setBounds(253, 527, 89, 23);
		
		panel_1.add(button_4);
		textPane_10.setBackground(Color.LIGHT_GRAY);
		textPane_10.setBounds(202, 493, 89, 26);
		
		panel_1.add(textPane_10);
		textPaneShidoBranco.setText("Shido");
		textPaneShidoBranco.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPaneShidoBranco.setBackground(Color.WHITE);
		textPaneShidoBranco.setBounds(20, 250, 89, 26);
		
		panel_1.add(textPaneShidoBranco);
		textPane_5.setText("0");
		textPane_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPane_5.setBackground(Color.LIGHT_GRAY);
		textPane_5.setBounds(20, 280, 89, 26);
		
		panel_1.add(textPane_5);
		textPaneTempoDaLuta.setText("Tempo da Luta");
		textPaneTempoDaLuta.setForeground(Color.BLACK);
		textPaneTempoDaLuta.setFont(new Font("Dialog", Font.PLAIN, 20));
		textPaneTempoDaLuta.setBackground(Color.WHITE);
		textPaneTempoDaLuta.setBounds(172, 459, 200, 23);
		
		panel_1.add(textPaneTempoDaLuta);
	}
}