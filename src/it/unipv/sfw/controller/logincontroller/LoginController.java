package it.unipv.sfw.controller.logincontroller;

import it.unipv.sfw.model.albergo.IntAlbergo;
import it.unipv.sfw.view.ViewController;


public class LoginController {
	private ViewController view;
	private IntAlbergo model;
	private BtnAccediActionListener accedi;

	public LoginController(IntAlbergo model, ViewController view) {

		this.view = view; 
		this.model = model;

		accedi = new BtnAccediActionListener(model, view);
		view.getLoginPanel().getBtnAccedi().addActionListener(accedi);

	}

	public BtnAccediActionListener getaccedi() {
		return accedi;
	}

}
