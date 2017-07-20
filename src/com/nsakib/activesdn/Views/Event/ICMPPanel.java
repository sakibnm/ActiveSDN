package com.nsakib.activesdn.Views.Event;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ICMPPanel extends JPanel {
	JTextField textTos;
	JTextField textTtl;
	JTextField textProto;
	JTextField textWindow;
	JTextField textCount;
	JTextField textSrc;
	JTextField textDest;

	/**
	 * Create the panel.
	 */
	public ICMPPanel() {
		setLayout(null);
		setBounds(6, 51, 438, 328);
		
		JLabel label = new JLabel("Attributes");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label.setBounds(43, 18, 79, 16);
		add(label);
		
		textTos = new JTextField();
		textTos.setColumns(10);
		textTos.setBounds(164, 36, 130, 26);
		add(textTos);
		
		JLabel label_1 = new JLabel("TOS");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setBounds(73, 41, 79, 16);
		add(label_1);
		
		JLabel label_2 = new JLabel("TTL");
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setBounds(73, 74, 79, 16);
		add(label_2);
		
		textTtl = new JTextField();
		textTtl.setColumns(10);
		textTtl.setBounds(164, 69, 130, 26);
		add(textTtl);
		
		textProto = new JTextField();
		textProto.setColumns(10);
		textProto.setBounds(164, 102, 130, 26);
		add(textProto);
		
		JLabel label_3 = new JLabel("Protocol");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setBounds(73, 107, 79, 16);
		add(label_3);
		
		JLabel label_4 = new JLabel("Pattern");
		label_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_4.setBounds(43, 234, 79, 16);
		add(label_4);
		
		JLabel label_5 = new JLabel("Window");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(105, 262, 79, 16);
		add(label_5);
		
		JLabel label_6 = new JLabel("Count");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(292, 262, 79, 16);
		add(label_6);
		
		textWindow = new JTextField();
		textWindow.setColumns(10);
		textWindow.setBounds(86, 283, 130, 26);
		add(textWindow);
		
		textCount = new JTextField();
		textCount.setColumns(10);
		textCount.setBounds(274, 283, 130, 26);
		add(textCount);
		
		JLabel label_7 = new JLabel("Source IP");
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		label_7.setBounds(73, 140, 79, 16);
		add(label_7);
		
		textSrc = new JTextField();
		textSrc.setColumns(10);
		textSrc.setBounds(164, 135, 130, 26);
		add(textSrc);
		
		JLabel label_8 = new JLabel("Destination IP");
		label_8.setHorizontalAlignment(SwingConstants.TRAILING);
		label_8.setBounds(64, 173, 88, 16);
		add(label_8);
		
		textDest = new JTextField();
		textDest.setColumns(10);
		textDest.setBounds(164, 168, 130, 26);
		add(textDest);
	}

}
