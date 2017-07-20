package com.nsakib.activesdn.Views.Event;

import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JTextField;

public class CreateEventWizard {

	public JFrame frmCreateAnEvent;
	public JPanel panel;
	public JButton btnSave;
	public JButton btnReset;
	private JTextField textName;
	private JComboBox comboBox;
	
	public CreateEventWizard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreateAnEvent = new JFrame();
		frmCreateAnEvent.setTitle("Create an Event Wizard");
		frmCreateAnEvent.setBounds(100, 100, 450, 450);
		frmCreateAnEvent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCreateAnEvent.getContentPane().setLayout(null);
		
		JLabel lblSelectEventType = new JLabel("Select Event Type");
		lblSelectEventType.setBounds(66, 42, 116, 16);
		frmCreateAnEvent.getContentPane().add(lblSelectEventType);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose one…", "IP", "TCP", "IGMP", "ICMP", "ARP"}));
		comboBox.setBounds(194, 38, 163, 27);
		frmCreateAnEvent.getContentPane().add(comboBox);
		//Selecting type and changing the Pane.....
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 65, 438, 12);
		frmCreateAnEvent.getContentPane().add(separator);
		
		btnSave = new JButton("Save");
		btnSave.setEnabled(false);
		btnSave.setBounds(66, 388, 117, 29);
		frmCreateAnEvent.getContentPane().add(btnSave);
		
		btnReset = new JButton("Reset");
		btnReset.setEnabled(false);
		btnReset.setBounds(264, 388, 117, 29);
		frmCreateAnEvent.getContentPane().add(btnReset);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(66, 14, 61, 16);
		frmCreateAnEvent.getContentPane().add(lblName);
		
		textName = new JTextField();
		textName.setBounds(139, 9, 218, 26);
		frmCreateAnEvent.getContentPane().add(textName);
		textName.setColumns(10);
		
		comboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub

				showPaneWithOptions(comboBox.getSelectedIndex());				
			}
		});
		
	}
	private void showPaneWithOptions(int pos) {
		switch(pos) {
		case 1:
			drawIPPanel();
		case 2:
			drawTCPPanel();
		case 3:
			drawIGMPPanel();
		case 4:
			drawICMPPanel();
		case 5:
			drawARPPanel();
		}
	}
	
	private void drawARPPanel() {
		// TODO Auto-generated method stub
		ARPPanel container = new ARPPanel();
		container.setBounds(6, 51, 438, 371);
//		panel.add(container);
		frmCreateAnEvent.getContentPane().add(container);
		btnSave.setEnabled(true);
		btnReset.setEnabled(true);
		
		//Clicking on Reset button resets everything.......
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textName.setText("");
				comboBox.setSelectedIndex(0);
				container.textDestIP.setText("");
				container.textDestMac.setText("");
				container.textSrcMac.setText("");
				container.textProto.setText("");
				container.textSrcIP.setText("");
			}
		});
		frmCreateAnEvent.revalidate();
		frmCreateAnEvent.repaint();
	}

	private void drawICMPPanel() {
		// TODO Auto-generated method stub
		ICMPPanel container = new ICMPPanel();
		container.setBounds(6, 51, 438, 371);
//		panel.add(container);
		frmCreateAnEvent.getContentPane().add(container);
		btnSave.setEnabled(true);
		btnReset.setEnabled(true);
		
		//Clicking on Reset button resets everything.......
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textName.setText("");
				comboBox.setSelectedIndex(0);
				container.textCount.setText("");
				container.textDest.setText("");
				container.textProto.setText("");
				container.textSrc.setText("");
				container.textTos.setText("");
				container.textTtl.setText("");
				container.textWindow.setText("");
				
			}
		});
		frmCreateAnEvent.revalidate();
		frmCreateAnEvent.repaint();
		//frmCreateAnEvent.pack();
	}

	private void drawIGMPPanel() {
		// TODO Auto-generated method stub
		IGMPPanel container = new IGMPPanel();
		container.setBounds(6, 51, 438, 371);
//		panel.add(container);
		frmCreateAnEvent.getContentPane().add(container);
		btnSave.setEnabled(true);
		btnReset.setEnabled(true);
		
		//Clicking on Reset button resets everything.......
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textName.setText("");
				comboBox.setSelectedIndex(0);
				container.textCount.setText("");
				container.textDest.setText("");
				container.textProto.setText("");
				container.textSrc.setText("");
				container.textTos.setText("");
				container.textTtl.setText("");
				container.textWindow.setText("");
				
			}
		});
		frmCreateAnEvent.revalidate();
		frmCreateAnEvent.repaint();
		//frmCreateAnEvent.pack();
	}
	

	private void drawTCPPanel() {
		// TODO Auto-generated method stub
		TCPPanel container = new TCPPanel();
		container.setBounds(6, 51, 438, 371);
//		panel.add(container);
		frmCreateAnEvent.getContentPane().add(container);
		btnSave.setEnabled(true);
		btnReset.setEnabled(true);
		
		//Clicking on Reset button resets everything.......
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textName.setText("");
				comboBox.setSelectedIndex(0);
				container.textCount.setText("");
				container.textWindow.setText("");
				container.textSrcPort.setText("");
				container.textDestPort.setText("");
				container.textSeq.setText("");
				
			}
		});
		frmCreateAnEvent.revalidate();
		frmCreateAnEvent.repaint();
		
	}

	private void drawIPPanel() {
		IPPanel container = new IPPanel();
		container.setBounds(6, 51, 438, 371);
//		panel.add(container);
		frmCreateAnEvent.getContentPane().add(container);
		btnSave.setEnabled(true);
		btnReset.setEnabled(true);
		
		//Clicking on Reset button resets everything.......
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textName.setText("");
				comboBox.setSelectedIndex(0);
				container.textCount.setText("");
				container.textDest.setText("");
				container.textProto.setText("");
				container.textSrc.setText("");
				container.textTos.setText("");
				container.textTtl.setText("");
				container.textWindow.setText("");
				
			}
		});
		frmCreateAnEvent.revalidate();
		frmCreateAnEvent.repaint();
		//frmCreateAnEvent.pack();
	}
}
