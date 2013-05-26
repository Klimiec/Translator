package com.piotrek.testy;

import java.awt.EventQueue;

import com.piotrek.controller.Controller;
import com.piotrek.gui.AppWindow;

public class Test {

	public static void main(String[] args) {

		/*
		 *  CONTROLLER : 
		 */
		final Controller controller = new Controller();
		System.out.println("Controller - OK");
		
		
		/*
		 * VIEW : 
		 */
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				AppWindow frame = new AppWindow(controller);
				frame.setVisible(true);
			}
		};
		EventQueue.invokeLater(runnable);
		System.out.println("View - OK");
		
	}
}
