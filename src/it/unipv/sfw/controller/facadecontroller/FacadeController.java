package it.unipv.sfw.controller.facadecontroller;


import it.unipv.sfw.controller.logincontroller.LoginController;
import it.unipv.sfw.controller.prenotazione.PrenotazioneController;
import it.unipv.sfw.model.albergo.IntAlbergo;
import it.unipv.sfw.view.ViewController;

public class FacadeController {
	
	public FacadeController(IntAlbergo model, ViewController view) {
		
		new LoginController(model, view);
		//new RegistrazioneController(model, view);
		new PrenotazioneController(model, view);
		
	}	
}
