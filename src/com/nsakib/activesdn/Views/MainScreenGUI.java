package com.nsakib.activesdn.Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MainScreenGUI {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainScreenGUI window = new MainScreenGUI();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public MainScreenGUI() {
		initialize();
	}
	//Declaring the variables.....
	
	JButton buttonCreateEvent = new JButton("Create New Event");
	JButton buttonCreateCoA = new JButton("Create New Course of Action");
	JButton buttonCreateClips = new JButton("Create New CLIPS rule");
	
	JScrollPane scrollPaneEvent = new JScrollPane();
	JScrollPane scrollPaneCoA = new JScrollPane();
	JScrollPane scrollPaneClips = new JScrollPane();

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 900, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);
		
		mntmClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 296, 611);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//JButton buttonCreateEvent = new JButton("Create New Event");
		ImageIcon createIcon = new ImageIcon("media/images/add.png");
		buttonCreateEvent.setIcon(createIcon);
		buttonCreateEvent.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		buttonCreateEvent.setBounds(19, 44, 242, 75);
		panel.add(buttonCreateEvent);
		
		JLabel lblNewLabel = new JLabel("Event Specs");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(19, 16, 242, 16);
		panel.add(lblNewLabel);
		
		//JScrollPane scrollPaneEvent = new JScrollPane();
		scrollPaneEvent.setBounds(6, 131, 284, 474);
		panel.add(scrollPaneEvent);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(304, 6, 296, 611);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		//JButton buttonCreateCoA = new JButton("Create New Course of Action");
		buttonCreateCoA.setIcon(createIcon);
		buttonCreateCoA.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		buttonCreateCoA.setBounds(21, 44, 263, 75);
		panel_1.add(buttonCreateCoA);
		
		JLabel lblCourseOfAction = new JLabel("Course of Action");
		lblCourseOfAction.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseOfAction.setForeground(Color.DARK_GRAY);
		lblCourseOfAction.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCourseOfAction.setBackground(Color.WHITE);
		lblCourseOfAction.setBounds(31, 17, 242, 16);
		panel_1.add(lblCourseOfAction);
		
		//JScrollPane scrollPaneCoA = new JScrollPane();
		scrollPaneCoA.setBounds(6, 131, 284, 474);
		panel_1.add(scrollPaneCoA);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(603, 6, 291, 611);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		//JButton buttonCreateClips = new JButton("Create New CLIPS rule");
		buttonCreateClips.setIcon(createIcon);
		buttonCreateClips.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		buttonCreateClips.setBounds(22, 43, 242, 75);
		panel_2.add(buttonCreateClips);
		
		JLabel lblClipsRule = new JLabel("CLIPS Rule");
		lblClipsRule.setHorizontalAlignment(SwingConstants.CENTER);
		lblClipsRule.setForeground(Color.DARK_GRAY);
		lblClipsRule.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblClipsRule.setBackground(Color.WHITE);
		lblClipsRule.setBounds(22, 17, 242, 16);
		panel_2.add(lblClipsRule);
		
		//JScrollPane scrollPaneClips = new JScrollPane();
		scrollPaneClips.setBounds(6, 130, 279, 474);
		panel_2.add(scrollPaneClips);
	}

	public JButton getButtonCreateEvent() {
		return buttonCreateEvent;
	}

	public void setButtonCreateEvent(JButton buttonCreateEvent) {
		this.buttonCreateEvent = buttonCreateEvent;
	}

	public JButton getButtonCreateCoA() {
		return buttonCreateCoA;
	}

	public void setButtonCreateCoA(JButton buttonCreateCoA) {
		this.buttonCreateCoA = buttonCreateCoA;
	}

	public JButton getButtonCreateClips() {
		return buttonCreateClips;
	}

	public void setButtonCreateClips(JButton buttonCreateClips) {
		this.buttonCreateClips = buttonCreateClips;
	}

	public JScrollPane getScrollPaneEvent() {
		return scrollPaneEvent;
	}

	public void setScrollPaneEvent(JScrollPane scrollPaneEvent) {
		this.scrollPaneEvent = scrollPaneEvent;
	}

	public JScrollPane getScrollPaneCoA() {
		return scrollPaneCoA;
	}

	public void setScrollPaneCoA(JScrollPane scrollPaneCoA) {
		this.scrollPaneCoA = scrollPaneCoA;
	}

	public JScrollPane getScrollPaneClips() {
		return scrollPaneClips;
	}

	public void setScrollPaneClips(JScrollPane scrollPaneClips) {
		this.scrollPaneClips = scrollPaneClips;
	}
	
}
