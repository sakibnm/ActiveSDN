package com.nsakib.activesdn.Views.Event;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TCPPanel extends JPanel {
	JTextField textSrcPort;
	JTextField textDestPort;
	JTextField textSeq;
	JTextField textWindow;
	JTextField textCount;

	/**
	 * Create the panel.
	 */
	public TCPPanel() {
		setLayout(null);
		setBounds(6, 51, 438, 328);
		
		JLabel label = new JLabel("Attributes");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label.setBounds(36, 29, 79, 16);
		add(label);
		
		textSrcPort = new JTextField();
		textSrcPort.setColumns(10);
		textSrcPort.setBounds(206, 52, 159, 26);
		add(textSrcPort);
		
		JLabel lblSourcePort = new JLabel("Source port");
		lblSourcePort.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSourcePort.setBounds(66, 57, 122, 16);
		add(lblSourcePort);
		
		JLabel lblDestinationPort = new JLabel("Destination port");
		lblDestinationPort.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDestinationPort.setBounds(36, 90, 152, 16);
		add(lblDestinationPort);
		
		textDestPort = new JTextField();
		textDestPort.setColumns(10);
		textDestPort.setBounds(206, 85, 159, 26);
		add(textDestPort);
		
		textSeq = new JTextField();
		textSeq.setColumns(10);
		textSeq.setBounds(206, 118, 159, 26);
		add(textSeq);
		
		JLabel lblSequenceNumber = new JLabel("Sequence number");
		lblSequenceNumber.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSequenceNumber.setBounds(66, 123, 122, 16);
		add(lblSequenceNumber);
		
		JLabel label_4 = new JLabel("Pattern");
		label_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_4.setBounds(36, 232, 79, 16);
		add(label_4);
		
		JLabel label_5 = new JLabel("Window");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(98, 260, 79, 16);
		add(label_5);
		
		JLabel label_6 = new JLabel("Count");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(285, 260, 79, 16);
		add(label_6);
		
		textWindow = new JTextField();
		textWindow.setColumns(10);
		textWindow.setBounds(79, 281, 130, 26);
		add(textWindow);
		
		textCount = new JTextField();
		textCount.setColumns(10);
		textCount.setBounds(267, 281, 130, 26);
		add(textCount);
	}

}
