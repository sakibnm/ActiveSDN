package com.nsakib.activesdn.Views.Event;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class IPPanel extends JPanel {
	JTextField textTos;
	JTextField textTtl;
	JTextField textProto;
	JTextField textSrc;
	JTextField textDest;
	JTextField textWindow;
	JTextField textCount;

	/**
	 * Create the panel.
	 */
	public IPPanel() {
		setLayout(null);
		setBounds(6, 51, 438, 328);
		
		JLabel lblAttributes = new JLabel("Attributes");
		lblAttributes.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAttributes.setBounds(32, 29, 79, 16);
		add(lblAttributes);
		
		JLabel lblTos = new JLabel("TOS");
		lblTos.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTos.setBounds(62, 52, 79, 16);
		add(lblTos);
		
		textTos = new JTextField();
		textTos.setBounds(153, 47, 130, 26);
		add(textTos);
		textTos.setColumns(10);
		
		JLabel lblTtl = new JLabel("TTL");
		lblTtl.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTtl.setBounds(62, 85, 79, 16);
		add(lblTtl);
		
		textTtl = new JTextField();
		textTtl.setColumns(10);
		textTtl.setBounds(153, 80, 130, 26);
		add(textTtl);
		
		JLabel lblProtocol = new JLabel("Protocol");
		lblProtocol.setHorizontalAlignment(SwingConstants.TRAILING);
		lblProtocol.setBounds(62, 118, 79, 16);
		add(lblProtocol);
		
		textProto = new JTextField();
		textProto.setColumns(10);
		textProto.setBounds(153, 113, 130, 26);
		add(textProto);
		
		JLabel lblSourceIp = new JLabel("Source IP");
		lblSourceIp.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSourceIp.setBounds(62, 151, 79, 16);
		add(lblSourceIp);
		
		textSrc = new JTextField();
		textSrc.setColumns(10);
		textSrc.setBounds(153, 146, 130, 26);
		add(textSrc);
		
		JLabel lblDestinationIp = new JLabel("Destination IP");
		lblDestinationIp.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDestinationIp.setBounds(53, 184, 88, 16);
		add(lblDestinationIp);
		
		textDest = new JTextField();
		textDest.setColumns(10);
		textDest.setBounds(153, 179, 130, 26);
		add(textDest);
		
		JLabel lblPattern = new JLabel("Pattern");
		lblPattern.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPattern.setBounds(32, 245, 79, 16);
		add(lblPattern);
		
		JLabel lblWindow = new JLabel("Window");
		lblWindow.setHorizontalAlignment(SwingConstants.CENTER);
		lblWindow.setBounds(94, 273, 79, 16);
		add(lblWindow);
		
		textWindow = new JTextField();
		textWindow.setColumns(10);
		textWindow.setBounds(75, 294, 130, 26);
		add(textWindow);
		
		textCount = new JTextField();
		textCount.setColumns(10);
		textCount.setBounds(263, 294, 130, 26);
		add(textCount);
		
		JLabel lblCount = new JLabel("Count");
		lblCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCount.setBounds(281, 273, 79, 16);
		add(lblCount);

	}

}
