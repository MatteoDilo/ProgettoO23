package it.unipv.sfw.controller.logincontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import it.unipv.sfw.model.albergo.IntAlbergo;
import it.unipv.sfw.model.persona.Cliente;
import it.unipv.sfw.model.persona.Dipendente;
import it.unipv.sfw.model.persona.IAccount;
import it.unipv.sfw.model.persona.TipoAccount;
import it.unipv.sfw.view.PopUp;
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
		String username = view.getLoginPanel().getUsername().getText();
		String pw = String.valueOf(view.getLoginPanel().getPassword().getPassword());	
		boolean isMatching = model.login(username, pw);  
		
		if(isMatching) {
			view.getLoginPanel().setVisible(false);	
			IAccount acc = model.getUsername().get(username);
			TipoAccount tipoAcc = acc.getTipoAcc();
			//model.aggiornaPrenotazioni();
			model.setUtenteCorrente(username);
			
			switch(tipoAcc) {
			case DI: 
				view.getLoginPanel().setVisible(false);
				view.getDipendentePanel().setVisible(true);
				Dipendente d = (Dipendente) acc;
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.getContentPane().setLayout(null);
				view.getDipendentePanel().setNome(d.getNome());
				view.getDipendentePanel().setCognome(d.getCognome());
				view.getDipendentePanel().setCf(d.getUsername());

			case CL:
				view.getLoginPanel().setVisible(false);
				view.getClientePanel().setVisible(true);
				Cliente c =(Cliente)acc;		
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.getContentPane().setLayout(null);
				view.getClientePanel().setNome(c.getNome());
				view.getClientePanel().setCognome(c.getCognome());
				view.getClientePanel().setCf(c.getUsername());
			default:
				break;				
			}
		}else {
			PopUp.infoBox("Username o password incorretti", "Errore");
			pulisciTextField();
		}
		
	}

	private void pulisciTextField() {
		view.getLoginPanel().getUsername().setText(null);
		view.getLoginPanel().getPassword().setText(null);
	}

}
