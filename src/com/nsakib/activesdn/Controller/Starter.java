package com.nsakib.activesdn.Controller;

import java.awt.EventQueue;

import com.nsakib.activesdn.Controller.Event.EventPaneActions;
import com.nsakib.activesdn.Views.MainScreenGUI;

public class Starter {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreenGUI mainScreen = new MainScreenGUI();
					mainScreen.frame.setVisible(true);
					
					//Create Event Actions....
					EventPaneActions eventPaneAct = new EventPaneActions(mainScreen.getButtonCreateEvent(),mainScreen.getScrollPaneEvent());
					eventPaneAct.createEventListener();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
