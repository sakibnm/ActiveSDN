package com.nsakib.activesdn.Controller.Event;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import com.nsakib.activesdn.Views.Event.CreateEventWizard;

public class EventPaneActions{
	JButton buttonCreateEvent;
	JScrollPane scrollPaneEvent;
	
	public EventPaneActions(JButton buttonCreate, JScrollPane scrollEvent) {
		// TODO Auto-generated constructor stub
		this.buttonCreateEvent = buttonCreate;	
		this.scrollPaneEvent = scrollEvent;
	}
	
	public void createEventListener() {
		buttonCreateEvent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CreateEventWizard window = new CreateEventWizard();
							window.frmCreateAnEvent.setVisible(true);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});		
	}

}
