package it.unipv.sfw.controller.logincontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.sfw.model.albergo.IntAlbergo;
import it.unipv.sfw.view.ViewController;

public class BtnAccediActionListener implements ActionListener {

	private ViewController view;
	private IntAlbergo model;

	public BtnAccediActionListener (IntAlbergo model, ViewController view) {
		super();
		this.view = view;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cf = view.getLoginPanel().getUsernameText().getText();
		String pw = String.valueOf(view.getLoginPanel().getPasswordField().getPassword());	
		boolean isMatching = model.login(cf, pw);  
		
		if(isMatching) {
			//va implementato il login
		}
	}
}
