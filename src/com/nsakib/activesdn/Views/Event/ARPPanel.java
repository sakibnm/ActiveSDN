package com.nsakib.activesdn.Views.Event;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class ARPPanel extends JPanel {
	JTextField textProto;
	JTextField textSrcMac;
	JTextField textSrcIP;
	JTextField textDestMac;
	JTextField textDestIP;

	/**
	 * Create the panel.
	 */
	public ARPPanel() {
		setLayout(null);
		setBounds(6, 51, 438, 328);
		
		JLabel lblProtocol = new JLabel("Protocol");
		lblProtocol.setHorizontalAlignment(SwingConstants.TRAILING);
		lblProtocol.setBounds(127, 89, 79, 16);
		add(lblProtocol);
		
		textProto = new JTextField();
		textProto.setColumns(10);
		textProto.setBounds(218, 84, 130, 26);
		add(textProto);
		
		JLabel lblSourceMac = new JLabel("Source Mac");
		lblSourceMac.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSourceMac.setBounds(127, 122, 79, 16);
		add(lblSourceMac);
		
		textSrcMac = new JTextField();
		textSrcMac.setColumns(10);
		textSrcMac.setBounds(218, 117, 130, 26);
		add(textSrcMac);
		
		JLabel lblProtocol_1 = new JLabel("Source IP");
		lblProtocol_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblProtocol_1.setBounds(127, 155, 79, 16);
		add(lblProtocol_1);
		
		textSrcIP = new JTextField();
		textSrcIP.setColumns(10);
		textSrcIP.setBounds(218, 150, 130, 26);
		add(textSrcIP);
		
		JLabel lblDestinationMac = new JLabel("Destination Mac");
		lblDestinationMac.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDestinationMac.setBounds(90, 188, 116, 16);
		add(lblDestinationMac);
		
		textDestMac = new JTextField();
		textDestMac.setColumns(10);
		textDestMac.setBounds(218, 183, 130, 26);
		add(textDestMac);
		
		JLabel label_4 = new JLabel("Destination IP");
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setBounds(118, 221, 88, 16);
		add(label_4);
		
		textDestIP = new JTextField();
		textDestIP.setColumns(10);
		textDestIP.setBounds(218, 216, 130, 26);
		add(textDestIP);
		
		JLabel label_5 = new JLabel("Attributes");
		label_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_5.setBounds(61, 56, 79, 16);
		add(label_5);
		
	}

}
