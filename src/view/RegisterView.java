package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class RegisterView {
	
	private JPanel RegisterViewPanel;
	
	public RegisterView(JFrame frame) {
		RegisterViewPanel = new JPanel();
		RegisterViewPanel.setBounds(0, 0, 800, 600);
		RegisterViewPanel.setLayout(null);
		frame.getContentPane().add(RegisterViewPanel);
		
		JPanel TitlePanel = new JPanel();
		TitlePanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		TitlePanel.setBackground(new Color(255, 255, 255));
		TitlePanel.setBounds(100, 18, 588, 141);
		RegisterViewPanel.add(TitlePanel);
		TitlePanel.setLayout(null);
		
		JLabel TitleLaplePart1 = new JLabel("YORKU Equipment ");
		TitleLaplePart1.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLaplePart1.setBounds(6, 6, 576, 63);
		TitleLaplePart1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		TitlePanel.add(TitleLaplePart1);
		
		JLabel TitleLabelPart2 = new JLabel("Registration Platform");
		TitleLabelPart2.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabelPart2.setFont(new Font("Times New Roman", Font.BOLD, 35));
		TitleLabelPart2.setBounds(6, 72, 576, 63);
		TitlePanel.add(TitleLabelPart2);
		
		JLabel RegisterLabel = new JLabel("Register");
		RegisterLabel.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		RegisterLabel.setBounds(100, 155, 588, 63);
		RegisterViewPanel.add(RegisterLabel);
		
		frame.getContentPane().setVisible(true);

	}

}
